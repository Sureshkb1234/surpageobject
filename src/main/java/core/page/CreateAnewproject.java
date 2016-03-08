package core.page;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
/**
 * Created by Suresh on 25/02/2016.
 */
public class CreateAnewproject extends LoginPage {

    Alert myAlert;

   /*ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource("firefox.png").getAbsoluteFile());*/

    public static String projDdownBox = "//span[@id='category_select']";
    public static String projecttitleTxt = "input#project_name";
    public static String countryDdownBox = "//select[@id='project_country']";
    public static String startBtn = "commit";
    public static String cCountryLink = "//a[@href='#!']";
    public static String shortBrp = "textarea#project_blurb";
    public static String catdropdownBox = "select#project_category_id";
    public static String projectLocationTxt = "project_location_name";
    public static String  fundDuration = "project_duration";
    public static String  fundGoal = "input#project_goal";

    //public static String uploadimage = "input#project_photo";

    public void createProject(String Pname, String optionValue) {
        driver.findElement(By.xpath(projDdownBox)).click();
        driver.findElement(By.linkText(Pname)).click();
        driver.findElement(By.xpath(cCountryLink)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select cdropdown = new Select(driver.findElement(By.xpath(countryDdownBox)));
        cdropdown.selectByValue(optionValue);
        driver.findElement(By.name(startBtn)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals("Start building your project!", driver.findElement(By.cssSelector("h2.mb1")).getText());

    }

        public void startMyProject(String Projecttitle,String ShortBlurp,
                             String optionValue,String countryName,
                             String FundingDuration,String FundingGoal)

    {
        //driver.findElement(By.cssSelector(uploadimage)).sendKeys("F:\IMG_2058.JPG");
        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //val imagePath = getClass.getClassLoader.getResource(imageList.get(randomImg))
        //val file = new File(imagePath.getPath)
        //val imageLocation = file.getAbsolutePath
        //val imageUploader = find(xpath("//div/input[@type= 'file']")).get
        //imageUploader.underlying.sendKeys(imageLocation)

        driver.findElement(By.cssSelector(projecttitleTxt)).sendKeys(Projecttitle);
        driver.findElement(By.cssSelector(shortBrp)).sendKeys(ShortBlurp);
        Select catdropdown = new Select(driver.findElement(By.cssSelector(catdropdownBox)));
        catdropdown.selectByValue(optionValue);
        //driver.findElement(By.id(projectLocationTxt)).sendKeys(ProjLocation);
        driver.findElement(By.id(projectLocationTxt)).sendKeys(countryName, Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.id("duration_duration")).isSelected());
        driver.findElement(By.id(fundDuration)).sendKeys(FundingDuration);
        driver.findElement(By.cssSelector(fundGoal)).sendKeys(FundingGoal);
    }
    public DeleteProject deleteProject() {
        driver.findElement(By.xpath("//a[contains(@title,'Delete this project')]")).click();
        myAlert= driver.switchTo().alert();
        myAlert.accept();
        Assert.assertTrue(driver.findElement(By.cssSelector("input#commit")).isDisplayed());
        return new DeleteProject();
    }
    public void discardChanges(){
        driver.findElement(By.cssSelector("a.grey-dark")).click();
        //Assert.assertFalse(driver.findElement(By.xpath("//a[contains(@text(),'Discard changes')]")).isDisplayed());
    }
    }



