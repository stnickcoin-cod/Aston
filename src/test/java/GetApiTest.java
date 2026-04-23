import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetApiTest {
    @Test
    public void getParams(){
        given().log().body()
                .baseUri("https://postman-echo.com")
                .basePath("/get")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when().get()
                .then().log().body()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }
}
