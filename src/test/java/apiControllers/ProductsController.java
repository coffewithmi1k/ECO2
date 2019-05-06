package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class ProductsController extends Configuration {

    @Step("Get all Products")
    public int getAllProducts(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.products);
        response.then().statusCode(200);

        int productID =response.path("id[0]");
        return productID;
    }

    @Step("Get specific product by ID")
    public void getSpecificProduct(int iD){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.products+iD);
        response.then().statusCode(200)
                .body("id", equalTo(iD));
    }
}
