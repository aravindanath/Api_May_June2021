package RequestSpecificationExample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class WithOutUsingReqSpecifications {


    @Test
    public void getAllBookings(){
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when()
                .then()
                .statusLine("HTTP/1.1 200 OK")
                .statusCode(200);


    }



    @Test
    public void getBookingDetailsWithInvalidFirstName(){
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .param("firstName","Arvind")
                .when()
                .then()
                .statusLine("HTTP/1.1 200 OK")
                .statusCode(200);


    }

    @Test
    public void getAllBookings1(){
       Response resp =  RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking").log().all().get();


       resp.prettyPrint();
    }
}
