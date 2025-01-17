import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 4)
    public void p4test() {
        System.out.println("Priority: 4");
    }

    @Test(priority = 3)
    public void p3test() {
        System.out.println("Priority: 3");
    }

    @Test(priority = 2)
    public void p2test() {
        System.out.println("Priority: 2");
    }

    @Test(priority = 1)
    public void p1test() {
        System.out.println("Priority: 1");
    }

    @Test
    public void defaultP0test() {
        System.out.println("Priority: default");
    }


}
