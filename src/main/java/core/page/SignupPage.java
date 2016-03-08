package core.page;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Suresh on 15/02/2016.
 */
public class SignupPage extends BasePage {

        public static String usernameTxt = "user_name";
        public static String emailTxt = "user[email]";
        public static String confirmemailTxt="user_email_confirmation";
        public static String passwordTxt = "input#user_password";
        public static String confirmpasswordTxt = "//input[contains(@id,'user_password_confirmation')]";
        public static String signmeupBtn = "//input[@value=\"Sign me up!\"]";

    public void applicationSignup(String name, String email, String confirmEmail, String password, String confirmPassword){
        driver.findElement(By.id(usernameTxt)).sendKeys(name);
        driver.findElement(By.name(emailTxt)).sendKeys(email);
        driver.findElement(By.id(confirmemailTxt)).sendKeys(confirmEmail);
        driver.findElement(By.cssSelector(passwordTxt)).sendKeys(password);
        driver.findElement(By.xpath(confirmpasswordTxt)).sendKeys(confirmPassword);
        driver.findElement(By.xpath(signmeupBtn)).click();

        Assert.assertTrue(driver.findElement(By.linkText("Me")).isDisplayed());



    }
}
