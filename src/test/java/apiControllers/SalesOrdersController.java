package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;

import static io.restassured.RestAssured.given;

public class SalesOrdersController extends Configuration {
    CompaniesJsons companiesJsons = new CompaniesJsons();


    @Step("Get all sales Orders")
    public void getAllSalesOrders() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.salesOrders);
        response
                .then().statusCode(200);
    }

    @Step("Get specific sales order")
    public void getSpecificOrder(int ID){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.salesOrders+ID);
        response
                .then().statusCode(200);
    }
    @Step("Create New sales Order")
    public String createNewSalesOrder(String body){
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.salesOrders);
        response
                .then().statusCode(200);
        String orderID = response.getBody().asString();
        return  orderID;
    }

}
