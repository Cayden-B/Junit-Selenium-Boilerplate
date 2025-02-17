package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ShoppingCartPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class BuyJourney {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private SignInPage signInPage = new SignInPage(driver);

    @Before
    public void individualSetUp() {
        homepage.goTo();
    }

    /**
     * Select Item from homepage, takes to product page
     * On homepage
     * Hover over a product's image
     * Click More Button
     * Verify product page is displayed
     */
    @Test

    public void selectItemFromHomepage() {
        WebElement blouse = driver.findElement(By.cssSelector("[alt='Blouse']"));
        blouse.click();
        Assert.assertEquals("Blouse", driver.getTitle());
    }

    /**
     * Add product to Cart from homepage
     * Hover over product from homepage
     * Click add to cart
     * Verify added to cart
     */
    @Test
    public void addProductToCartFromHomepage() {
        WebElement blouse = driver.findElement(By.cssSelector("[alt='Blouse']"));
        blouse.click();
        WebElement add = driver.findElement(By.cssSelector("div.add"));
        add.click();
        basketpage.purchaseSuccessful();
//        driver.quit();
    }


    /**
     * Add product to cart from Product page
     * On product page
     * Select Quantity
     * Select Size
     * Select Colour (if available)
     * Click add to cart
     * Verify Added to Cart
     */
    @Test

    public void addProductToCartFromProductPage() {
        WebElement blouse = driver.findElement(By.cssSelector("[alt='Blouse']"));
        blouse.click();
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        quantity.sendKeys("0");
        WebElement colour = driver.findElement(By.cssSelector("[value='8']"));
        colour.click();
        WebElement add = driver.findElement(By.cssSelector("div.add"));
        add.click();
        basketpage.purchaseSuccessful();
//        driver.quit();
    }
}
