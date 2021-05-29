package day1;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class PutRequest_Collections {



    @Test
    public void test1()  {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath ="/api/users/2";




        JSONObject user = new JSONObject ();
        user.put("name","Arvind");
        user.put("job","Automation Lead");


         Response resp =  given().log().all().contentType(ContentType.JSON).body(user).put();
         resp.prettyPrint();


    }



}
