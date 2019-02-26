package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.Test;
import test.ExampleEndPoints;

import static io.restassured.RestAssured.given;

public class CompaniesController extends Configuration {



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
    public void CheckDeleteCompany(String ID){

    }
}
