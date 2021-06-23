package day4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostManGetRequest {


    @Test
    public void validate_status_code(){
        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-60ce19f6b7d11500350d34d9-fdc60c48403e5f90c1cc782770d5bd51e0").
                when().
                get("/workspaces").
                then().
                log().all().
                assertThat().
                statusCode(200);
    }




    @Test
    public void validate_status_code_1(){
        RestAssured.baseURI = "https://api.postman.com";
        RestAssured.basePath ="/workspaces";


       Response resp =  given().header("X-Api-Key","PMAK-60ce19f6b7d11500350d34d9-fdc60c48403e5f90c1cc782770d5bd51e0").log().all().get();

        System.out.println(resp.getStatusCode());

        Assert.assertEquals(resp.getStatusCode(),200);
    }

}
