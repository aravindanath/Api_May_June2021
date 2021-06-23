package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class SchemaValidation {

    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8080;
        RestAssured.basePath="/student/1";

        File schema = new File(System.getProperty("user.dir")+ File.separator+"StudentSchema.json");

      given().contentType(ContentType.JSON).log().all().get().then().body(matchesJsonSchema(schema));

    }
}
