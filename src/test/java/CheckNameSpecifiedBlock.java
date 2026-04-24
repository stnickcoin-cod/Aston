import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CheckNameSpecifiedBlock {
    private static WebDriver driver;
    private static WebDriverWait wait;
    String expectedText = "Онлайн пополнение\nбез комиссии";

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Test
    void checkMts(){
        driver.get("https://www.mts.by");

        WebElement acceptCookiesButton =  driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
         acceptCookiesButton.click();

        WebElement nameBlok = wait.until(
                (ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"))));
        String actualText = nameBlok.getText().trim();
        Assertions.assertEquals (actualText, expectedText);
      }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
