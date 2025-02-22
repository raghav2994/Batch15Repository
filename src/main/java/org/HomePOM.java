package org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePOM {

    private WebDriver driver;

    public HomePOM(WebDriver wd) {
        this.driver = wd;
    }

    private String itemTextLinkXpathLocator = "//div[@class='listing-tem']//a/span[text()='%s']";

    public void clickItem(String itemName) {
        String itemTextLinkLocator = itemTextLinkXpathLocator.replace("%s", itemName);
        By itemTextLink = By.xpath(itemTextLinkLocator);
        WebElement element = driver.findElement(itemTextLink);
        scrollToElement(element);
        element.click();
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
