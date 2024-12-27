package executionorder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestNGUsage {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite from TestNGUsage class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test from TestNGUsage class");
    }
}
