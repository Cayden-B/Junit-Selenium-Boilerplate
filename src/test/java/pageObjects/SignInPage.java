package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private static final By EMAIL_ADDRESS_INPUT_BOX = By.cssSelector("#customer-form > section > div:nth-child(5) input");
    private static final By EMAIL_ADDRESS_INPUT_BOX2 = By.cssSelector("#login-form > section > div:nth-child(2) > div.col-md-6 > input");
    private static final By PASSWORD_INPUT_BOX = By.cssSelector("#customer-form > section > div:nth-child(6)  input");
    private static final By PASSWORD_INPUT_BOX2 = By.cssSelector("#login-form > section > div:nth-child(3) > div.col-md-6 > div > input");
    private static final By FIRST_NAME_INPUT_BOX = By.cssSelector("#customer-form > section > div:nth-child(3) input");
    private static final By LAST_NAME_INPUT_BOX = By.cssSelector("#customer-form > section > div:nth-child(4) input");
    private static final By CREATE_NEW_ACCOUNT_BUTTON = By.cssSelector("#content > div > a");
    private static final By ALREADY_REGISTERED_ALERT = By.cssSelector("div.form-group.row.has-error");
    private static final By SAVE = By.cssSelector("#customer-form > footer > button");
    private static final By SAVE2 = By.cssSelector("#login-form > footer > button");
    private static final By authFailed = By.cssSelector(".help-block > .alert");



    public void enterEmailAddress(String emailAddress) {
        findAndType(EMAIL_ADDRESS_INPUT_BOX, emailAddress);
    }
    public void enterEmailAddress2(String emailAddress) {
        findAndType(EMAIL_ADDRESS_INPUT_BOX2, emailAddress);
    }

    public void enterPassWord(String passWord) {
        findAndType(PASSWORD_INPUT_BOX, passWord);
    }
    public void enterPassWord2(String passWord) {
        findAndType(PASSWORD_INPUT_BOX2, passWord);
    }

    public void enterFirstName(String firstName) {
        findAndType(FIRST_NAME_INPUT_BOX, firstName);
    }

    public void enterLastName(String lastName) {
        findAndType(LAST_NAME_INPUT_BOX, lastName);
    }

    public void clickCreateAnAccount() {
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }

    public void saveAccount() {
        waitAndClick(SAVE);
    }
    public void saveAccount2() {
        waitAndClick(SAVE2);
    }

    public void alreadyRegisteredAlertPresent() {
        WebElement alertBox = driver.findElement(ALREADY_REGISTERED_ALERT);
        Assert.assertTrue(elementIsVisible(alertBox));
    }




}


