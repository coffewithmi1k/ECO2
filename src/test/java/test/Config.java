package test;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.*;
import sun.rmi.runtime.Log;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.basePath;

public class Config extends JsonResources{

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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUwODI5NDQ1LCJuYmYiOjE1NTA4Mjk0NDUsImV4cCI6MTU1MDgzMzM0NSwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQTZ0Z1E2ZmYxc0hoN0Y1NFJZYWU1ZlNaWis4VUR3eFhrWnc5djZZOVNweS9iVW85aVFyOEI2OFVoYXNHRUV6VGdLdVVTRG5FRW0zNmxlUkI1dVRwa1d3PT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwicHdkX2V4cCI6IjE5MjkyMSIsInB3ZF91cmwiOiJodHRwczovL3BvcnRhbC5taWNyb3NvZnRvbmxpbmUuY29tL0NoYW5nZVBhc3N3b3JkLmFzcHgiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJRUjRiTlNFc0QweWFWM0ZoemprU0FBIiwidmVyIjoiMS4wIn0.VvGlVhOhX1f86Zx2ucKT3QNfjfQ9dw3HUROhZHLaHnGW4xfanrqI_F0yWkyXkFsT-8COmutvPx4KWyQPHbu1IpgjphyVpEo_CfJPqXqklecqP_h6u93GLTObGdmhht8ImPYZKYJg1OkLPUHf59n9edZCDOeZJnfahRPZ8dHfJ_GGDE_1QvZrcMki8XKPvk1RhlJA1u93S1GNerzLqSvQpFQPJxSlUJPuQpvP1zyMnzOdv6kpKduAuaK33Xm7dIMnnEaX111" +
                "J53BBj_YBFqxX5SR2XT0dpsLUvXzS0EWLib_EAbIXGHgyxMVeKAse9WIBGCmi3N0uP2HK87stX985fg";
        return token;

    }
}
