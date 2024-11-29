import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

import java.awt.*;
import java.sql.Time;
import java.time.Duration;

public class Funactivity {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cheese");
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[7]/center/input[1]")).click();
        Actions act=new Actions(driver);
        act.keyDown(Keys.ENTER).build().perform();

        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hdtb-tls\"]")));
       WebElement t= driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]"));
       w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hdtb-tls\"]")));
        t.click();
       //       act.moveToElement(t).click().build().perform();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        System.out.println(driver.findElement(By.id("result-stats")).getText());
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));


        driver.quit(); }
}
