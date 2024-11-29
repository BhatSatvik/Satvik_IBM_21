import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {

    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        System.out.println("title of the page is "+ driver.getTitle());

        driver.findElement(By.id("toggleCheckbox")).click();

        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("willDisappear")));

        driver.findElement(By.id("toggleCheckbox")).click();
        driver.findElement(By.name("toggled")).click();
        driver.findElement(By.id("toggleCheckbox")).click();

        System.out.println("clicked again");
        driver.quit();

    }
}
