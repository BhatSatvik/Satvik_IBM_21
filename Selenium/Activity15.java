import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        //get page
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        //set username
        driver.findElement(By.xpath("//input[starts-with(@name,'name-')]")).sendKeys("admin");
        //set password
        driver.findElement(By.xpath("//input[starts-with(@class,'password-')]")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();
        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(10));
     //   w.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());

        driver.quit();

    }
}
