package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HealthCheckController extends Configuration {

    @Step("get health check status")
    public void getHealthCheckStatus(){
        Response response =
                given().header("Authorization", getToken())
                        .param("apikey","297591fe-e700-455f-a076-b13d2161ec3d")
                        .when().get(EndPoints.healthCheck).prettyPeek();
        response.then()
                .statusCode(200)
                .body("results.check[0].message",equalTo("Database connected"))
                .body("results.check[1].message", equalTo("Statistics database connected"))
                .body("results.check[2].message",equalTo("NECSExporter is OK"));

    }
}
