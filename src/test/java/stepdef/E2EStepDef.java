package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.HomePOM;
import org.ItemPOM;
import org.LoginPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class E2EStepDef {

    private static final Logger log = LoggerFactory.getLogger(E2EStepDef.class);
    private WebDriver driver;

    LoginPOM login;
    HomePOM home;
    ItemPOM item;

    @Before
    public void setUpWebDrive() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://192.168.1.17:4444"), options);
        login = new LoginPOM(driver);
        home = new HomePOM(driver);
        item = new ItemPOM(driver);
    }

    @After
    public void tearDownWebDriver(){
        if(driver != null){
            driver.quit();
        }
    }


    @Given("User is already loggeIn with credentials as {string} and {string}")
    public void userIsAlreadyLoggeInWithCredentials(String username, String password){
        login.hitTheUrl().fillCredentials(username,password).clickOnSubmitButton();
    }

    @Given("User clicks on Item {string}")
    public void selectAnItem(String itemName) throws InterruptedException {
        Thread.sleep(5000);
        home.clickItem(itemName);
    }

    @When("User selects the item option size as {string} and colour as {string}")
    public void userSelectsTheItemOptionSizeAndColour(String size, String colour) throws InterruptedException {
        Thread.sleep(5000);
        item.fillQuantity("2").selectSize(size).selectColour(colour);
    }

    @When("User clicks on AddToCart")
    public void userClicksOnAddToCart() throws InterruptedException {
        Thread.sleep(5000);
        item.clickAddToCartButton();
    }


}
