import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/ajax");

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button")).click();
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h1")));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h1")).getText());
        w.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late!"));
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h3")).isDisplayed());
        driver.quit();

    }
}
