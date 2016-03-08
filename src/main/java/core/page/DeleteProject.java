package core.page;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Suresh on 06/03/2016.
 */
public class DeleteProject extends CreateAnewproject {
    public static String passTxt = "input#password";
    public static String deleteBtn = "input#commit";


    public void delteMyProject(String password){
        driver.findElement(By.cssSelector(passTxt)).sendKeys(password);
        driver.findElement(By.cssSelector(deleteBtn)).click();
        driver.findElement(By.cssSelector("div#profile_avatar")).isDisplayed();
    }

    public void backToProject(){
        driver.findElement(By.linkText("No,nevermind")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h2.mb1")).isDisplayed());
    }

}
