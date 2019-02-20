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

public class Config extends JsonResources{

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
        String token ="Bearer eyJ0eXAiOiJKV1QiLC" +
                "JhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSU" +
                "RXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii" +
                "1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MC" +
                "J9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZ" +
                "TktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiO" +
                "iJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUwNjc3NzE5LCJuYmYiOjE1NTA2Nzc3MTksImV4cCI6MTU1MDY4MTYxOSwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQVN4cjdieTF4cDBwV3g2UWZDMmYwVXhUTGlZK2IyRnNQZ0hndXFOZWJnQjJOd1JEbENpZFhiM1VFYlNtNzM4UXFWMUlSdGtERDRtanNTYnVuUjB1aFJ3PT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwicHdkX2V4cCI6IjM0NDY0NyIsInB3ZF91cmwiOiJodHRwczovL3BvcnRhbC5taWNyb3NvZnRvbmxpbmUuY29tL0NoYW5nZVBhc3N3b3JkLmFzcHgiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJYR0RUZDRmVkFFQ0JndjUzZ3lPeUFBIiwidmVyIjoiMS4wIn0.HbLMhGbBnTZcueffTMf5lhnZP0Kurb6q1swBW6bgvOgTV6la6afObUmrmRmtaQuiMT7-OXfli31xI5wNxHnrec0euwYWi94zI8zbMi7-aKly1iZJXJJ7W-bJ85WDRIRw08qa7y3gPBzATws1ePNMbfGasqpTJ3d6-1k8kotAREpm7ixCiIXR4ZUS8W6oLxn3R_99VXxYS_AjbKwiuUplcsmgEDNTucZsxzfx" +
                "f7d-kheV6Mfw56d_D-mhGd" +
                "sME2gEB-F9zZdKHL6mzTwRa" +
                "N822QFRm2DNVB1qMERuTeNXd9A-6e8" +
                "43za24pZdJr32HmzwWr_13nBskTYdhf9VZi_a6g";
        return token;

    }
}
