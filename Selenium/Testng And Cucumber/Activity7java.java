package suiteExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Activity7java {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new FirefoxDriver();
        // Open the target URL
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public String[][] credentials() {
        return new String[][] {
                { "admin", "password" },  // First set of credentials
                { "user", "pass" }        // Second set of credentials
        };
    }

    @Test(dataProvider = "Authentication")
    public void loginTest(String username, String password) {

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        // Input credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // Click login
        loginButton.click();


        WebElement confirmationMessage = driver.findElement(By.id("action-confirmation"));

        // Assert that the displayed message matches the expected message
        String actualMessage = confirmationMessage.getText();
        Assert.assertEquals(actualMessage, "Welcome Back, admin");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
