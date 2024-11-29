import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://v1.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        String hand=driver.getWindowHandle();
        driver.findElement(By.id("launcher")).click();

        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handles =driver.getWindowHandles();
        for (String s :handles)
        {
            System.out.println(s);
        }
        System.out.println(driver.getTitle()+" "+driver.getWindowHandle());
        System.out.println(driver.findElement(By.className("content")).getText());

        for(String h : handles) {
            if (h != hand) {
                driver.switchTo().window(h);
            }
        }
        System.out.println(driver.getTitle());
        w.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        driver.findElement(By.id("actionButton")).click();
        System.out.println(driver.getTitle()+" "+driver.getWindowHandle());
        System.out.println(driver.findElement(By.className("content")).getText());
        String hand2=driver.getWindowHandle();
        Set<String>handles2=driver.getWindowHandles();
        for(String h : handles2) {
            if (h != hand2) {
                driver.switchTo().window(h);
            }
        }
        w.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println(driver.getTitle());
        System.out.println(driver.getTitle()+" "+driver.getWindowHandle());
        System.out.println(driver.findElement(By.className("content")).getText());
        driver.quit();
    }
}
