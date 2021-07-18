package day1;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest_Student {



    @Test
    public void test1(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath ="student/1";
        Response resp =  given().log().all().get();
        resp.prettyPrint();
//        System.out.println("Status code : "+ resp.getStatusCode());
//        Assert.assertEquals(resp.getStatusCode(),200,"Status code mismatch!");
    }



}
