package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateStudent {

    @Test
    public void test(){

        RestAssured.baseURI ="http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath="student";

        Response resp = given().contentType(ContentType.JSON).log().all().body("{\n" +
                "  \"firstName\": \"Varun\",\n" +
                "  \"lastName\": \"kumar\",\n" +
                "  \"email\": \"varun@massaQuisqueporttitor.org\",\n" +
                "  \"programme\": \"Financial Analysis\",\n" +
                "  \"courses\": [\n" +
                "    \"Accounting\",\n" +
                "    \"Statistics\",\n" +
                "    \"Echonomics\"\n" +
                "  ]\n" +
                "}").post();

        resp.prettyPrint();





    }

}
