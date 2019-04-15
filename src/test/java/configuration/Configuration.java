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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyIsImtpZCI6Ik4tbEMwbi05REFMcXdodUhZbkhRNjNHZUNYYyJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTU1MzIwMDU3LCJuYmYiOjE1NTUzMjAwNTcsImV4cCI6MTU1NTMyMzk1NywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhMQUFBQWhNa25uRHlDMENGWndWVEhHdjJJNFZuYXpJWGJZSENENDdVNHlqdHR4dWNXQlZVeU50R1ZEeSt3OVh5TW1pTUt1STFPZVZ2c2FwaXpTYjh2RTZvaXRBPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjExLjI0NiIsIm5hbWUiOiJ5a3VyeWxvIiwib2lkIjoiYjY0OGY5YTAtZjc1Yi00NWY2LWEwZmItNGFkYjlhZDM5Y2JjIiwic2NwIjoidXNlcl9pbXBlcnNvbmF0aW9uIiwic3ViIjoiZW9YelkyQlpDbU9FanBpaVB3SjdrZzA3OW9zSzZuN0dDSzZ0SDhVbFQtSSIsInRpZCI6IjJhMGI3ZGFkLTNmNTAtNDc1Zi1iNzVmLWU4MTNjM2ZhYjIyNiIsInVuaXF1ZV9uYW1lIjoieWt1cnlsb0B2ZWN0b3Itc29mdHdhcmUuY29tIiwidXRpIjoiSzY4Q0ZjRHJURWVDTTlWOWk1TkxBQSIsInZlciI6IjEuMCJ9.s1bCpKRi4D3fqtgb34hfombx0CqhGM4ZOlnhXSmBE5wHOzKaPc_copzLGvOO-XuN33_OPWeIMPkhyFeAm0IQuXnIqpEQjYImBpnKspWqN4Q6M60smNIPm38rVSkpZU2gsndfUmUr3GkaWMCFZNJnqC-HYxGDB0SH4oWJAYB1Dgu846O5IJlDcREGWbceIhB_mt3Hp7f7z3uWXp_DY8ADAIJffkbtd7gVQQqHCi9l4HfsBZyGL2_lESzeRfK_dy3dx0w42ksYg_l8c7rfnSp6EUbum6GUwLXjHS7hUr0vo7veX-r" +
                "syzId40JjOsi9eaSUSq4uMSaKp-wnB1Yy_HsPhw";
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
