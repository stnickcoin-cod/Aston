import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostApiRawTextTest {
    String expectedText = "This is expected to be sent back as part of response body.";
    @Test
    public void postText(){
        given().log().body()
                .baseUri("https://postman-echo.com")
                .basePath("/post")
                .contentType(ContentType.TEXT)
                .body(expectedText)
                .when().post()
                .then().log().body()
                .statusCode(200)
                .body("data", equalTo(expectedText));
    }
}
