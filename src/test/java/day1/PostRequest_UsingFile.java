package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class PostRequest_UsingFile {



    @Test
    public void test1() throws FileNotFoundException {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath ="/api/users";

         String path =   System.getProperty("user.dir")+ File.separator+"user.json";
            FileInputStream fis = new FileInputStream(path);
         Response resp =  given().log().all().contentType(ContentType.JSON).body(fis).post();

       resp.prettyPrint();


    }



}
