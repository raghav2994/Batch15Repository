package org.Bhavya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class E2EJourney {
    WebDriver driver;
    ChromeOptions options;
    E2EPageObjectModel pom;
    WebDriverWait wait;
    Actions action;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), options);
        pom = new E2EPageObjectModel(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        action = new Actions(driver);

    }

    @Test
    public void addToCart() throws InterruptedException {
        pom.hittingProductPageUrl();
        pom.selectSize().click();
        Assert.assertTrue(pom.isSizeSelected());
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Thread.sleep(5000);
        pom.selectColour().click();
        Thread.sleep(5000);
        pom.selectQuantity();
        Thread.sleep(5000);
        pom.clickingSubmitButton();
        Thread.sleep(5000);
        //Assert.assertTrue(pom.isAddedToCart());
    }
}
