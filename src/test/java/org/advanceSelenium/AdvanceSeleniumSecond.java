package org.advanceSelenium;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AdvanceSeleniumSecond {

    ChromeOptions chromeOptions;
    WebDriver wd;

    @BeforeClass
    public void beforeClassMethod() throws MalformedURLException {
        chromeOptions = new ChromeOptions();
        wd = new RemoteWebDriver(new URL("http://192.168.1.7:4444"),chromeOptions);
    }

//    @BeforeMethod
//    public void preMethodSteps(){
//        wd.get("https://selectorshub.com/xpath-practice-page/");
//    }
//
//    @Test
//    public void alertBoxHandlingTest() throws InterruptedException {
//        wd.findElement(By.xpath("//button[@onclick='windowAlertFunction()']")).click();
//        System.out.println(wd.switchTo().alert().getText());
//        wd.switchTo().alert().accept();
//    }

    @Test
    public void actionTest(){
        Actions a1 = new Actions(wd);

        wd.get("https://demo.evershop.io/account/login");
        WebElement el1 = wd.findElement(By.name("email"));

        a1.moveToElement(el1).click().keyDown(Keys.SHIFT).sendKeys("raghav").keyUp(Keys.SHIFT).perform();
        a1.moveToElement(el1).contextClick().perform();




    }



}
