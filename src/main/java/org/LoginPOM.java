package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {

    WebDriver driver;

    private By userNameField = By.name("email");
    private By passwordField = By.name("password");

    private By sumbmitButtonXpath = By.xpath("//button[@type='submit']");

    public LoginPOM(WebDriver wd){
        this.driver = wd;
    }

    private String pageURL = "https://demo.evershop.io/account/login";

    public LoginPOM hitTheUrl(){
        driver.get(pageURL);
        return this;
    }

    public LoginPOM fillCredentials(String userName, String password){
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public void clickOnSubmitButton(){
        driver.findElement(sumbmitButtonXpath).click();
    }

}
