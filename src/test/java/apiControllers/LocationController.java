package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LocationController extends Configuration {



    @Step("Get countries")
    public void getCountries(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.location+"countries");
        response
                .then().statusCode(200);
    }
    @Step("Get all countries")
    public void getAllCountries(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.location+"countries/all");
        response
                .then().statusCode(200);
    }
    @Step("Get all regions")
    public void getAllRegions(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.location+"regions");
        response
                .then().statusCode(200);
    }
    @Step("Get all regions which has specific country")
    public void getAllRegionsOfSelectedCountry(int countryID){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.location+"countries/"+countryID+"/regions");
        response
                .then().statusCode(200);
    }
    @Step("Get all countries from Specific Region")
    public void getAllCountriesOfRegion(int regionID){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.location+"regions/"+regionID+"/countries");
        response
                .then().statusCode(200);
    }
    @Step("Get all location certificate types")
    public void getLocationCertificateTypes(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.location+"certificatetypes");
        response
                .then().statusCode(200);
    }
}
