import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity2Main {


        WebDriver driver ;
        @BeforeClass
        void inst()
        {

            driver=new FirefoxDriver();
            driver.get( "https://v1.training-support.net/selenium/target-practice");
        }
    @Test
    void getdriv()
    {
        driver.get( "https://v1.training-support.net/selenium/target-practice");
    }
    @AfterClass
    void clos()
    {
        driver.close();
    }
    @Test
    void getTitle()
    {

        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");

    }
    @Test
    void findElement() {
        WebElement blackButton = driver.findElement(By.cssSelector(".ui.black.button"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "Black");
    }

    @Test
    (enabled = false)
    public void thirdTest() {
        Assert.assertTrue(true, "Third test passed!");
    }
    @Test
    void forthas()
    {
        throw new SkipException("Skipping the fourth test.");
    }

}
