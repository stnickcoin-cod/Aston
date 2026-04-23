import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteApiTest {
    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .log().all()
                .contentType("text/plain")
                .body(requestBody)
                .when()
                .delete("/delete")
                .then()
                .log().ifValidationFails()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}