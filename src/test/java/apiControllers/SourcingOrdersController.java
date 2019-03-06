package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;
import static io.restassured.RestAssured.given;

public class SourcingOrdersController extends Configuration {

    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Step("Get all Sourcing Orders")
    public void getAllSourcingOrders(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.sourcingOrders);
        response
                .then().statusCode(200);
    }

    @Step("Get Specific Sourcing Order")
    public void getSpecificOrder(int orderID){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.sourcingOrders+orderID);
        response
                .then().statusCode(200);
    }
    @Step("Create new Sourcing Order")
    public String createSourcingOrder(String body){
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.sourcingOrders);
        response
                .then().statusCode(200);
        String sourcingOrderID = response.getBody().asString();
        return sourcingOrderID;
    }
    @Step("Delete newly Created Sourcing Order")
    public void deleteNewlyCreatedOrder(){
        String orderID = createSourcingOrder(companiesJsons.getNewSourcingOrder());
        Response response =
                given().header("Authorization", getToken())
                        .when().delete(EndPoints.sourcingOrders+orderID);
        response
                .then().statusCode(200);
        System.out.println("Order is deleted with ID "+orderID);
    }
    @Step("Edit Sourcing Order")
    public void editNewlyCreatedOrder(){

    }




}
