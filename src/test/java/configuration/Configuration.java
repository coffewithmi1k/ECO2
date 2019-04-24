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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCIsImtpZCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTU2MDIyMzk3LCJuYmYiOjE1NTYwMjIzOTcsImV4cCI6MTU1NjAyNjI5NywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhMQUFBQVppMW5MMWRQdVJtdVJUM3FZRmtodlZac3FxS2Z5NUhaWkNTZEJvQ1RUUFNHUDVjcE4zZTVzVnREWUptSEZuZm9iVG1HVFIyNzVKYmNJOXpudDNESDZnPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjQ2Ljg4IiwibmFtZSI6InlrdXJ5bG8iLCJvaWQiOiJiNjQ4ZjlhMC1mNzViLTQ1ZjYtYTBmYi00YWRiOWFkMzljYmMiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJyTkMwSWJmZlRVaWhWdGJLTW9abkFBIiwidmVyIjoiMS4wIn0.g1moX2L6xmEqsghxRyCTOrH41BtuwrqCTDfRPpowXOuk9cskfzHZ5G1_8sJ5UTa1np0LFUbF5zgwfo8NHWPY78zzDZolaOGG4OD_iZwn0feJVyzIKAPmBb-W8Q_9SoQj9_vP67BppC1TpTtO0VuTAmQr_JXTy0JXuiVdGEcsUvgTCvOMp6IlZdzxF9vPabItJnWoRjfnxMnOwd0xkUzwbtzNadNxelmh6urwmvTfk6vBde7DbRa6lf8B2i6fx2EpL29hoD_4_nQANwT-OaF2PlwaLKBz1U6neDgtvecw4LGvsnlPRmlX" +
                "rkr694mZayzEkgXsFimD1zTPAJPUGK6OiQ";
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
