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
        String token ="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCIsImtpZCI6IkhCeGw5bUFlNmd4YXZDa2NvT1UyVEhzRE5hMCJ9.eyJhdWQiOiIwMjUxOTA4ZS02M2QwLTRlZTktYjZiNi0wNDQ0Yjk1YTY3OWUiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8yYTBiN2RhZC0zZjUwLTQ3NWYtYjc1Zi1lODEzYzNmYWIyMjYvIiwiaWF0IjoxNTU3MTM4MTkzLCJuYmYiOjE1NTcxMzgxOTMsImV4cCI6MTU1NzE0MjA5MywiYWNyIjoiMSIsImFpbyI6IkFVUUF1LzhMQUFBQXord1YvdG9pSW5ZSnpOTi93WEhuMHNOc1F6NzMyN29CVmc4S0hPS0h1SzdVblFOdkxCYlRtZDBzUzFDT2NPbWlJeENIUVdjdzNaRGJDZldtK0NsbmhRPT0iLCJhbXIiOlsicHdkIl0sImFwcGlkIjoiMTk5MjhkMGEtMThhNC00NTJjLTljOWYtMGQwNjEyZTdhZmZiIiwiYXBwaWRhY3IiOiIwIiwiZW1haWwiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJncm91cHMiOlsiMzYwMWJiZGUtMTI2MS00MGJjLThiMzItMmJlYjNmNmJiNDhhIl0sImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0LzI5MGNhZTc5LWYxZDctNGE1Yy05YzMzLTI1ZmMwZDM4ZjdiMi8iLCJpcGFkZHIiOiIxOTQuNDQuMjQ2Ljg4IiwibmFtZSI6InlrdXJ5bG8iLCJvaWQiOiJiNjQ4ZjlhMC1mNzViLTQ1ZjYtYTBmYi00YWRiOWFkMzljYmMiLCJzY3AiOiJ1c2VyX2ltcGVyc29uYXRpb24iLCJzdWIiOiJlb1h6WTJCWkNtT0VqcGlpUHdKN2tnMDc5b3NLNm43R0NLNnRIOFVsVC1JIiwidGlkIjoiMmEwYjdkYWQtM2Y1MC00NzVmLWI3NWYtZTgxM2MzZmFiMjI2IiwidW5pcXVlX25hbWUiOiJ5a3VyeWxvQHZlY3Rvci1zb2Z0d2FyZS5jb20iLCJ1dGkiOiJnRXBKUWZ4R2gweTVwb1Y0RHdJY0FBIiwidmVyIjoiMS4wIn0.f0e7rzPCKNJPwwX2MwkSFA4KfcytW-RDCRouGhHIOoCqo4hZ64lBwDFN9h7U86PgfSc19gT0llctX95Op_dX-FPoNkfL2f0ztSi-z-QTqSHoO0yFBIXloDG6cMzEu5RSZTOFSBib0HSpJcj8omYYGM1b2zPBF6cDpNffkstHZKgv0pjO1316MfP5z2hsGSz7oFbARvIql19yNGNXyDxx9R6lqxxNVtuJQMQwJIXh9inCttVKot-qBZrjCRNd8lKK6bY419u0dFuimNHQuIxigOTbqTc0uiQsmuaCKU9BRLpbioTwO" +
                "XpVoaAY5qqq6dIarGbrf1WTaa5xXdHa2k9qfw";
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
