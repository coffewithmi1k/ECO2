package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;

import static io.restassured.RestAssured.given;

public class LabelsController extends Configuration {

    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Step("get all labels")
    public int getAllLabels(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.labels);
        response
                .then().statusCode(200);
        int labelID = response.path("id[0]");
        return labelID;

    }
    @Step("Get specific label")
    public void getSpecificLabel(int id){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.labels+id);
        response
                .then().statusCode(200);

    }
    @Step("Create new Label")
    public String createNewLabel(String body){
        Response response =
                given().header("Authorization", getToken())
                        .body(body)
                        .when().post(EndPoints.labels);
        response
                .then().statusCode(200);
        String labelID = response.getBody().asString();
        System.out.println("Label is created Successfully with ID "+labelID);
        return labelID;
    }

    @Step("Delete new label")
    public void deleteNewLabel(){
        String labelID = createNewLabel(companiesJsons.getNewLabel());
        Response response =
                given().header("Authorization", getToken())

                        .when().delete(EndPoints.labels+labelID);
        response
                .then().statusCode(200);
        System.out.println("Label is deleted with ID "+labelID);

    }
}
