package suiteExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9java {

    WebDriver driver;
     @BeforeTest
    void setup()
     {
         driver=new FirefoxDriver();
         driver.get(" https://v1.training-support.net/selenium/javascript-alerts");
     }
     @BeforeMethod
    void bm()
     {
         driver.get(" https://v1.training-support.net/selenium/javascript-alerts");
     }
     @BeforeMethod
     void swit()
     {
         driver.switchTo().defaultContent();
     }
     @Test
     void simpleAlertTestCase()
     {
         Reporter.log("Started test case simpleAlertTestCase");
         driver.findElement(By.id("simple")).click();
         Alert a=driver.switchTo().alert();
         Assert.assertEquals(a.getText(),"This is a JavaScript Alert!");
         a.accept();
         Reporter.log("Finished TestCase");



     }
     @Test
     void onfirmAlertTestCase()
     {
         Reporter.log("Started test case onfirmAlertTestCase");
         driver.findElement(By.id("confirm")).click();
         WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
         w.until(ExpectedConditions.alertIsPresent());

         Alert a=driver.switchTo().alert();
         Assert.assertEquals(a.getText(),"This is a JavaScript Confirmation!");
         a.accept();
         driver.findElement(By.id("confirm")).click();
         Alert b=driver.switchTo().alert();
         b.dismiss();
         Reporter.log("finished tesCase");





     }
     @Test
     void  promptAlertTestCase()
     {
         Reporter.log("Started test case promptAlertTestCase");
         driver.findElement(By.id("prompt")).click();
         Alert a=driver.switchTo().alert();
         a.sendKeys("hii");
       Reporter.log("Sending hii msg");
         Assert.assertEquals(a.getText(),"This is a JavaScript Prompt!");

         a.accept();
         Reporter.log("finished test case");

     }
     @AfterTest
    void cls()
     {
         driver.close();
     }
}
