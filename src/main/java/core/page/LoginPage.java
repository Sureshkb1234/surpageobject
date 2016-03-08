package core.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.ByteChannel;
import java.util.concurrent.TimeUnit;

/**
 * Created by Suresh on 18/02/2016.
 */
public class LoginPage extends SignupPage {

    public static String emailTxt = "input#user_session_email";
    public static String passwordTxt = "input#user_session_password";
    public static String loginBtn = "//input[@value='Log me in!']";
    public static String dropdownBox = "//select[@id='lang']";

    public void userLogin(String email, String password) {

        driver.findElement(By.cssSelector(emailTxt)).sendKeys(email);
        driver.findElement(By.cssSelector(passwordTxt)).sendKeys(password);
        driver.findElement(By.xpath(loginBtn)).click();

    }

    public void languageChoice(String optionValue){
       Select dropdown = new Select(driver.findElement(By.xpath(dropdownBox)));
        dropdown.selectByValue(optionValue);

    }

    public void startProject(){
        driver.findElement(By.linkText("Start a project")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@href,'ref=learn_top')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals("What are you going to create?", driver.findElement(By.cssSelector("h1.light.center.pt2")).getText());
    }
}