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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyIsImtpZCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUyOTIyNzc3LCJuYmYiOjE1NTI5MjI3NzcsImV4cCI6MTU1MjkyNjY3NywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQUprYlN3VllxeTFsZThnc0Z0a2ZYT1dDMDVQUURmRldPT3VHRmF1Z2p5ak9Nbnh3WTliUDBGeW45RUEwUHcrWGNMOFBCdTdSQlkxRThIb3AvNk0vUjZRPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoieE41TXE4YUZQRXFLZUh6cHpfYXRBQSIsInZlciI6IjEuMCJ9.q7YU4bqpcmrWbxsz61XN1_bovTG2JwHvfOlWZBGvdiEYcC0BSLOBsl9iM_wyaiUy4QvBQ4AwQxTIZhm_1ZayeQskHYYXK_50ioONFFKe6YoOJgwrG3EOTlxqrZ6HFpTb30iJ4T99R4yRgeL_WM6YU9Cswexzjju6rh6yUJLpLJwE4q8tcSZ3zZCQpMgTXPCsKl2LibiZ6_wU_usMcLhuCJr96DHmNhgF7nZbmJQDFr4puJjfcPc9H81VAfzY808TmkX6ZZvjOFu65tPy3KcWlAVWBWgION48VTAVRrZ3t92JcZLklKOLqMEgP" +
                "0H8br7RjJVkb1rUtrOFpNASTUh0zg";
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
