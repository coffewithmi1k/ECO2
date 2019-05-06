package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class SalesDataController extends Configuration {
    @Step("Get all sales Data")
    public void getAllSalesData(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.salesData).prettyPeek();
        response.then().statusCode(200);
    }

    @Step("Get salesData balances")
    public void getSalesDataBalances(){
            Response response =
                    given().header("Authorization", getToken())
                            .params("startYear","2018","endYear","2019")
                            .when().get(EndPoints.salesData+"balances").prettyPeek();
            response.then().statusCode(200);
    }
    @Step("Edit sales Data")
    public void editSalesData(String body){
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().put(EndPoints.salesData).prettyPeek();
        response.then().statusCode(200);
    }

}
