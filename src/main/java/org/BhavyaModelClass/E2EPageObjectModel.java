package org.BhavyaModelClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class E2EPageObjectModel {
    WebDriver driver;
    Actions action;
    private String ProductPageUrl="https://demo.evershop.io/men";
    private By ProductLink=By.xpath("//div/a/span[text()='Nike react phantom run flyknit 2']");
    private By size=By.partialLinkText("X");
    private By colour=By.partialLinkText("Black");
    private By quantity=By.xpath("//div/input[@type='text'][@name='qty']");
    private By addToCart=By.xpath("//div/button[@type='button']/span[text()='ADD TO CART']");
    private By alertBox=By.xpath("//div[@role='alert']");


    private By userNameField = By.name("email");
    private By passwordField = By.name("password");
    private By sumbmitButtonXpath = By.xpath("//button[@type='submit']");
    private String homePageURL = "https://demo.evershop.io/account/login";

    private By viewCart=By.partialLinkText("VIEW CART");
    private By checkout=By.xpath("//div/a/span[text()='CHECKOUT']");
    private By contactDetails =By.xpath("//div[@class='col-span-2']/span");

    public E2EPageObjectModel hitTheUrl(){
        driver.get(homePageURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public E2EPageObjectModel fillCredentials(String userName, String password){
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public void clickOnSubmitButton(){
        driver.findElement(sumbmitButtonXpath).click();
    }

    public E2EPageObjectModel(WebDriver driver){
        this.driver = driver;
        action=new Actions(driver);
    }
    public void hittingProductPageUrl(){
        driver.get(ProductPageUrl);
    }
    public void selectProduct(){
        driver.findElement(ProductLink).click();
    }
    public WebElement selectSize(){
        return driver.findElement(size);
    }
    public WebElement selectColour(){
        return driver.findElement(colour);
    }
    public void selectQuantity(String qty){
        driver.findElement(quantity).sendKeys(qty);
    }
    public void clickingAddToCart(){
        driver.findElement(addToCart).click();
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
    public void viewCart(){
        driver.findElement(viewCart).click();
    }
    public void selectCheckoutButton(){
        driver.findElement(checkout).click();
    }
    public String verifyContactDetails(){
        return driver.findElement(contactDetails).getText();

    }
}
