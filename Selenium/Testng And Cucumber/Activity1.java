import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity1 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass
            public void beforem(){
        driver.get("https://v1.training-support.net/");
        System.out.println(driver.getTitle());
        System.out.println("Before method");
}

        // Create a new instance of the Firefox driver





 @AfterClass
        public  void afterm(){
        driver.quit();}

    @Test
    void test2()
    {
        System.out.println(driver.getTitle());
    }
    @Test
    void test3()
    {
        String s=driver.getTitle();
        Assert.assertEquals(s,"Training Support");

    }
    @Test
    void test4()
    {
        WebElement e=driver.findElement(By.id("about-link"));
        e.click();

    }
    }
