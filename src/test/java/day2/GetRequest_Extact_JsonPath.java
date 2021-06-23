package day2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

import static io.restassured.RestAssured.given;

public class GetRequest_Extact_JsonPath {


    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8080;
        RestAssured.basePath="/student";


        Response resp =  given().log().all().get("/12");

        JsonPath extractor = resp.jsonPath();
        String firstname = extractor.get("firstName");
        String lastName = extractor.get("lastName");
        System.out.println("First Name is "+ firstname);
        System.out.println("Last Name is "+ lastName);


    }
}
