import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("input[class$='-username']")).sendKeys("harvy");
        driver.findElement(By.cssSelector("input[class$='-password']")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("ajs@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button")).click();
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        driver.quit();


    }
}
