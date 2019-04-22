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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCIsImtpZCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTU1OTMxMDQ2LCJuYmYiOjE1NTU5MzEwNDYsImV4cCI6MTU1NTkzNDk0NiwiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhMQUFBQXErMHZUNmhTOFRsVHRLTEs0Q2pueGhzRGdJNjFtVmNXNEVlc1VReXRiUWZ2NFplU01pSkJaRWlLWEtIaXNyRlZKaWxZUkRNMlhjMW1DWGFBM1JvaGlBPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjQ2Ljg4IiwibmFtZSI6InlrdXJ5bG8iLCJvaWQiOiJiNjQ4ZjlhMC1mNzViLTQ1ZjYtYTBmYi00YWRiOWFkMzljYmMiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiIybURYbzFONzJrRy1kX2c3U1dsQUFBIiwidmVyIjoiMS4wIn0.Xw-wusr6BbACaD7k17AiCALNn2T-ZFiMWPqZpGOBs8r4Y47XJKaXHLi5PlmpKJr_Wdy_ni4yfSzl4enAIXqmuD4B0uANH2t6JeOimWX_055bhYNeOJp6YQgyFAb8ccRba6pKa3y8xjOTVDNfLudKfBMoCRihCo4ua1-oUdtbxM7E1rn7b88LlwLHvt9jlbenRIw_RkOt3cuNe0uASI_46RLAbcVkzwX0xZpBedxghHovKP_hBq8gC2SQTGgVc9tRkJ6bKW-2XK52FSVMuwpH8G7OD0JhohFHFx7qv0okzmHTMM3-l" +
                "ffNjI1cqzs7R9hKcGme7mROBTJu1pmfJqJeLw";
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
