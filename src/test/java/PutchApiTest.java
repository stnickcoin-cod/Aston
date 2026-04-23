import org.junit.jupiter.api.Test;
import java.util.Collections;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutchApiTest {
    @Test
    public void testPatchRequest() {
        given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .basePath("/patch")
                .when()
                .patch() // отправляем PATCH‑запрос
                .then()
                .log().ifValidationFails() // логируем ответ только при ошибке
                .statusCode(200)
                .body("args", equalTo(Collections.emptyMap()))
                .body("data", equalTo(Collections.emptyMap()))
                .body("files", equalTo(Collections.emptyMap()))
                .body("form", equalTo(Collections.emptyMap()));
}
}