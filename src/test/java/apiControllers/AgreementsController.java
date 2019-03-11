package apiControllers;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

import configuration.Configuration;

import static io.restassured.RestAssured.given;

public class AgreementsController extends Configuration {

    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Step("Get all agreements")
    public void getAllAgreeements(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.agreements);
        response.then().statusCode(200);
    }
    @Step("Get specific agreement")
    public void getSpecificAgreement(int id){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.agreements+id);
        response.then().statusCode(200);
    }
    @Step("Create agreement")
    public String createAgreement(String body){
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.agreements);
        response.then().statusCode(200);
        String agreementID = response.getBody().asString();
        return agreementID;
    }
    @Step("Delete agreement")
    public void deleteAgreement(){
String agreementID = createAgreement(companiesJsons.getNewAgreement());
        Response response =
                given().header("Authorization", getToken())
                        .when().delete(EndPoints.agreements+agreementID);
        response.then().statusCode(200);
    }
    @Step("Set Production Device in Agreement")
    public void setProductionDeviceInAgreement(){

    }
}
