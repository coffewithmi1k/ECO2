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
import java.util.Random;

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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyIsImtpZCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUzODY3MTk0LCJuYmYiOjE1NTM4NjcxOTQsImV4cCI6MTU1Mzg3MTA5NCwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQXRaOW5lWi8zV3NvTForcmRPMWxpZ2VObmhMMkZQdytCc0NPUGNUNXVtdE9tZzErYUhOY1c2cWdwVVhQekxPYlFPSU1xMGVsaEljODNVZGt4SjJFYVZnPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoibFlPTmhCYmplMHFvZ3Jnc3lyVWxBQSIsInZlciI6IjEuMCJ9.Qq0LWy2p8NQuO0MKWyYiSAUs8hhVwNrhP2ueVSvREvKkO4EPH4LAYtU24LhlyVXxfGl5mzH-BQG4Z-rrSWCEULxYYYC7jGY73YEBQeMI8qJ4aGFQKZbO9C42UJSzzBMG7i7yYI6iMvdLTOa7p5dHjH6xYA86VItYFcy86mFmLyvvBQ5MDoJpfbb8Vyqc1aQlc6qHnCM7N_ZYu7n-UmQqlfYY_P7PiJFMwnT5Kg_pAYbwSMPUSM3dtOEy6epORX9fiI_qu3GbxqTiPg-zVpLP2hpclu-KdK80J_hi" +
                "crKFykDsCir0jltrvuvkgWMtAVQEMTFa7wvOTNrHMzUs6WWINg";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
    public int getRandomNumber(){
        int randomNumber =(int)(Math.random()*10000+1);
        return randomNumber;
    }
}
