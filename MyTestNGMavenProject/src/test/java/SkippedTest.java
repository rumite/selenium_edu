import org.testng.annotations.Test;

public class SkippedTest {
    @Test
    public void executedTest() {
        System.out.println("This is executed!");
    }

    @Test (enabled = false)
    public void skippedTest() {
        System.out.println("That is skipped");
    }
}
