import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiGetTest {

    private static final String BASE_URL = "https://postman-echo.com";
    private static final String ENDPOINT = "/get";

    @Test
    public void testGetRequest() {
        // Настройка параметров запроса
        String queryParams = "foo1=bar1&foo2=bar2";

        // Выполнение запроса
        Response response = RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(ENDPOINT)
                .queryParam(queryParams)
                .when()
                .get();

        // Проверка кода ответа
        Assert.assertEquals(response.getStatusCode(), 200, "Неверный код ответа");


    }
}