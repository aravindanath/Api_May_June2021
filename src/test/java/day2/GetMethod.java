package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.sql.ResultSet;

import static io.restassured.RestAssured.given;

public class GetMethod {



    @Test
    public void getRequest(){

        RestAssured.baseURI = "http://localhost:8080/student/list";
//        RestAssured.port =8080;
//        RestAssured.basePath = "/student";

       Response resp =  given().contentType(ContentType.JSON).log().all().get();
       resp.prettyPrint();

    }

}
