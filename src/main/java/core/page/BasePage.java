package core.page;

import core.driver.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * Created by Suresh on 15/02/2016.
 */
public class BasePage extends DriverFactory {

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public static String url = "https://www.kickstarter.com";

    //SignupPage sp = new SignupPage();

    public void openHomepage(){
        driver.navigate().to(url);
        Assert.assertEquals("Kickstarter", driver.getTitle());
    }

    public void clickOnsignUp() {
        driver.findElement(By.linkText("Sign up")).click();
        //System.out.println(driver.getTitle());
        Assert.assertNotNull(driver.getTitle());
    }
    public void clickOnLogin(){
        driver.findElement(By.linkText("Log in")).click();
        Assert.assertNotNull(driver.getTitle());
    }

    public void scrollDownPage(){
        jse.executeScript("window.scrollBy(0,2800)", "");
    }


}


