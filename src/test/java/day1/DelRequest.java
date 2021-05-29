package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DelRequest {



    @Test
    public void test1()  {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath ="/api/users/2";






         Response resp =  given().log().all().delete();
         resp.prettyPrint();

         System.out.println(resp.getStatusCode());

    }



}
