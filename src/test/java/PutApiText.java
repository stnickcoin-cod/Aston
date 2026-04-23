import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutApiText {
    @Test
    public void testPutTextBody(){
        String requestBody = "This is expected to be sent back as part of response body.";
        given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .basePath("/put")
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when().put()
                .then()
                .log().ifValidationFails()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}
