package apiControllers;

import configuration.Configuration;
import configuration.EndPoints;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CertificateStatisticsController extends Configuration {


    @Step("Get Certificates Statistics")
    public void getCertificatesStatistics(){
        Response response =
                given().header("Authorization", getToken())
                        .when().get(EndPoints.certificatesStatistics);
        response.then().statusCode(200);
      //response.then().body("perLabel[0].name", equalTo("Blue E"));

        //response.prettyPeek();
        System.out.println(response.path("perLabel[0].name")+" Look  here<<<<<<<<<<<<<<<<");

    }
}
