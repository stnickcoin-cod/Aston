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

public class CheckLink {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }


    @Test
    void checkLink() {
        driver.get("https://www.mts.by");

        WebElement acceptCookiesButton = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cookie-agree\"]"))));
        acceptCookiesButton.click();

        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")));
        link.click();
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();}
}
