import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("print title :" +driver.getTitle());

        WebElement ball=driver.findElement(By.id("draggable"));

        WebElement box1=driver.findElement(By.id("droppable"));
        WebElement box2=driver.findElement(By.id("dropzone2"));

        Actions builder=new Actions(driver);
        builder.clickAndHold(ball).moveToElement(box1).release().build().perform();
       // builder.dragAndDrop(ball,box1).build().perform();
        if(box1.findElement(By.tagName("p")).getText().equals("Dropped!"))
            System.out.println("Ball was dropped");
        builder.dragAndDrop(ball,box2).build().perform();
        if(box2.findElement(By.tagName("p")).getText().equals("Dropped!"))
            System.out.println("Ball was dropped");


        driver.quit();


    }
}
