import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {
    @Test
    public void assertionTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void assetionEql() {
        Assert.assertEquals("Hello", "Hello", "Failed!!");
    }

    @Test
    public void softAssertTest() {
        SoftAssert softAssert = new SoftAssert();
        // Failed
        softAssert.assertEquals(404, 200);
        // Failed
        softAssert.assertTrue("Hello".equals("hello"));
        // Passed
        softAssert.assertNotEquals("Black", "White");
        softAssert.assertAll();
    }


}
