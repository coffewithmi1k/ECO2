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
                        .when().get(EndPoints.certificatesStatistics).prettyPeek();
        response.then().statusCode(200)
                .body("perCountry.name", hasItem("Finland"))
                .body("perSource.name",hasItem("Wind"))
               .body("perSource.count[0]",greaterThan(1));


    }
}
