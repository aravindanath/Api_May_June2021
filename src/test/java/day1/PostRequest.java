package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {



    @Test
    public void test1(){
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath ="/api/users";


       Response resp =  given().log().all().contentType(ContentType.JSON).body("{\n" +
                "    \"name\": \"DoraBabu\",\n" +
                "    \"job\": \"leader\"\n" +
                "}").post();

       resp.prettyPrint();


    }



}
