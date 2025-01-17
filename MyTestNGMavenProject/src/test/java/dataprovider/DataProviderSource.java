package dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderSource {
    @DataProvider(name = "scenarioData")
    public static Object[][] getScenarioData(Method method) {
        String testCase = method.getName();
        if ("scenario1".equals(testCase)) {
            return new Object[][]{{"Scenario1 Data"}};
        } else if ("scenario2".equals(testCase)) {
            return new Object[][]{{"Scenario2 Data"}};
        } else {
            return new Object[][]{{"Common Scenario Data"}};
        }
    }

    @DataProvider(name = "TestType")
    public static Object[][] getTestTypeData(ITestContext context) {
        String testName = context.getName();
        if ("IntegrationLevel".equals(testName)) {
            return new Object[][]{{"Integration test data"}};
        } else if ("AcceptanceLevel".equals(testName)) {
            return new Object[][]{{"Acceptance test data"}};
        } else {
            return new Object[][]{{"Common test data"}};
        }
    }
}
