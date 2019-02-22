package configuration;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.Date;

public class Configuration {

    private final static String basePath = "https://ecohz-online-api-dev.azurewebsites.net/api/";

    @Step("Test setup")
    @BeforeMethod
    public void setUp() {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri(basePath)
                .setContentType("application/json")
                .log(LogDetail.ALL)
                .build();
        RestAssured.requestSpecification = requestSpec;
    }

    public String getToken() {
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUwODM1NTQzLCJuYmYiOjE1NTA4MzU1NDMsImV4cCI6MTU1MDgzOTQ0MywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQVN4cjdieTF4cDBwV3g2UWZDMmYwVTI5MkNXMFh0cjNqNVgzTVlBT0Q5Q2FtL3kzU0pHOVcvVkVreXJLVVZ4OUFSMVBxYTJxNVVyMjVnN2h3VjViMXp3PT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwicHdkX2V4cCI6IjE4NjgyMyIsInB3ZF91cmwiOiJodHRwczovL3BvcnRhbC5taWNyb3NvZnRvbmxpbmUuY29tL0NoYW5nZVBhc3N3b3JkLmFzcHgiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJ1VFNqUGdQNzNVT2duN2NfcnVRV0FBIiwidmVyIjoiMS4wIn0.ocq68x4qpYVabQdfwQgfhsfw1S0X3qqQaD_YYe_WWMmA_hXQnIJfxUJmAOy_rlZ4_7AQXVd-oOSyvYmIhNOC-1OErhMRRA_uQCSjPxbTpidYefgN8wz8mNFTSCBHpU2zVK7hWcV6aEWhxG5BDQxCxQtLS0-jG8tblptwzXGsLWg2pLX3kBUxlgORu85QYsGUUQBXN4XaoUMf_8_yYecJEtjllYRMZP4BHrIWWkvU2tNAwofKLv_jCAgr6vMjsUeYFTNOONx3x" +
                "rkXNZ0oRKPMkEdNuMYruFjgEFHlaEdfpMKdAnIOS5FmE7tjuBzZ3xxzu6jwY01NMTpO_r9YRH8zbA";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
