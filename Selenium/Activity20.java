import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20
{
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("prompt")).click();
        Alert prompt=driver.switchTo().alert();
        System.out.println( prompt.getText());
        prompt.sendKeys("Awesome!");
        prompt.accept();
        driver.quit();
    }
}
