package day4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;

public class ValidateResponseBody_List {

    @Test
    public void validate_status_code_1(){
        RestAssured.baseURI = "https://api.postman.com";
        RestAssured.basePath ="/workspaces";


        Response resp =  given().header("X-Api-Key","PMAK-60ce19f6b7d11500350d34d9-fdc60c48403e5f90c1cc782770d5bd51e0").log().all().get();

//        resp.prettyPrint();

      HashMap<String,String> val  = resp.then().extract().path("workspaces");

      for(Map.Entry<String,String> m : val.entrySet()){
          System.out.println(m.getKey());
      }

        // Extraction
//       String name =  resp.then().extract().path("workspaces.name[0]").toString();
//        String type =  resp.then().extract().path("workspaces.type[0]").toString();
//        String id =  resp.then().extract().path("workspaces.id[0]").toString();
//       System.out.println("Name "+ name);
//        System.out.println("Type "+ type);
//        System.out.println("ID "+ id);
//
//        // Assrtion
//            resp.then().body("workspaces.name",contains("My Workspace"),"workspaces.type", contains("personal"));

    }


}
