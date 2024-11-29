import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Activity5
{
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the page is :"+driver.getTitle());
        Actions actions=new Actions(driver);
        //click left
        actions.click().build().perform();
        System.out.println(driver.findElement(By.xpath("//div[@class='active']")).getText());
        //double click
        actions.doubleClick().build().perform();
        System.out.println(driver.findElement(By.className("active")).getText());
        //right clicl
        actions.contextClick().build().perform();
        System.out.println(driver.findElement(By.className("active")).getText());
        //close
        driver.quit();


    }
}
