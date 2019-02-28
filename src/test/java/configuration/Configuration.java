package configuration;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import javax.xml.ws.Response;
import java.util.Date;

public class Configuration {

    private final static String basePath = "https://ecohz-online-api-dev.azurewebsites.net/api/";

    @Step("Test setup")
    @BeforeSuite
    public void setUp() {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri(basePath)
                .setContentType("application/json")
                .log(LogDetail.ALL)
                .build();
        RestAssured.requestSpecification = requestSpec;

    }

    public String getToken() {
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUxMzczNTcyLCJuYmYiOjE1NTEzNzM1NzIsImV4cCI6MTU1MTM3NzQ3MiwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQUNybmdwRjg0QlVGSVNlVlFKVVRMd0JZaVUyVWFBeDAxSFQrQ2J4TjJ2QjNaQlR0Y0diaWFRWW9aOHN5c2lHV0RlUmRZYTA2TlFGb0NiZ2pzNVRpVEtnPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxMDkuMjUxLjE4NS4yNyIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoiQUJqLV90MXUzRU9HZW02ZEZ6SXdBQSIsInZlciI6IjEuMCJ9.oxucIWHkfP3KhJaCLIDgrR9xAMDMzhBNo028Ty5EoCErW6Sl3KADlb3W-zTHLvWn_VtgElJXceTy71wj9P3f2NAhetupPj0cVx-AzA_CC-nSp2GyuXdjus4kI-ki4z_PZBUnqbxdj6-NoLsxfx472k5Ma_du0eNDu3MEZZgg2VHgEPzwUA8CxSCtQRU-4u1a1Qyi84m5Sd21Dp2QnsYf2Dl3G4shXM1mapBLnZCTdCe7jy5-wfTkQlrO7n5P" +
                "ehVYL8nScMIeTwdAxTqrqZ_XT83_OMMSHq4ejzOcENSUltTxXz5vajk9V3vEDdnABXXsjmfoAkSH9rKi0AFtw2II9Q";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
