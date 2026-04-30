package Lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Lesson9.MtsOnlineCommission;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class MtsOnlineCommissionTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static MtsOnlineCommission MtsOnlineCommission;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        MtsOnlineCommission = new MtsOnlineCommission(driver, wait);
    }




        @Test
        void communicationServiceTest() {
             driver.get("https://www.mts.by");
             MtsOnlineCommission
                .acceptCookiesButtonClick()
                .communicationServicesSuttonClick()
                .communicationServicesSutton1Click()
                .telNumberLike()
                .sumTextLike()
                .mailTextLike();
    }

        @Test
        void homeInternetConnectionTest() {
            driver.get("https://www.mts.by");
            MtsOnlineCommission
                    .acceptCookiesButtonClick()
                    .communicationServicesSuttonClick()
                    .homeInternetClick()
                    .telNumberLike()
                    .sumTextLike()
                    .mailTextLike();
    }

        @Test
        void installmentPlanTest() {
        driver.get("https://www.mts.by");
        MtsOnlineCommission
                .acceptCookiesButtonClick()
                .communicationServicesSuttonClick()
                .installmentPlanClick()
                .subscriberNumberLike()
                .sumTextLike()
                .mailTextLike();
    }
        @Test
         void arrearsTest() {
        driver.get("https://www.mts.by");
        MtsOnlineCommission
                .acceptCookiesButtonClick()
                .communicationServicesSuttonClick()
                .arrearsClick()
                .accountNumber1Like()
                .sumTextLike()
                .mailTextLike();
    }
        @AfterAll
         static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
