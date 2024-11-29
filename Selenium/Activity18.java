import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

       // WebElement e=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/select"));
        WebElement e=driver.findElement(By.id("multi-select"));
        Select ss=new Select(e);
        ss.selectByVisibleText("Javascript");
        ss.selectByIndex(4);
        ss.selectByIndex(5);
        ss.selectByIndex(6);

        ss.selectByValue("node");
        ss.deselectByIndex(5);
        List<WebElement>list=ss.getAllSelectedOptions();
        for (WebElement ei:list)
            System.out.println(ei.getText());
        driver.quit();
    }

}
