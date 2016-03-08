package core.driver;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.util.concurrent.TimeUnit;

/**
 * Created by Suresh on 15/02/2016.
 */
public class DriverFactory {

    ProfilesIni profile = new ProfilesIni();
    FirefoxProfile ffprofile = profile.getProfile("Selenium");
    public WebDriver driver = new FirefoxDriver(ffprofile);

    @Before
    public void start(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void exit(){
        driver.quit();
    }

}
