package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class CompaniesController extends Configuration {

CompaniesJsons companiesJsons = new CompaniesJsons();

    @Step("Get all Companies")
    public int getAllCompanies() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.companies);
        response.then().statusCode(200)
                .body("id[0]",greaterThan(1))
                .body("name[0]",notNullValue());
       int companyID =response.path("id[0]");
       return companyID;
    }

    @Step("Create Company")
    public String createCompany(String body) {
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.companies);
        response.then().statusCode(200)
                .body(notNullValue());

    String  companyID = response.getBody().asString();
        return  companyID;
    }

    @Step("Delete Company")
    public void CheckDeleteCompany(){
        String companyID = createCompany(companiesJsons.getAddNewCompany());
        Response response =
                given().header("Authorization", getToken())
                        .when().delete(EndPoints.companies+companyID);
        response.then().statusCode(200)
                .body(equalTo("true"));
    }
    @Step("Get specific company")
    public void getSpecificCompany(int ID){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.companies+ID);
        response.then().statusCode(200)
                .body("id",greaterThan(0))
                .body("name",notNullValue());
    }
}
