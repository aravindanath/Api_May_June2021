package day1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostRequest_Collections {



    @Test
    public void test1()  {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath ="/api/users";


        HashMap<String, String> user = new HashMap<>();
        user.put("name","Arvind");
        user.put("job","Automation Lead");


         Response resp =  given().log().all().contentType(ContentType.JSON).body(user).post();
         resp.prettyPrint();


    }



}
