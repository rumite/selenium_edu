package executionorder;

import org.testng.annotations.*;

public class AnnotationsTest {
    @Test
    public void annotationsTest() {
        System.out.println("A test from annotations");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSute() {
        System.out.println("After Suite");
    }
}
