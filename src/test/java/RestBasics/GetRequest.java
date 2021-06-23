package RestBasics;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;




public class GetRequest {


    @Test
    public void basics(){

        RestAssured.baseURI ="https://reqres.in/";
//        RestAssured.basePath = "/api/users?page=2";
//

      Response resp =  given().log().all().get("/api/users?page=2");
      resp.prettyPrint();


    }
}
