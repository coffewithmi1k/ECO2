package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;

import static io.restassured.RestAssured.given;

public class FeatureFactsController extends Configuration {

    CompaniesJsons companyJsons = new CompaniesJsons();

    @Step("Get all Facts")
    public void getAllfactsList(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.featureFacts);
        response
                .then().statusCode(200);
    }

    @Step("Get Specific fact")
    public void getSpecificFact(int id){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.featureFacts+id);
        response
                .then().statusCode(200);
    }

    @Step("Create new FeatureFact")
    public String createNewFact(String body){
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.featureFacts);
        response
                .then().statusCode(200);
        String factID = response.getBody().asString();
        return factID;
    }
    @Step("Delete new fact")
    public void deleteNewFact(){
        String factID = createNewFact(companyJsons.getNewFact());
        System.out.println("Fact is created with ID "+factID);
        Response response =
                given().header("Authorization", getToken())
                        .when().delete(EndPoints.featureFacts+factID);
        response
                .then().statusCode(200);
        System.out.println("Fact is deleted with ID "+factID);
    }
}
