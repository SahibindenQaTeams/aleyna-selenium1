package com;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CorporateUser extends BaseTest{

    @BeforeEach
    public void setUp(){
        wait = new WebDriverWait(driver,30);
        this.driver.get("https://secure.sahibinden.com/kayit/kurumsal/");
        System.out.println("Kayit sayfasina yonlendirildi ");
    }

    @Test
    public void createCorporateUserId()  {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        WebElement cookieAcceoption = this.driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookieAcceoption.click();
        System.out.println(cookieAcceoption.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        WebElement username = this.driver.findElement(By.id("name"));
        username.sendKeys("Aleyna");
        System.out.println(username.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surname")));
        WebElement surname = this.driver.findElement(By.id("surname"));
        surname.sendKeys("Işık");
        System.out.println(surname.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement email = this.driver.findElement(By.id("email"));
        email.sendKeys("aleyna"+(Math.random()*100)+"@mailinator.com");
        System.out.println(email.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        WebElement password = this.driver.findElement(By.id("password"));
        password.sendKeys("password1");
        System.out.println(password.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
        WebElement phoneInput = this.driver.findElement(By.id("phone"));
        phoneInput.sendKeys("8502224444");
        System.out.println(password.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));
        Select realEstateSelect = new Select(this.driver.findElement(By.id("category")));
        realEstateSelect.selectByVisibleText("Emlak");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
        Select citySelect = new Select(this.driver.findElement(By.id("city")));
        citySelect.selectByVisibleText("İstanbul");
        this.wait.until(ExpectedConditions.elementToBeClickable(By.id("town")));
        Select townSelect = new Select(this.driver.findElement(By.id("town")));
        townSelect.selectByVisibleText("Ataşehir");
        this.wait.until(ExpectedConditions.elementToBeClickable(By.id("quarter")));
        Select quarterSelect = new Select(this.driver.findElement(By.id("quarter")));
        quarterSelect.selectByVisibleText("Örnek Mh.");
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("document.getElementById('limitedCompany').click()");
        System.out.println("Limited Anonim Şirketi seçildi. ");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxOfficeCity")));
        Select taxOfficeCitySelect = new Select(this.driver.findElement(By.cssSelector("#taxOfficeCity")));
        taxOfficeCitySelect.selectByVisibleText("İstanbul");
        this.wait.until(ExpectedConditions.elementToBeClickable(By.id("taxOffice")));
        Select taxOfficeSelect = new Select(this.driver.findElement(By.id("taxOffice")));
        taxOfficeSelect.selectByVisibleText("Anadolu Kurumlar Vergi Dairesi");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("taxNumber")));
        WebElement taxNumber = this.driver.findElement(By.id("taxNumber"));
        taxNumber.sendKeys("7390146556");
        System.out.println(taxNumber.getAttribute("placeholder"));
        js.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        System.out.println("Agreement check e tiklandi ");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signUpButton")));
        WebElement signUpBotton = this.driver.findElement(By.id("signUpButton"));
        signUpBotton.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmSubmit")));
        WebElement confirmSubmit = this.driver.findElement(By.id("confirmSubmit"));
        confirmSubmit.click();
    }

    @Test
    public void createCorporateUserCss() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        WebElement cookieAcceoption = this.driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookieAcceoption.click();
        System.out.println(cookieAcceoption.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        WebElement username = this.driver.findElement(By.cssSelector("#name"));
        username.sendKeys("Aleyna");
        System.out.println(username.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#surname")));
        WebElement surname = this.driver.findElement(By.cssSelector("#surname"));
        surname.sendKeys("Işık");
        System.out.println(surname.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
        WebElement email = this.driver.findElement(By.cssSelector("#email"));
        email.sendKeys("aleyna" + (Math.random() * 100) + "@mailinator.com");
        System.out.println(email.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        WebElement password = this.driver.findElement(By.cssSelector("#password"));
        password.sendKeys("password1");
        System.out.println(password.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#phone")));
        WebElement phoneInput = this.driver.findElement(By.cssSelector("#phone"));
        phoneInput.sendKeys("8502224444");
        System.out.println(password.getAttribute("placeholder"));
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#category")));
        Select realEstateSelect = new Select(this.driver.findElement(By.cssSelector("#category")));
        realEstateSelect.selectByVisibleText("Emlak");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#city")));
        Select citySelect = new Select(this.driver.findElement(By.cssSelector("#city")));
        citySelect.selectByVisibleText("İstanbul");
        this.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#town")));
        Select townSelect = new Select(this.driver.findElement(By.cssSelector("#town")));
        townSelect.selectByVisibleText("Ataşehir");
        this.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#quarter")));
        Select quarterSelect = new Select(this.driver.findElement(By.cssSelector("#quarter")));
        quarterSelect.selectByVisibleText("Örnek Mh.");
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("document.getElementById('limitedCompany').click()");
        System.out.println("Limited Anonim Şirketi seçildi. ");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxOfficeCity")));
        Select taxOfficeCitySelect = new Select(this.driver.findElement(By.cssSelector("#taxOfficeCity")));
        taxOfficeCitySelect.selectByVisibleText("İstanbul");
        this.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#taxOffice")));
        Select taxOfficeSelect = new Select(this.driver.findElement(By.cssSelector("#taxOffice")));
        taxOfficeSelect.selectByVisibleText("Anadolu Kurumlar Vergi Dairesi");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#taxNumber")));
        WebElement taxNumber = this.driver.findElement((By.cssSelector("#taxNumber")));
        taxNumber.sendKeys("7390146556");
        System.out.println(taxNumber.getAttribute("placeholder"));
        js.executeScript("document.querySelector('#endUserLicenceAgreement').click()");
        System.out.println("Agreement check e tiklandi ");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signUpButton")));
        WebElement signUpBotton = this.driver.findElement(By.cssSelector("#signUpButton"));
        signUpBotton.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#confirmSubmit")));
        WebElement confirmSubmit = this.driver.findElement(By.cssSelector("#confirmSubmit"));
        confirmSubmit.click();
    }

}
