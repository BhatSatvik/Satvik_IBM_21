import org.testng.annotations.AfterSuite;
import org.testng.annotations.*;

public class Activity2 {
        @BeforeSuite
        public void beforeSuite() {
            System.out.println("Before Suite: Executes before the test suite starts.");
        }

        @AfterSuite
        public void afterSuite() {
            System.out.println("After Suite: Executes after the test suite ends.");
        }

        @BeforeTest
        public void beforeTest() {
            System.out.println("Before Test: Executes before each test tag in the XML.");
        }

        @AfterTest
        public void afterTest() {
            System.out.println("After Test: Executes after each test tag in the XML.");
        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before Class: Executes before the class.");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("After Class: Executes after the class.");
        }

        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Before Method: Executes before each test method.");
        }

        @AfterMethod
        public void afterMethod() {
            System.out.println("After Method: Executes after each test method.");
        }

        @Test
        public void testMethod1() {
            System.out.println("Test Method 1: Executing test case.");
        }

        @Test
        public void testMethod2() {
            System.out.println("Test Method 2: Executing another test case.");
        }
    }


