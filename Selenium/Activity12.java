import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        boolean a=driver.findElement(By.id("dynamicText")).isEnabled();
        System.out.println("is it selected "+a);
        driver.findElement(By.id("dynamicText")).click();
        a=driver.findElement(By.id("dynamicText")).isSelected();
        System.out.println("is it selected "+a);
        driver.quit();
    }

}
