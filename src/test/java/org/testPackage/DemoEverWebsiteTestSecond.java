package org.testPackage;

import org.HomePOM;
import org.ItemPOM;
import org.LoginPOM;
import org.javabasics.waitManagement.WaitManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.webDriverManagerPackage.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoEverWebsiteTestSecond {

    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;

    WebDriver wd;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void driverSetupBeforeTestExecute(String browserName) throws MalformedURLException {
        System.out.println("Browser: " + browserName);
        switch (browserName) {
            case "chrome":
                chromeOptions = new ChromeOptions();
                wd = new RemoteWebDriver(new URL("http://192.168.1.8:4444"),chromeOptions);
                WebDriverManager.setDriver(wd);
                break;
            case "firefox":
                firefoxOptions = new FirefoxOptions();
                wd = new RemoteWebDriver(new URL("http://192.168.1.8:4444"),firefoxOptions);
                WebDriverManager.setDriver(wd);
                break;
        }

    }

    @Test
    public void E2EForDemoEverWebsite() throws InterruptedException {
        WebDriverManager.getDriver();

        LoginPOM login = new LoginPOM(wd);
        HomePOM home = new HomePOM(wd);
        ItemPOM item = new ItemPOM(wd);

        login.hitTheUrl().
                fillCredentials("akhiljda@gmail.com","Password").
                clickOnSubmitButton();
    }

    @Test
    public void E2EForDemoEverWebsiteSecond() throws InterruptedException {
        WebDriverManager.getDriver();

        LoginPOM login = new LoginPOM(wd);
        HomePOM home = new HomePOM(wd);
        ItemPOM item = new ItemPOM(wd);

        login.hitTheUrl().
                fillCredentials("akhiljda@gmail.com","Password").
                clickOnSubmitButton();
    }

}
