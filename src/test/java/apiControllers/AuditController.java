package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuditController extends Configuration {
    @Step("Get Interaction Logs for selected period")
    public void getInteractionLogsForPeriod(){
        Response response =
                given().header("Authorization", getToken())
                        .param("from","2019-03-19T08:51:46.283Z")
                        .param("to","2019-03-26T10:30:17.513Z")
                        .params("user","","dataEntity","")
                        .when().get(EndPoints.audit);
        response.then().statusCode(200);
    }
}
