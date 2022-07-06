package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class ShoppingCartPage extends BasePage {

    private static final By SUCCESSFUL = By.cssSelector(".cart-products-count");

    public void purchaseSuccessful(){
        WebElement modal = driver.findElement(SUCCESSFUL);
        Assert.assertTrue(elementIsVisible(modal));
    }
    public void deleteItem(){
        waitAndClick(By.cssSelector(".cart-line-product-actions > .remove-from-cart"));
    }
    public void closePage(){
        waitAndClick(By.cssSelector(".cart-content-btn > .btn-primary"));
    }
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


}
