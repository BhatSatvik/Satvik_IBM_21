package suiteExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity6java {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {

        driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        // Locate elements
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        // Perform actions
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    @Test(dependsOnMethods = {"loginTest"})
    void test()
    {
        WebElement e=driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals(e.getText(),"Welcome Back, admin");
    }

    @AfterClass
    public void tearDown() {


            driver.close();

    }
}
