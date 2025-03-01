package org.Bhavya;

import org.BhavyaModelClass.E2EPageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class E2EJourney {
    WebDriver driver;
    ChromeOptions options;
    E2EPageObjectModel pom;
    WebDriverWait wait;
    Actions action;
    String email="akhiljda@gmail.com";
    String password="Password";

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), options);
        pom = new E2EPageObjectModel(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        action = new Actions(driver);

    }
    @Test (priority = 0)
    public void loginTest(){
        pom.hitTheUrl();
        pom.fillCredentials(email,password);
        pom.clickOnSubmitButton();

    }

    @Test(priority = 1)
    public void addToCart() throws InterruptedException {
        pom.hittingProductPageUrl();
        wait.until(ExpectedConditions.titleContains("An Amazing EverShop Store"));
        pom.selectProduct();
        Assert.assertEquals(driver.getTitle(),"Nike React Phantom Run Flyknit 2");
        pom.selectSize().click();
        Thread.sleep(1000);
        pom.selectColour().click();
        Thread.sleep(1000);
        pom.selectQuantity("1");
        Thread.sleep(1000);
        pom.clickingAddToCart();
        pom.viewCart();
        pom.selectCheckoutButton();
        Assert.assertEquals(pom.verifyContactDetails(),email);

    }


}
