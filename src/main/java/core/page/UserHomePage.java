package core.page;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Suresh on 18/02/2016.
 */
public class UserHomePage extends LoginPage {

    //public static String headerLinks = "ul.primary-menu";
     public static String linkText1;
     //public static String linkText2 = "Start a project";
     //public static String linkText3 = "About us";


    public void verifyLinks(String linkText1) {
        //List<WebElement> mylist = driver.findElements(By.tagName("a"));
        //System.out.println("Total links:" + (mylist.size()));
        //for(WebElement element: mylist){
           //String href =  element.getAttribute("href");
            //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            //driver.get(href);
            //Assert.assertNotNull(driver.getTitle());

        driver.findElement(By.linkText(linkText1)).click();

        }
    }


