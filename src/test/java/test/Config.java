package test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import static io.restassured.RestAssured.basePath;

public class Config {

    private final static String basePath = "https://ecohz-online-api-dev.azurewebsites.net/api/";

    @BeforeSuite
    public void setUp() {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri(basePath)
                .setContentType("application/json")
                .log(LogDetail.ALL)
                .build();
        RestAssured.requestSpecification = requestSpec;
    }

    @AfterSuite
    public void tearDown() {

    }

    public String getToken() {
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIn" +
                "g1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii" +
                "1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02" +
                "M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUwNTgxNDgwLCJuYmYiOjE1NTA1ODE0ODAsImV4cCI6MTU1MDU4NTM4MCwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQXpSVkxZNUIvT3FPdlltZUVTRGtmZ1dDOUxQQ241VzJNeno1VEJWbUJMYWdSclMrbzI5YWN1Wm9OWmJ2UlBONEprQzhwdmxZVlN3cDNjeWxYV2Z3cmZnPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwicHdkX2V4cCI6IjQ0MDg4NiIsInB3ZF91cmwiOiJodHRwczovL3BvcnRhbC5taWNyb3NvZnRvbmxpbmUuY29tL0NoYW5nZVBhc3N3b3JkLmFzcHgiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJlSDJ2MlRBQ2drQ3IxWmRkSG5CNEFBIiwidmVyIjoiMS4wIn0.MJr_bRIZyyg3QxWDI8hbKOIhoF9ruI39NbvNus3p-itp0RmB1VtYSdvDoNeBe9YUpF3y55XdXgbTUYq7vRniJBDZWYwnGNEZCppK6levzCiYSvRoBVeLM_V9Jp5BLaEBr15hY9gM7chMR8uUm3tqvFbIK7vhJCc5Wnz6YYZ4PE6BmwNrYLnO05Cqll2ivXUe4DoZ8yUmIwiOeohaNXGZ8WqfXw9VnQAy3BvO_rptlkhUwZtBddM" +
                "x9U7h_mfKUkxMelbp0X5z76zgTZIH1j_k" +
                "MonjDvtH14buk7ouBvYg9wNI4g1Lz_rIPABxthuIL04BZEn2At3eowBK6jFfPGfXzg";
        return token;

    }
}
