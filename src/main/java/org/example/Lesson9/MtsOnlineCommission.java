package org.example.Lesson9;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class MtsOnlineCommission {
    private static WebDriver driver;
    private static WebDriverWait wait;
    public MtsOnlineCommission(WebDriver driver, WebDriverWait wait) {
        MtsOnlineCommission.driver = driver;
        MtsOnlineCommission.wait = wait;
    }

     String telephonNumber = "Номер телефона";
     String sumT = "Сумма";
     String meilT = "E-mail для отправки чека";
     String subscriberNumberT = "Номер абонента";
     String accountNumberT = "Номер счета на 44";
     String accountNumberT1 = "Номер счета на 2073";

     By acceptCookiesButtonLoc = (By.xpath("//*[@id=\"cookie-agree\"]"));
     By communicationServicesSuttonLoc = (By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
     By communicationServicesSutton1Loc = (By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p"));
     By homeInternetLoc = (By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p"));
     By installmentPlanLoc = (By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"));
     By arrearsLoc = (By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"));
     By telNeumberLoc = (By.xpath("//*[@id=\"connection-phone\"]"));
     By sumTextLoc = (By.xpath("//*[@id=\"connection-sum\"]"));
     By mailTextLoc = (By.xpath("//*[@id=\"connection-email\"]"));
     By subscriberNumberLoc =(By.xpath ("//*[@id=\"score-instalment\"]"));
     By accountNumberLoc = (By.xpath("//*[@id=\"internet-phone\"]"));
     By accountNumber1Loc = (By.xpath("//*[@id=\"score-arrears\"]"));

    public MtsOnlineCommission acceptCookiesButtonClick() {
        WebElement acceptCookiesButton = wait.until(
                ExpectedConditions.elementToBeClickable(acceptCookiesButtonLoc));
        acceptCookiesButton.click();
        return this;
    }

    public MtsOnlineCommission communicationServicesSuttonClick() {
        WebElement communicationServicesSutton = wait.until(
                ExpectedConditions.elementToBeClickable(communicationServicesSuttonLoc));
        communicationServicesSutton.click();
        return this;
    }

    public MtsOnlineCommission communicationServicesSutton1Click() {
        WebElement communicationServicesSutton1 = wait.until(
                (ExpectedConditions.elementToBeClickable(communicationServicesSutton1Loc)));
        communicationServicesSutton1.click();
        return this;
    }

    public MtsOnlineCommission homeInternetClick() {
        WebElement homeInternet = wait.until(
                (ExpectedConditions.elementToBeClickable(homeInternetLoc)));
        homeInternet.click();
        return this;
    }
    public MtsOnlineCommission installmentPlanClick() {
        WebElement installmentPlan = wait.until(
                (ExpectedConditions.elementToBeClickable(installmentPlanLoc)));
        installmentPlan.click();
        return this;
    }

    public MtsOnlineCommission arrearsClick() {
        WebElement arrears = wait.until(
                (ExpectedConditions.elementToBeClickable(arrearsLoc)));
        arrears.click();
        return this;
    }

    public MtsOnlineCommission telNumberLike() {
        WebElement telNumber =wait.until (
                ExpectedConditions.visibilityOfElementLocated(telNeumberLoc));
        String actualText = telNumber.getAttribute("placeholder");
        Assertions.assertEquals(telephonNumber, actualText);
        return this;
}
    public MtsOnlineCommission sumTextLike() {
         WebElement sumText = wait.until(
            (ExpectedConditions.visibilityOfElementLocated(sumTextLoc)));
         String actualText1 = sumText.getAttribute("placeholder");
        Assertions.assertEquals(sumT, actualText1);
         return this;
}
    public MtsOnlineCommission mailTextLike() {
        WebElement mailText = wait.until(
                (ExpectedConditions.visibilityOfElementLocated(mailTextLoc)));
        String actualText2 = mailText.getAttribute("placeholder");
        Assertions.assertEquals(meilT,actualText2);
        return this;
}
    public MtsOnlineCommission subscriberNumberLike() {
         WebElement subscriberNumber = wait.until(
                  (ExpectedConditions.visibilityOfElementLocated(subscriberNumberLoc)));
         String actualText3 = subscriberNumber.getAttribute("placeholder");
        Assertions.assertEquals(accountNumberT,actualText3 );
         return this;
}

    public MtsOnlineCommission accountNumberLike() {
        WebElement accountNumber = wait.until(
                (ExpectedConditions.visibilityOfElementLocated(accountNumberLoc)));
        String actualText4 = accountNumber.getAttribute("placeholder");
        Assertions.assertEquals(accountNumberT1, actualText4);
        return this;
    }

    public MtsOnlineCommission accountNumber1Like() {
        WebElement accountNumber1 = wait.until(
                (ExpectedConditions.visibilityOfElementLocated(accountNumber1Loc)));
        String actualText5 = accountNumber1.getAttribute("placeholder");
        Assertions.assertEquals(accountNumberT1, actualText5);
        return this;
    }

}


