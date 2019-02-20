package test;

import io.restassured.response.Response;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Date;

import static io.restassured.RestAssured.given;


public class exampleTest extends Config {

    @Test
    public void myFirstTest() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(ExampleEndPoints.companies).prettyPeek();
        response.then().statusCode(200);
    }

    @Test
    public void addCompany() {
Response response =
        given()
        .header("Authorization",getToken())
                .body(addNewCompany)
        .when().post(ExampleEndPoints.companies).prettyPeek();
response.then().statusCode(200);
    }

}
