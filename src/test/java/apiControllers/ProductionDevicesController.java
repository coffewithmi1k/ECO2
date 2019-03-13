package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import resources.CompaniesJsons;

import static io.restassured.RestAssured.given;

public class ProductionDevicesController extends Configuration {

CompaniesJsons companiesJsons = new CompaniesJsons();

@Step("Get all production Devices")
public void getAllProductionDevices(){
    Response response =
            given().header("Authorization", getToken())
                    .when().get(EndPoints.productionDevices);
    response
            .then().statusCode(200);
}

@Step("get all production Devices Extendent")
    public void getAllProductionDevicesExtendent(){
    Response response =
            given().header("Authorization", getToken())
                    .when().get(EndPoints.productionDevices+"extendent");
    response
            .then().statusCode(200);
}
@Step("Get Specific Production Device by ID")
    public void getProductionDeviceByID(int ID){
    Response response =
            given().header("Authorization", getToken())
                    .when().get(EndPoints.productionDevices+ID);
    response
            .then().statusCode(200);
}
@Step("Get specific production Device by GSRN")
    public void getProductionDeviceByGSRN(String gsrn){
    Response response =
            given().header("Authorization", getToken())
                    .when().get(EndPoints.productionDevices+gsrn);
    response
            .then().statusCode(200);
}
@Step("Create Production Device")
    public void createProductionDevice(String body){
    Response response =
            given().header("Authorization", getToken())
                    .body(body)
                    .when().post(EndPoints.productionDevices);
    response
            .then().statusCode(200);
}
@Step("Delete newly created Production Device")
    public void deleteNewlyCreatedProductionDevice(){
    
}

}
