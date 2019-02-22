package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GroupController extends Configuration {

    @Step("Check my Groups")
    public void checkMyGroups(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.myGroups);
        response.then().statusCode(200);
    }
}
