package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class SchemaValidation_2 {

    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8080;
        RestAssured.basePath="/student/101";

        File schema = new File(System.getProperty("user.dir")+ File.separator+"StudentSchema.json");

       Response resp =  given().contentType(ContentType.JSON).log().all().get();
       resp.then().body(matchesJsonSchema(schema));
       resp.prettyPrint();




    }
}
