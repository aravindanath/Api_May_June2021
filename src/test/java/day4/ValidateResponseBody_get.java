package day4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;

public class ValidateResponseBody_get {

    @Test
    public void validate_status_code_1(){
        RestAssured.baseURI = "https://api.postman.com";
//        RestAssured.basePath ="";


        Response resp =  given().header("X-Api-Key","PMAK-60ce19f6b7d11500350d34d9-fdc60c48403e5f90c1cc782770d5bd51e0").get("/workspaces");

        resp.prettyPrint();


    }



}
