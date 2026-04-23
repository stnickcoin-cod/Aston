import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostApiFromData {
       @Test
public void fromData(){
       given()
            .baseUri("https://httpbin.org")//postman-echo.com возвращает код 500
            .basePath("/post")
            .contentType(ContentType.URLENC)
            .formParam("foo1", "bar1")
            .formParam("foo2", "bar2")
            .when().post()
            .then()
            .log().ifValidationFails()
            .statusCode(200)
            .body("form.foo1", equalTo("bar1"))
            .body("form.foo2", equalTo("bar2"));
  }
}
