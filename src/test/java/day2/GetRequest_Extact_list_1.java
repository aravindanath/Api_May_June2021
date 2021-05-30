package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetRequest_Extact_list_1 {


    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8080;
        RestAssured.basePath="/student";

        Response resp = given().contentType(ContentType.JSON).log().all().get("/list");
        List<Integer> id  =  resp.then().extract().path("id");
        List<String> firstname  =  resp.then().extract().path("firstName");
        List<String> lastName  =  resp.then().extract().path("lastName");
        List<String> programme  =  resp.then().extract().path("programme");
        List<String> email  =  resp.then().extract().path("email");

        for(int i=0;i<id.size();i++){
            System.out.println(id.get(i));
            System.out.println(firstname.get(i));
            System.out.println(lastName.get(i));
            System.out.println(programme.get(i));
            System.out.println(email.get(i));
        }



    }
}
