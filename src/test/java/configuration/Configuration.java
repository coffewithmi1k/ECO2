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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCIsImtpZCI6Ii1zeE1KTUxDSURXTVRQdlp5SjZ0eC1DRHh3MCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTUxODgxNjQzLCJuYmYiOjE1NTE4ODE2NDMsImV4cCI6MTU1MTg4NTU0MywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhLQUFBQWJ5NU5QM2RUWTF2VlE5K2RTdUcrSXkyZ2lsME1qcUcrRWhEM1NibGg1OWphYlhOc3JuRktBRnp3dzlWZ3FHNFZid1I0bmozMWlXUGdWbGFQYVhFMmh3PT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoiXzkza1pXM3p5MENzb3N5Q1huYzBBQSIsInZlciI6IjEuMCJ9.URoreIFEXCSgLfY4geQwE0uyIOUKh53RxFGGY7cfoY3ooO8p-8zTaFPzxj59_Efh9JGVEWtwyJ3QPB8ggrYBoWuH7r7q66CRWK6FssOlixavLLryllqyLJOrLv3gxBaojqu4R3dKkC9SHw969X5iY9SRbRqQ1KnIxV3ibw891wuZD4XzuGiZZegwuoL05khjlg4YpDSG2kxUDHhVfWRq-j-w0_ziMul--JjyJHmqABsgik7Mwnxowjk5S-CmPopjnCNK4hkbSWRRZlFVmMVoU6k66" +
                "L7-HUlnlIeKxa4Ch4Ljl2rX7WcLo_ejhlTsUP9KKuDRRblZLdwsrvPnlxdayQ";
        return token;

    }

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "_")
                .replace("EET","");
        return date;
    }
}
