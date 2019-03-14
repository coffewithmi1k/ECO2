package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
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

@Step("get all production Devices Extended")
    public void getAllProductionDevicesExtendend(){
    Response response =
            given().header("Authorization", getToken())
                    .when().get(EndPoints.productionDevices+"extended");
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
                    .when().get(EndPoints.productionDevices+"/productionDeviceId/"+gsrn);
    response
            .then().statusCode(200);
}
@Step("Create Production Device")
    public String createProductionDevice(String body){
    Response response =
            given().header("Authorization", getToken())
                    .body(body)
                    .when().post(EndPoints.productionDevices);
    response
            .then().statusCode(200);
    String deviceID = response.getBody().asString();
    System.out.println(deviceID+" Here is your created Production Device!!!!");
    return deviceID;
}
@Step("Delete newly created Production Device")
    public void deleteNewlyCreatedProductionDevice(){
String deviceID = createProductionDevice(companiesJsons.addNewProductionDevice());
    Response response =
            given().header("Authorization", getToken())
                    .when().delete(EndPoints.productionDevices+deviceID);
    response
            .then().statusCode(200);
    System.out.println("Production device is deleted with ID "+deviceID);
}

}
