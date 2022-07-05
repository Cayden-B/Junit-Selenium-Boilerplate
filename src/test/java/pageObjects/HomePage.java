package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static String URL = "http://18.168.19.161/";
    private static final By SIGN_IN_BUTTON = By.cssSelector("#_desktop_user_info > div > a > span");

   public void goTo(){
        driver.get(URL);
   }

   public void navigateToSignInPage(){
       waitAndClick(SIGN_IN_BUTTON);
   }

}
