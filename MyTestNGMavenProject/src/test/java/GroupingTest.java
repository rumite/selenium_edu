import org.testng.annotations.Test;

public class GroupingTest {
    @Test(groups = {"smoke", "regression"})
    public void loginTest() {
        System.out.println("Smoke and Regression");
    }

    @Test(groups = "regression")
    public void minorTest() {
        System.out.println("Regression only");
    }

    @Test(groups = "smoke")
    public void smokeTest() {
        System.out.println("Smoke only");
    }


}
