package org.advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AdvanceSelenium {

        ChromeOptions chromeOptions;
        WebDriver wd;

        @BeforeClass
        public void beforeClassMethod() throws MalformedURLException {
            chromeOptions = new ChromeOptions();
            wd = new RemoteWebDriver(new URL("http://192.168.1.7:4444"),chromeOptions);
        }

        @BeforeMethod
        public void preMethodSteps(){
            wd.get("https://selectorshub.com/iframe-scenario/");
        }

        @Test
        public void iFrameConcept(){
            wd.switchTo().frame("pact1");
            wd.findElement(By.xpath("//*[@id='inp_val']")).sendKeys("Raghav");
            wd.switchTo().frame("pact2");
            wd.findElement(By.xpath("//*[@id='jex']")).sendKeys("Singh");
            wd.switchTo().parentFrame();
            wd.findElement(By.xpath("//*[@id='inp_val']")).sendKeys("Amit");

        }


}
