import core.page.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * Created by Suresh on 15/02/2016.
 */
public class SmokeTestpack extends CreateAnewproject {

    //@Test
    @Ignore
    public void homePageTest()
    {
        openHomepage();
        clickOnsignUp();
        applicationSignup("sreekar1","sreekar1@gmail.com","sreekar1@gmail.com","sreekar12","sreekar12");

    }
   // @Test
   @Ignore
    public void loginTest()
    {
        openHomepage();
        clickOnLogin();
        userLogin("kiran@gmail.com", "kiran123");
    }
    //@Test
    @Ignore
    public void languageTest(){
        openHomepage();
        clickOnLogin();
        userLogin("kiran@gmail.com", "kiran123");
        scrollDownPage();
        //possible selectybyvalues are en, de, es
        languageChoice("es");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //System.out.println("Spanish:" + driver.getTitle());
        Assert.assertEquals("Spanish:Kickstarter", ("Spanish:" + driver.getTitle()));
    }
    //@Test
    @Ignore
    public void languageGermanTest(){
        openHomepage();
        clickOnLogin();
        userLogin("kiran@gmail.com", "kiran123");
        scrollDownPage();
        //possible selectybyvalues are en, de, es
        languageChoice("de");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals("German:Kickstarter",("German:" + driver.getTitle()));
    }

    //@Test
    @Ignore
     public void startProjectTest(){
        openHomepage();
        clickOnLogin();
        userLogin("kiran@gmail.com", "kiran123");
        startProject();
    }

    //@Test
    @Ignore
    public void buildAproject(){
        openHomepage();
        clickOnLogin();
        userLogin("kiran@gmail.com", "kiran123");
        startProject();
        createProject("Comics", "SE");
        startMyProject("FirstProject", "comicexplorin", "3", "Ind", "30", "100");
        discardChanges();
    }
    @Test
    public void deleteAproject(){
        openHomepage();
        clickOnLogin();
        userLogin("kiran@gmail.com", "kiran123");
        startProject();
        createProject("Comics", "SE");
        startMyProject("FirstProject", "comicexplorin", "3", "Ind", "30", "100");
        deleteProject();
    }
}
