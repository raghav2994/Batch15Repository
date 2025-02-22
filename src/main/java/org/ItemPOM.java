package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPOM {

    private WebDriver driver;

    private final By itemNameText = By.xpath("//h1[@class='product-single-name']");

    private final By quantityTextBox = By.xpath("//input[@name='qty']");

    private final By  addToCartButton = By.xpath("//button[@type='button']");

    private String itemSizeXpathLocator = "(//ul[contains(@class, 'variant-option-list')])[1]/li/a[text()='%s']";

    private String itemColourXpathLocator = "(//ul[contains(@class, 'variant-option-list')])[2]/li/a[text()='%s']";


    public ItemPOM(WebDriver wd) {
        this.driver = wd;
    }

    public String getItemTitlePresentOnProductPage(){
        return driver.findElement(itemNameText).getText();
    }

    public ItemPOM fillQuantity(String quantity){
        driver.findElement(quantityTextBox).clear();
        driver.findElement(quantityTextBox).sendKeys(quantity);
        return this;
    }

    public ItemPOM selectSize(String size){
        String itemSizeLocator = itemSizeXpathLocator.replace("%s",size);
        By itemSizeLink = By.xpath(itemSizeLocator);
        driver.findElement(itemSizeLink).click();
        return this;
    }

    public ItemPOM selectColour(String colour){
        String itemColourLocator = itemColourXpathLocator.replace("%s",colour);
        By itemColourLink = By.xpath(itemColourLocator);
        driver.findElement(itemColourLink).click();
        return this;
    }

    public ItemPOM clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
        return this;
    }
}
