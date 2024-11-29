import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HelloSelenium {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();


        driver.get("https://v1.training-support.net/");

        System.out.println("Tittle is : "+driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println("Page tittle is "+driver.getTitle());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']") ).click();






        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}