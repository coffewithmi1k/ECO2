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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyIsImtpZCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUyMjkxMTgzLCJuYmYiOjE1NTIyOTExODMsImV4cCI6MTU1MjI5NTA4MywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQTAzbG0rYjJwWlhUamxLUU9Zb01RNHAzUzlIVG01eFo3eGkzYUIxalU3RXJIcXBFdnN4Ri9aR3NNRWt6b3ZlL1lGTmFXeW9ZaVcveEZ0cXhNaWRTMG53PT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxMDkuMjUxLjE4NS4yNyIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoia2dUTmVPTXFSVTJBRnBJblhCUmxBQSIsInZlciI6IjEuMCJ9.KCCtcDrUfqsDLk7V8K0_Yk3eURJ91I-J1gwa3DvZ7xPSM9emf32jPy4KkZhAwQuf7rjIkgIW-FPEHQvFt-2Z8woa29vhU8rDX-QAwsLPwJWe2N2J56lOfRDyIqSwZL-Am56ueULVP-pqBWZX4MvZZE_1TvdsiFOCLzRqK7_2OnTaFjlwoNAYQuIuIOjk-YzAXBYEu_ws-ywAdnyi2g6nfFq6qGabT2Cei3YJoa91fZiwxwKuNyY_YyClu8gSnMMHPDZvH7Tu87v2OVPAHcrQXudQYmTOSDb5" +
                "_Lm1nrixXKfoewXuP2MojQozMX0W4FTN4ER8vVF-w8wuieqTqOMYHg";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
