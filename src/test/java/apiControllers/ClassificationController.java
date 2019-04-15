package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

public class ClassificationController extends Configuration {


    @Step("Get classification fuels")
    public void getClassificationFuels(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.classification+"fuels");
             response.then()
                     .statusCode(200)
                     .body("fullCode", hasItem("F01000000"));

    }

    @Step("Get classification technologies")
    public void getClassificationTechnologies(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.classification+"technologies");
        response.then()
                .statusCode(200)
                .body("fullCode", hasItem("T010000"));
    }
}
