import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.text.Style;
import java.sql.Driver;

public class activity4 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of the page is : "+driver.getTitle());
        System.out.println("the header printing is :"+ driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
        System.out.println("the header color printing is :"+ driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color"));
        System.out.println("classser are :"+ driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class"));
        System.out.println("classser are :"+ driver.findElement(By.xpath("//button[text()='Grey']")).getText());

        driver.quit();
    }
}
