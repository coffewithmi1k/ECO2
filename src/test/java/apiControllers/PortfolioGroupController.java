package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;

import static io.restassured.RestAssured.given;

public class PortfolioGroupController extends Configuration {
    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Step("Get all portfolio Groups")
    public int getAllPortfolioGroups() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.portfolioGroups);
        response
                .then().statusCode(200);
        int portfolioGroupId = response.path("id[0]");
        return portfolioGroupId;
    }

    @Step("Get specific group")
    public void getSpecificPortfolioGroup(int ID) {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.portfolioGroups + ID);
        response
                .then().statusCode(200);
    }

    @Step("Create Portfolio Group")
    public String createPortfolioGroup(String body) {
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.portfolioGroups);
        response
                .then().statusCode(200);
        String ID = "";
        return ID;
    }
}
