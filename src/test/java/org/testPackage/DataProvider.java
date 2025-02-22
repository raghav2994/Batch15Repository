package org.testPackage;

import org.HomePOM;
import org.ItemPOM;
import org.LoginPOM;
import org.dataDrivenExample.ExcelManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.webDriverManagerPackage.WebDriverManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DataProvider {

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

    @org.testng.annotations.DataProvider(name = "LoginData")
    public Object[][] getLoginData() throws IOException {
        return ExcelManager.getData();
    }

    @Test(dataProvider = "LoginData")
    public void E2EForDemoEverWebsite(String UN, String PW) throws InterruptedException {
        WebDriverManager.getDriver();
        LoginPOM login = new LoginPOM(wd);
        login.hitTheUrl().
                fillCredentials(UN,PW).
                clickOnSubmitButton();
    }
}
