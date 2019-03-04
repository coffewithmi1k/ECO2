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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUxNjIxNTc5LCJuYmYiOjE1NTE2MjE1NzksImV4cCI6MTU1MTYyNTQ3OSwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQVU2WG1hTXNHQTFEY0R2WlA3YnBJMW45RkJ0aTIrSGRCUUs3UjdlMkowTzRZTjl2QXI5QjkxNHdJYzczMnlucndGcG41NGw5T21hOEEwSEVIaHlXQzZnPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxMDkuMjUxLjE4NS4yNyIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoiZ2ZlQ2J4b3gyRS15OWoteFk4NGhBQSIsInZlciI6IjEuMCJ9.N8Dz2rnNdFOAdLgMhPg4D8LCSQh_Omtzo1-8nAkZNX-Rul442gXDfMgHB-JN8MaUfe5wPQ_l7NvyNjlnymu-4GeTeZgkdxggnWHXZeXqQGJX8X3yRs6_2phkR5WycSDFW1zdjVGJzAsKFv8E0TZ9Nj2_KlhdCE93HFp3o0Qeq7nxUJTpNNdh77gAlnsivtVZfY_qX3mY5mqxKXJqvm0JDnq88gZTT4juqtccuP9WDS5Rt71WhPP9jsm9mW7_Na9rhNz3GEkoQ0sqQBKMsJuhnF2vU_ssAaajoXDVBZhsu5Mz" +
                "bs2FmM1v8SxDyD9aQHfVws91v_OODhIqy30CwegIRg";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
