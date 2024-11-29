import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());
        WebElement s=driver.findElement(By.tagName("select"));
        Select ss=new Select(s);
        List<WebElement> list=ss.getOptions();
       for(WebElement e:list)
        {
            System.out.println(e.getText());
        }
        ss.selectByVisibleText("Option 2");
        System.out.println(ss.getFirstSelectedOption().getText());
        System.out.println(driver.findElement(By.id("single-value")).getText());
        ss.selectByIndex(3);
        System.out.println(ss.getFirstSelectedOption().getText());
        System.out.println(driver.findElement(By.id("single-value")).getText());
        ss.selectByValue("4");
        System.out.println(ss.getFirstSelectedOption().getText());
        System.out.println(driver.findElement(By.id("single-value")).getText());
        driver.quit();

    }
}
