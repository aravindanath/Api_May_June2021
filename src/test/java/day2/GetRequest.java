package day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {


    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8888;
        RestAssured.basePath="/student/list";

       Response resp =  given().log().all().get();
       resp.prettyPrint();
    }
}
