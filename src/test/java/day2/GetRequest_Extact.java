package day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest_Extact {


    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8080;
        RestAssured.basePath="/student/list";

       Response resp =  given().log().all().get();
      String lastNamr = resp.then().extract().path("lastName").toString();

      System.out.println(lastNamr);
       resp.prettyPrint();
    }
}
