import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());
        List<WebElement> one=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("number of columns :"+one.size());
        List<WebElement> two=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println("Number of rows :"+two.size());
        List<WebElement> three=driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
        for(WebElement e:three)
        {
            System.out.println(e.getText());
        }
        String s=driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]")).getText();
        System.out.println(s);

        driver.quit();
    }
}
