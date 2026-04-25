import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckFieldsAndButton {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Test
    void checkText() {
        driver.get("https://www.mts.by");

        WebElement acceptCookiesButton = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cookie-agree\"]"))));
        acceptCookiesButton.click();

        WebElement fieldNumber = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"connection-phone\"]"))));
        fieldNumber.click();
        fieldNumber.sendKeys("297777777");

        WebElement sumRub = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"connection-sum\"]"))));
        sumRub.click();
        sumRub.sendKeys("500");

        WebElement emailField = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"connection-email\"]"))));
        emailField.click();
        emailField.sendKeys("test@mail.ru");

        WebElement continueButton = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pay-connection\"]/button"))));
        continueButton.click();


    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
