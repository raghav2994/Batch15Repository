package org.javabasics.waitManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManager {

    public WebDriver driver;

    public WaitManager(WebDriver wd){
        this.driver = wd;
    }

    public WebDriverWait wait;
    public Wait fluentWait;


    public void implicitWait(int timeOutValue){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOutValue));
    }

    public void explictWait(By locator, int timeOutValue){
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutValue));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void fluentWait(By locator, int timeOutValue, int pollTimeValue){
        fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(timeOutValue))
                .pollingEvery(Duration.ofSeconds(pollTimeValue))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
