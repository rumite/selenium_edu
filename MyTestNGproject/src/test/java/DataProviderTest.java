import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "getData")
    public void testAddition(int actual, int expected) {
        int actualValue = actual + 20;
        Assert.assertEquals(actualValue, expected);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {100, 120},
                {200, 220},
                {300, 310},
                {480, 500},
                {500, 520}
        };
    }
}
