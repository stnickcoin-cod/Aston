import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

public class ApiGetTest {

    private static final String BASE_URL = "https://postman-echo.com";
    private static final String ENDPOINT = "/get";

    @Test
    public void testGetRequest() {
        // Формируем параметры запроса в Map
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("foo1", "bar1");
        queryParams.put("foo2", "bar2");

        // Выполняем запрос с параметрами
        Response response = RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(ENDPOINT)
                .queryParams(queryParams)  // передаём все параметры разом
                .when()
                .get();

        // Проверяем код ответа
        Assert.assertEquals(response.getStatusCode(), 200, "Ожидался код 200 OK");

        // Валидируем тело ответа
        validateResponseBody(response, queryParams);
    }

    private void validateResponseBody(Response response, Map<String, String> expectedQueryParams) {
        // Формируем ожидаемый URL
        String expectedUrl = BASE_URL + ENDPOINT + "?foo1=bar1&foo2=bar2";

        // Проверяем URL в ответе
        String actualUrl = response.jsonPath().getString("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL в ответе не соответствует ожидаемому");

        // Проверяем параметры args — явная проверка каждого поля
        String actualFoo1 = response.jsonPath().getString("args.foo1");
        String expectedFoo1 = expectedQueryParams.get("foo1");
        Assert.assertEquals(actualFoo1, expectedFoo1, "Значение параметра foo1 не совпадает");

        String actualFoo2 = response.jsonPath().getString("args.foo2");
        String expectedFoo2 = expectedQueryParams.get("foo2");
        Assert.assertEquals(actualFoo2, expectedFoo2, "Значение параметра foo2 не совпадает");

        // Проверяем заголовок host
        String actualHost = response.jsonPath().getString("headers.host");
        Assert.assertEquals(actualHost, "postman-echo.com", "Заголовок host неверен");
        response.then().log().body();
    }
}