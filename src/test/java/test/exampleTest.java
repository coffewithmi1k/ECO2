package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.Date;
import static io.restassured.RestAssured.given;


public class exampleTest extends Config {

    @Test
    public void myFirstTest() {
        Response response =
                given().header("Authorization", getToken())
                        .when().get(ExampleEndPoints.companies);
        response.then().statusCode(200);
    }

    @Test
    public void addCompany() {
Response response =
        given()
        .header("Authorization",getToken())
                .body(addNewCompany)
        .when().post(ExampleEndPoints.companies);
response.then().statusCode(200);

    }

    @Test
    public void testMethod(){

    }

}
