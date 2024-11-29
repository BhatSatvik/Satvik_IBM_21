import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");

        System.out.println("Title of the page is : "+driver.getTitle());

        Actions builder=new Actions(driver);
        builder.keyDown("S").build().perform();
        builder.keyDown(Keys.CONTROL).keyDown("a").keyDown(Keys.CONTROL).keyDown("c").build().perform();

        driver.quit();


    }
}
