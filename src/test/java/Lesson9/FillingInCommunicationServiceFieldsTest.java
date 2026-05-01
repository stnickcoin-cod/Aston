package Lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Lesson9.FillingInCommunicationServiceFields;
import org.example.Lesson9.MtsOnlineCommission;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FillingInCommunicationServiceFieldsTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static FillingInCommunicationServiceFields FillingInCommunicationServiceFields;

    @BeforeAll
    public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        FillingInCommunicationServiceFields = new FillingInCommunicationServiceFields(driver, wait);
    }
    @Test
    void fillingCommunicationServiceFieldsTest() {
        driver.get("https://www.mts.by");
        FillingInCommunicationServiceFields
                .acceptCookiesButtonClick()
                .numberPhonFild()
                .sumFild()
                .emailFild()
                .continueButton()
                .visualNumberPhone()
                .cardNumberplaceholder()
                .validityPeriodPlaceholder()
                .cvcPlaceholder()
                .firstNameLastNameOnCardPlaceholder()
                .visualSum()
                .visuallogo1()
                .visuallogo2()
                .visuallogo3()
                .visuallogo4()
                .visualSumButon();
    }
        @AfterAll
        static void tearDown() {
            if (driver != null) {
                driver.quit();
        }
    }
}
