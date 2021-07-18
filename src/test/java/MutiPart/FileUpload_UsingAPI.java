package MutiPart;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

public class FileUpload_UsingAPI {

    @Test
    public void fileUpload(){
        String path = System.getProperty("user.dir")+File.separator+"Links";
        RestAssured.given()
                // Mutipart method is used to upload the file.
                .multiPart("file",new File(path))
                .accept(ContentType.JSON)
                .when()
                .post("https://the-internet.herokuapp.com/upload")
                .then()
                .statusCode(200);

    }
}
