package org.Bhavya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class E2EPageObjectModel {
    WebDriver driver;
    Actions action;
    private String ProductPageUrl="https://demo.evershop.io/men/nike-react-phantom-run-flyknit-2-180";
    private By size=By.partialLinkText("X");
    private By colour=By.partialLinkText("Black");
    private By quantity=By.xpath("//div/input[@type='text'][@name='qty']");
    private By submitButton=By.xpath("//div/button[@type='button']/span[text()='ADD TO CART']");
    private By alertBox=By.xpath("//div[@role='alert']");


    public E2EPageObjectModel(WebDriver driver){
        this.driver = driver;
        action=new Actions(driver);
    }
    public void hittingProductPageUrl(){
        driver.get(ProductPageUrl);
    }
    public WebElement selectSize(){
        return driver.findElement(size);
    }
    public WebElement selectColour(){
        return driver.findElement(colour);
    }
    public void selectQuantity(){
        driver.findElement(quantity).sendKeys("1000000");
    }
    public void clickingSubmitButton(){
        driver.findElement(submitButton).click();
    }
    public boolean isSizeSelected(){
        return driver.findElement(size).isEnabled();
    }
    public boolean isAddedToCart(){
        List<WebElement> elements = driver.findElements(alertBox);

        if (!elements.isEmpty()) {
            return false;
        } else {
            return true;
        }

    }

}
