package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SourcingOrdersController extends Configuration {


    @Step("Get all Sourcing Orders")
    public void getAllSourcingOrders(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.sourcingOrders);
        response
                .then().statusCode(200);
    }

    @Step("Get Specific Sourcing Order")
    public void getSpecificOrder(){
        
    }


}
