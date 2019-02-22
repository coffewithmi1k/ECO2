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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUwODQ4OTQ3LCJuYmYiOjE1NTA4NDg5NDcsImV4cCI6MTU1MDg1Mjg0NywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQXU2WDMybjZSVjloRHVWZGZPc2htRFFkTkpnM1ViR1IrSU9mbk9zSUZVTHJEVngwSHpEYUphTWNLVTNMUTlRMWpwOXh0VkRQQ3JML3hyTjVCcDdMZTBBPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwicHdkX2V4cCI6IjE3MzQxOSIsInB3ZF91cmwiOiJodHRwczovL3BvcnRhbC5taWNyb3NvZnRvbmxpbmUuY29tL0NoYW5nZVBhc3N3b3JkLmFzcHgiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJJV3E4Y1lxY29VeVFrSlRyMDloU0FBIiwidmVyIjoiMS4wIn0.Tc5E1HaCx58vYpS_1sXqWIXBSS8oXsAiz19huP4q-x6TfbR-vz5Di8i2zx5AFxHgE8rfr3-UOlJJLLAvhEgnG-0XwhLkTlSfCF6jun0TrVb3jxYxY6VFhv-4Mg_AecnNDBGuBkpFhNFivToHZACL2HjCP_RjosAKaabsxNbEdf4PfIJHjpDQ5nBnw_iWgFwU0t7PtW34YvSab0V-jz8_rSzspxLlE2jX3BQdlwGuaOFdejPzGsxRC_OwXg" +
                "qPMJEi3tfuitxVPcmxQaz27_WJkTtxYPmxHtcUY_5M-qbTQulZ2borBYfP8YCreRx7uCTUPca9mQIGjlAYmfPt8yAkog";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
