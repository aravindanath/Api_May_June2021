package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PostRequest {


    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8888;
        RestAssured.basePath="/student";
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Restassured");
        courses.add("Selenium");
        courses.add("Appium");
        StudentFinalObject std = new StudentFinalObject(Generic.firstNme(),"xyz",Generic.genEmail(),"Computer science",courses);


       Response resp =  given().contentType(ContentType.JSON).log().all().body(std).post();
       resp.prettyPrint();
    }
}
