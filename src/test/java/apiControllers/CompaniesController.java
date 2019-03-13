package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.Test;
import resources.CompaniesJsons;
import test.ExampleEndPoints;

import static io.restassured.RestAssured.given;

public class CompaniesController extends Configuration {

CompaniesJsons companiesJsons = new CompaniesJsons();

    @Step("Get all Companies")
    public void getAllCompanies() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.companies);
        response.then().statusCode(200);
    }

    @Step("Create Company")
    public String createCompany(String body) {
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.companies);
        response.then().statusCode(200);

    String  companyID = response.getBody().asString();
        return  companyID;
    }

    @Step("Edit Company")
    public void editCompany(String body) {
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().put(EndPoints.companies);
        response.then().statusCode(200);
    }

    @Step("Delete Company")
    public void CheckDeleteCompany(){
        String companyID = createCompany(companiesJsons.getAddNewCompany());
        Response response =
                given().header("Authorization", getToken())
                        .when().delete(EndPoints.companies+companyID);
        response.then().statusCode(200);
System.out.println("Company is deleted with ID "+companyID);
    }
    @Step("Get specific company")
    public void getSpecificCompany(int ID){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.companies+ID);
        response.then().statusCode(200);
    }
}
