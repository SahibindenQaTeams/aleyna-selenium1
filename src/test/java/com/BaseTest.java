package com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public ChromeDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach'e girdi");
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(this.driver, 30L);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach'e girdi");
        this.driver.quit();
    }
}

