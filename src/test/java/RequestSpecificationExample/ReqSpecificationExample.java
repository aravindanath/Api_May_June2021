package RequestSpecificationExample;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReqSpecificationExample {
    // Interface
    RequestSpecification requestSpecification;


    @BeforeClass
    public void setupRequestSpecifications(){

        requestSpecification = RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .header("dummy","adfadf")
                .header("OAuth","Bearer")
                .param("name","varu")
                .cookie("dummy");



    }


    @Test
    public void getAllBookings(){
        RestAssured
                .given()
                .spec(requestSpecification)
                .when()
                .then()
                .statusCode(200);
    }


}
