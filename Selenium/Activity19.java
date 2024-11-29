import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("simple")).click();
        Alert simp=driver.switchTo().alert();
        System.out.println( simp.getText());
        simp.accept();
        driver.findElement(By.id("confirm")).click();
        Alert conf=driver.switchTo().alert();
        System.out.println( conf.getText());
        conf.accept();
        driver.findElement(By.id("confirm")).click();
        conf.dismiss();
        driver.findElement(By.id("prompt")).click();
        Alert prompt=driver.switchTo().alert();
        System.out.println( prompt.getText());
        prompt.sendKeys("hello world");
        prompt.accept();
        driver.quit();
    }
}
