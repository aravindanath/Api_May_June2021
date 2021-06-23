package RestBasics;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {


    @Test
    public void basics(){

        RestAssured.baseURI ="https://reqres.in/";
        RestAssured.basePath = "/api/users/2";


      Response resp =  given().contentType(ContentType.JSON).log().all().body("{\n" +
              "    \"name\": \"Varun\",\n" +
              "    \"job\": \"Automation Expert\"\n" +
              "}").put();
      resp.prettyPrint();


      System.out.println(resp.getStatusCode());


    }
}
