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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUxNzAzMDE0LCJuYmYiOjE1NTE3MDMwMTQsImV4cCI6MTU1MTcwNjkxNCwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQVN4cjdieTF4cDBwV3g2UWZDMmYwVTA2UlkxZVRaMjJwZUZmdmY1YVZ1TG1VY1VnaFNVN0VJanIvL1J2cE5GLzV6by9rN2N4Qzh6dzZCbEk4QW8vVGJBPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoiX01nczhkN2xfMC1xanlMRUp3b3pBQSIsInZlciI6IjEuMCJ9.iuToHzTaI-TumUv-sXojLiPSz0PHua09mVsWp8kATNz34RHB_ZwJnBPaSJ3DGscwxt-IhgfCDwrZzcqEMFVuUFg_-df2ZUoHPgVIFNs2k9kUSpKyM4IZ3jt8I3KZMU8DzLcngAmYxd3MSkh17SQPpAuBQqPRZtPs2eUHB_txkK0FaDbd0cPczteIsHV6eO1LHvF7Ok7CniSG60G99r_ffDYquzC7LeVjL1uI-OV5VcKvpblz8FbDw1vhqeah5GQ_omidTkQkr9ssHcEc3t9Ly4jr2lq4U2WHoiwCP8C6" +
                "uGjvfzZih0p6O3xug3cvQsLoaLLNtkagvmD7AiOdTZYszw";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
