import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass
    public void beforem(){
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());
    }

    // Create a new instance of the Firefox driver



    @Test
    void test2()
    {
        WebElement e1=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Assert.assertTrue(e1.isDisplayed());
        WebElement e2=driver.findElement(By.id("password"));
        Assert.assertTrue(e2.isDisplayed());

    }

    @Test
    void test3()
    {
        WebElement e1=driver.findElement(By.id("username"));
        Assert.assertTrue(e1.isDisplayed());
        WebElement e2=driver.findElement(By.id("password"));
        Assert.assertTrue(e2.isDisplayed());
        e1.sendKeys("admin");
        e2.sendKeys("password");


    }


}
