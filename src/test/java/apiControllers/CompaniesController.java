package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import test.ExampleEndPoints;

import static io.restassured.RestAssured.given;

public class CompaniesController extends Configuration {

    int companyID;

    @Step("Get all Companies")
    public void getAllCompanies() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.companies);
        response.then().statusCode(200);
    }

    @Step("Create Company")
    public void createCompany(String body) {
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.companies);
        response.then().statusCode(200);
    }

    @Step("Edit Company")
    public void editCompany() {
        String editCompany = "{\n" +
                "  \"contacts\": [],\n" +
                "  \"id\": 1865,\n" +
                "  \"name\": \"1\",\n" +
                "  \"businessID\": \"\",\n" +
                "  \"city\": null,\n" +
                "  \"zipCode\": null,\n" +
                "  \"organizationNumber\": \"122-112\",\n" +
                "  \"countryID\": null,\n" +
                "  \"indirectOwnerID\": null,\n" +
                "  \"notes\": null,\n" +
                "  \"isVendor\": false,\n" +
                "  \"mamutVendorNo\": null,\n" +
                "  \"countryName\": \"Lviv\",\n" +
                "  \"street\": null,\n" +
                "  \"lastUpdatedAt\": \"2018-06-18T08:47:33.197Z\",\n" +
                "  \"updatedBy\": \"coffe!\"\n" +
                "}";


    }
}
