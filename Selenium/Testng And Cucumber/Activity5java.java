package suiteExample;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5java {
    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    void getm()
    {
        driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test(groups = {"text"})
    void test1()
    {
        String s=driver.getTitle();
        System.out.println(s);
    }
    @Test(groups = {"text"})
    void test2()
    {
        WebElement e=driver.findElement(By.id("third-header"));
        Assert.assertTrue(e.isDisplayed());
    }
    @Test(groups = {"text"})
    void test3()
    {
        WebElement e=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        String ss=e.getCssValue("color");
        System.out.println(ss);
        Assert.assertEquals(ss,"rgb(33, 186, 69)");
    }
    @Test(groups = {"button"})
    void test4()
    {
        WebElement e=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[4]"));
        Assert.assertTrue(e.isDisplayed());
        Assert.assertEquals(e.getText(),"Olive");
    }
    @Test(groups = {"button"})
    void test5()
    {
        WebElement e=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[1]"));
        System.out.println(e.getCssValue("color"));
        Assert.assertTrue(e.isDisplayed());
    }


    @AfterClass(alwaysRun = true)
    void closem()
    {
        driver.close();
    }
}
