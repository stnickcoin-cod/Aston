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

public class CheckLogo {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    void checkLogo() {
        driver.get("https://www.mts.by");
        WebElement acceptCookiesButton = wait.until(
                (ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cookie-agree\"]"))));
        acceptCookiesButton.click();

        WebElement logo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img")));
        logo1.isDisplayed();
        WebElement logo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img")));
        logo2.isDisplayed();
        WebElement logo3 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img")));
        logo3.isDisplayed();
        WebElement logo4 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img")));
        logo4.isDisplayed();
        WebElement logo5 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img")));
        logo5.isDisplayed();
    }
        @AfterAll
        public static void tearDown () {
            driver.quit();
        }
    }



