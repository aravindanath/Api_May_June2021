package day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import static io.restassured.RestAssured.given;

public class GetRequest_Extact_list {


    @Test
    public void getREQUEST(){
        RestAssured.baseURI ="http://localhost";
        RestAssured.port =8080;
        RestAssured.basePath="/student";

        Response resp = given().log().all().get("/list");

        ArrayList<String> firstName  =  resp.then().extract().path("firstName");
        ArrayList<String> lastName  =  resp.then().extract().path("lastName");
        ArrayList<String> email  =  resp.then().extract().path("email");
        ArrayList<String> programme  =  resp.then().extract().path("programme");
        ArrayList<String> courses  =  resp.then().extract().path("courses");

        ArrayList<String> empty = new ArrayList<>() ;
        for(String str : firstName){
            empty.add(str.toString());

            if(str.equals("Harper")){
                System.out.println(str+" is found");
                continue;
            }else{
                System.out.println(str+" is not found");
            }
//            System.err.println(str);
        }
        System.out.println("Unsorted "+empty);

        Collections.sort(empty);

        System.out.println("Sorted "+empty);


    }
}
