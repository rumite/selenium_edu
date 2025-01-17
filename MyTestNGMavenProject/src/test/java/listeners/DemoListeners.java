package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Succeeded : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped : " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Finished : " + context.getName());
    }
}
