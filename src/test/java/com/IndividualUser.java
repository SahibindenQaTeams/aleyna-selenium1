package com;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class IndividualUser extends BaseTest{

    @BeforeEach
    public void setUp(){
        wait = new WebDriverWait(driver,30);
        this.driver.get("https://www.sahibinden.com/kayit");
        System.out.println("Kayit sayfasina yonlendirildi ");
    }

    @Test
    public void createIndividualUserId() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
    WebElement username = this.driver.findElement(By.id("name"));
        username.sendKeys("Aleyna");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
    WebElement surname = this.driver.findElement(By.id("surname"));
        surname.sendKeys("Işık");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
    WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("aleyna"+(Math.random()*100)+"@mailinator.com");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    WebElement password = this.driver.findElement(By.id("password"));
        password.sendKeys("password1");
    JavascriptExecutor js = this.driver;
        js.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signUpButton")));
    WebElement signUpBotton = this.driver.findElement(By.id("signUpButton"));
        signUpBotton.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmSubmit")));
    WebElement confirmSubmit = this.driver.findElement(By.id("confirmSubmit"));
        confirmSubmit.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("email")));
    String returnEmail = this.driver.findElement(By.className("email")).getText();
        System.out.println(returnEmail);
}

    @Test
    public void createIndividualUserCss() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        WebElement username = this.driver.findElement(By.cssSelector("#name"));
        username.sendKeys("Aleyna");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        WebElement surname = this.driver.findElement(By.cssSelector("#surname"));
        surname.sendKeys("Işık");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("aleyna"+(Math.random()*100)+"@mailinator.com");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        WebElement password = this.driver.findElement(By.cssSelector("#password"));
        password.sendKeys("password1");
        JavascriptExecutor js = this.driver;
        js.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signUpButton.btn.btn-new.btn-strong")));
        WebElement signUpBotton = this.driver.findElement(By.cssSelector("#signUpButton.btn.btn-new.btn-strong"));
        signUpBotton.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit")));
        WebElement confirmSubmit = this.driver.findElement(By.cssSelector("#confirmSubmit"));
        confirmSubmit.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#container .email-activation .email")));
        String returnEmail = this.driver.findElement(By.cssSelector("#container .email-activation .email")).getText();
        System.out.println(returnEmail);
    }
}

