import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());
        List<WebElement> cols=driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("number of cols "+cols.size());
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        List<WebElement> rows2=driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Number of rows including footer "+(rows.size()+rows2.size())+"else number rows :"+rows.size());
        System.out.println("2nd row  2nd col :"+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[1]")).click();
        System.out.println("2nd row  2nd col :"+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
        System.out.println("Value of footer cells :");
        for(WebElement e:rows2)
        {
            System.out.println(e.getText());
        }
        
        driver.quit();
    }
}
