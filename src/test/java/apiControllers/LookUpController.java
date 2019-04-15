package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

public class LookUpController extends Configuration {

    @Step("Get lookUp items")
    public void getLookUpItems(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.lookUp);
        response.then().statusCode(200)
                .body("countries.name", hasItem("ALBANIA"));

    }
}
