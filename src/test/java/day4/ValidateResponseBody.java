package day4;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ValidateResponseBody {

    @Test
    public void validate_status_code_1(){
        RestAssured.baseURI = "https://api.postman.com";
        RestAssured.basePath ="/workspaces";


        Response resp =  given().header("X-Api-Key","PMAK-60ce19f6b7d11500350d34d9-fdc60c48403e5f90c1cc782770d5bd51e0").get();

        resp.prettyPrint();
        // Extraction
       String name =  resp.then().extract().path("workspaces.name[0]").toString();
        String type =  resp.then().extract().path("workspaces.type[0]").toString();
        String id =  resp.then().extract().path("workspaces.id[0]").toString();
       System.out.println("Name "+ name);
        System.out.println("Type "+ type);
        System.out.println("ID "+ id);

        // Assrtion
            resp.then().body("workspaces.name",contains("My Workspace"),"workspaces.type", contains("personal"));

    }


    /**
     * is(.. )
     * not(..)
     * equalTo(..)
     * contain(...)
     * greaterThan(..)
     * lessThan(..)
     * hasSize(..)
     * hasItem(..) and hasItems(...)
     */


    /**
     * {
     *     "workspaces": [
     *         {
     *             "id": "2454a93d-3ccf-43ff-8255-ebafcde10a3a",
     *             "name": "My Workspace",
     *             "type": "personal"
     *         }
     *     ]
     * }
     */



////
//   @Test
//    public void validate_response_body(){
//        given().
//                baseUri("https://api.postman.com").
//                header("X-Api-Key", "PMAK-60ce19f6b7d11500350d34d9-fdc60c48403e5f90c1cc782770d5bd51e0").
//        when().
//                get("/workspaces").
//        then().
//                log().all().
//                assertThat().
//                statusCode(200).
//                body("workspaces.name", hasItems("Team Workspace", "My Workspace", "My Workspace2"),
//                        "workspaces.type", hasItems("team", "personal", "personal"),
//                        "workspaces[0].name", equalTo("Team Workspace"),
//                        "workspaces[0].name", is(equalTo("Team Workspace")),
//                        "workspaces.size()", equalTo(3),
//                        "workspaces.name", hasItem("Team Workspace")
//                );
//    }

}
