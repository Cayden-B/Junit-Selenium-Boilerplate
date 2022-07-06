package Tests;

import org.junit.*;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ShoppingCartPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 30/10/2016.
 */
public class SignIn {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private SignInPage signInPage = new SignInPage(driver);


    @Before
    public void individualSetUp() {
        homepage.goTo();
    }


    /**
     * Sign in as Registered User
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign In
     * Verify My Account is Displayed
     */
    @Test
    public void signInAsRegisteredUser() {
        homepage.navigateToSignInPage();
        signInPage.enterEmailAddress2("cdotbdot@gmail.com");
        signInPage.enterPassWord2("Password");
        signInPage.saveAccount2();
//        driver.quit();
    }

    /**
     * Cannot sign in as unregistered customer
     * Pre-Conditions - Must have Email address and Password of unregistered customer
     * Navigate to Sign in Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign in
     * Verify Error Message is Displayed
     */
    @Test
    public void signInAsUnRegisteredUser() {
        homepage.navigateToSignInPage();
        signInPage.enterEmailAddress2("cbotdot@gmail.com");
        signInPage.enterPassWord2("Password");
        signInPage.saveAccount2();
        WebElement authText = driver.findElement(By.cssSelector(".help-block .alert"));
        String actual = authText.getText();
        Assert.assertEquals("Authentication failed.", actual);
//        driver.quit();
    }

    /**
     * Forgotten Password
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Click Forgotten Password
     * Enter E mail Address
     * Click retrieve password
     * Confirmation message displayed
     */
    @Test
    @Ignore
    public void forgottenPassword() {

    }

    /**
     * Able to sign out
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Click sign out
     * Verify customer signed out
     */
    @Test
    @Ignore
    public void signOut() {

    }
}
