package apiControllers;

import com.sun.istack.NotNull;
import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.hasItem;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class PositionDataController extends Configuration {

    @Step("Get positions Data")
    public void getPositionsData(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.positionsData);
        response.then()
                .statusCode(200)
                .body("id",notNullValue());

    }

    @Step("Add positions Data")
    public void addPositionsData(){

    }

    @Step("Get positions data portfolio")
    public void getPositionsDataPortfolio(){
        Response response =
                given().header("Authorization", getToken())
                        .params("startYear","2018","endYear","2019")
                        .when().get(EndPoints.positionsData+"portfolio");
        response.then()
                .statusCode(200);
    }
}
