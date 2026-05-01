package org.example.Lesson9;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillingInCommunicationServiceFields {
    private static WebDriver driver;
    private static WebDriverWait wait;
    public FillingInCommunicationServiceFields(WebDriver driver, WebDriverWait wait) {
    FillingInCommunicationServiceFields.driver = driver;
    FillingInCommunicationServiceFields.wait = wait;
    }


    By acceptCookiesButtonLoc = (By.xpath("//*[@id=\"cookie-agree\"]"));
    By communicationServicesSuttonLoc = (By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
    By fieldNumberLoc = (By.xpath("//*[@id=\"connection-phone\"]"));
    By fildsumLoc = (By.xpath("//*[@id=\"connection-sum\"]"));
    By fildemailLoc = (By.xpath("//*[@id=\"connection-email\"]"));
    By contenueButtonLoc = (By.xpath("//*[@id=\"pay-connection\"]/button"));
    By visualSumLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span"));
    By sumInButtonLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/span"));
    By correctNumberPhonLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span"));
    By cardNumberLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));//текст номер карты
    By validityPeriodLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label"));//срок действия
    By cvcLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label"));
    By firstNameLastNameOnCardLoc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label"));
    By logo1Loc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]"));
    By logo2Loc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]"));
    By logo3Loc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]"));
    By logo4Loc = (By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]"));

    public FillingInCommunicationServiceFields acceptCookiesButtonClick() {
        WebElement acceptCookiesButton = wait.until(
                ExpectedConditions.elementToBeClickable(acceptCookiesButtonLoc));
        acceptCookiesButton.click();
        return this;
    }

    public FillingInCommunicationServiceFields communicationServicesSuttonClick() {
        WebElement communicationServicesSutton = wait.until(
                ExpectedConditions.elementToBeClickable(communicationServicesSuttonLoc));
        communicationServicesSutton.click();
        return this;
    }




    public FillingInCommunicationServiceFields numberPhonFild() {
        WebElement numberPhonFild = wait.until(
                ExpectedConditions.elementToBeClickable(fieldNumberLoc));
        numberPhonFild.click();
        numberPhonFild.sendKeys("297777777");
        return this;
    }

    public FillingInCommunicationServiceFields sumFild() {//поле суммы
        WebElement sumFild = wait.until(
                ExpectedConditions.elementToBeClickable(fildsumLoc));
        sumFild.click();
        sumFild.sendKeys("100");
        return this;
    }

    public FillingInCommunicationServiceFields emailFild() {//поле почты
        WebElement emailFild = wait.until(
                ExpectedConditions.elementToBeClickable(fildemailLoc));
        emailFild.click();
        emailFild.sendKeys("test@mail.ru");
        return this;
    }

    public FillingInCommunicationServiceFields continueButton() {//кнопка продолжить
        WebElement continueButton = wait.until(
                ExpectedConditions.elementToBeClickable(contenueButtonLoc));
        continueButton.click();
        return this;
    }

    public FillingInCommunicationServiceFields visualSum() {

        WebElement visualSum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span")));
        String actualText = visualSum.getText().trim();
        Assertions.assertEquals("100.00 BYN", actualText);
        return this;
    }

    public FillingInCommunicationServiceFields visualSumButon() {

        WebElement visualSumButon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.valueOf("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/span"))));
        String actualText1 = visualSumButon.getText().trim();
        Assertions.assertEquals("Оплатить 100.00 BYN", actualText1);
        return this;
    }

    public FillingInCommunicationServiceFields visualNumberPhone() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.payment-widget-iframe")));
        WebElement visualNumberPhone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.valueOf("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span"))));
        String actualText2 = visualNumberPhone.getText().trim();
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777", actualText2);
        return this;
    }

    public FillingInCommunicationServiceFields cardNumberplaceholder() {// номер карты

        WebElement cardNumberplaceholder = wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberLoc));
        String actualText3 = cardNumberplaceholder.getText().trim();
        Assertions.assertEquals("Номер карты", actualText3);
        return this;
    }

    public FillingInCommunicationServiceFields validityPeriodPlaceholder() {//срок действия
        ;
        WebElement validityPeriodPlaceholder = wait.until(ExpectedConditions.visibilityOfElementLocated(validityPeriodLoc));
        String actualText4 = validityPeriodPlaceholder.getText().trim();
        Assertions.assertEquals("Срок действия", actualText4);
        return this;
    }

    public FillingInCommunicationServiceFields cvcPlaceholder() {

        WebElement cvcPlaceholder = wait.until(ExpectedConditions.visibilityOfElementLocated(cvcLoc));
        String actualText5 = cvcPlaceholder.getText().trim();
        Assertions.assertEquals("CVC", actualText5);
        return this;
    }

    public FillingInCommunicationServiceFields firstNameLastNameOnCardPlaceholder() {

        WebElement firstNameLastNameOnCardPlaceholder = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameLastNameOnCardLoc));
        String actualText6 = firstNameLastNameOnCardPlaceholder.getText().trim();
        Assertions.assertEquals("Имя и фамилия на карте", actualText6);
        return this;
    }

    public FillingInCommunicationServiceFields visuallogo1() {

        WebElement visuallogo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(logo1Loc));
        visuallogo1.isDisplayed();
        return this;
    }

    public FillingInCommunicationServiceFields visuallogo2() {

        WebElement visuallogo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(logo2Loc));
        visuallogo2.isDisplayed();
        return this;
    }

    public FillingInCommunicationServiceFields visuallogo3() {

        WebElement visuallogo3 = wait.until(ExpectedConditions.visibilityOfElementLocated(logo3Loc));
        visuallogo3.isDisplayed();
        return this;
    }

    public FillingInCommunicationServiceFields visuallogo4() {

        WebElement visuallogo4 = wait.until(ExpectedConditions.visibilityOfElementLocated(logo4Loc));
        visuallogo4.isDisplayed();
        return this;
    }
}





