package restTests;

import configuration.Configuration;
import configuration.EndPoints;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PortfolioTest extends Configuration {


    @Test
    public void checkStatusOfCertificates(){
        Response response =
                given().header("Authorization", getToken())
                        .body("{\n" +
                                "    \"gsrn\": \"\",\n" +
                                "    \"certificateTypes\": null,\n" +
                                "    \"sources\": null,\n" +
                                "    \"ages\": null,\n" +
                                "    \"countryIds\": null,\n" +
                                "    \"productionYear\": null,\n" +
                                "    \"productionStartDate\": null,\n" +
                                "    \"productionEndDate\": null,\n" +
                                "    \"dateRangeType\": null,\n" +
                                "    \"scales\": null,\n" +
                                "    \"supports\": null,\n" +
                                "    \"regionIds\": [11],\n" +
                                "    \"labelIds\": null,\n" +
                                "    \"fromDate\": null,\n" +
                                "    \"atDate\": null\n" +
                                "}")
                        .when().post(EndPoints.portfolioStatus).prettyPeek();
        response
                .then().statusCode(200);
    }
}
