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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCIsImtpZCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTU4MzM0NTA2LCJuYmYiOjE1NTgzMzQ1MDYsImV4cCI6MTU1ODMzODQwNiwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhMQUFBQWliQnJEYVhkT1llNzM4TmNzcmducnU2ckNNa0FIWTUrcHB4K0VRUW5KSmpEOTY3TlF4eXdJTWFINTZzL2VycWJCVVdLVXJaQUhDT21jUHN2dUdxaVpnPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjQ2Ljg4IiwibmFtZSI6InlrdXJ5bG8iLCJvaWQiOiJiNjQ4ZjlhMC1mNzViLTQ1ZjYtYTBmYi00YWRiOWFkMzljYmMiLCJwd2RfZXhwIjoiNTIyNjg4IiwicHdkX3VybCI6Imh0dHBzOi8vcG9ydGFsLm1pY3Jvc29mdG9ubGluZS5jb20vQ2hhbmdlUGFzc3dvcmQuYXNweCIsInNjcCI6InVzZXJfaW1wZXJzb25hdGlvbiIsInN1YiI6ImVvWHpZMkJaQ21PRWpwaWlQd0o3a2cwNzlvc0s2bjdHQ0s2dEg4VWxULUkiLCJ0aWQiOiIyYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYiLCJ1bmlxdWVfbmFtZSI6InlrdXJ5bG9AdmVjdG9yLXNvZnR3YXJlLmNvbSIsInV0aSI6IndrTHNIa1Y0a0UtSGY5dmNQZEdzQUEiLCJ2ZXIiOiIxLjAifQ.y_kig9YZmeRD7X2G6KU5ihs2Wvq5e3D_3uhqxWmYFrtk5PMsLMw15vmHB7MXf2g5zb1T5zA5g7SxD16rLzJHAcKUyHLUW_0-H9cWlHN6PCAJJjvLdGuRH2PqUgtbnWp9P9W9FL2gH-YWRsKr8h_FC_D7IOWkvk8NpypcsmgF3A2rhoHj6rJdnXqh5DR8nZVmtMGvodo-2mojtqgI33melcVfT7NJWWXzx-kYp7cgt5xEZHBtLTF_d_FfvhQuCGdKI7BoKGSVIP43eUFjhpPSnSRvXEO5aGG0_mdNSAbFOVCmIQ9J0BFLBOKGqlOmzQT" +
                "za-YoX8tMw4ZSeMvfOUkdyw";
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
