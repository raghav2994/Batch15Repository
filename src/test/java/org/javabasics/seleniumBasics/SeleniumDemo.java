package org.javabasics.seleniumBasics;

import org.javabasics.waitManagement.WaitManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDemo {

    public static void main(String[] args) throws MalformedURLException {

        ChromeDriver cdw = new ChromeDriver();
        ChromeOptions cd = new ChromeOptions();
        WebDriver wd = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), cd);

        wd.get("https://www.amazon.com/");

        WaitManager waiting = new WaitManager(wd);



    }
}
