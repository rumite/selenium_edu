import org.testng.annotations.Test;

public class MultiTestsDependency {
    @Test
    public void start() {
        System.out.println("Server started!");
    }

    @Test (dependsOnMethods = "start")
    public void init() {
        System.out.println("Initializing the data for processing");
    }

    @Test (dependsOnMethods = "init")
    public void process() {
        System.out.println("Processing the data");
    }

    @Test (dependsOnMethods = {"init", "start"})
    public void stop() {
        System.out.println("Stopping the server");
    }

}
