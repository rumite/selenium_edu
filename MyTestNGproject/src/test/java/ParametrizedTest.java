import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {

    @Parameters({"username", "password"})
    @Test
    public void credentialsTest(String username, String password) {
        System.out.println("Login: " + username);
        System.out.println("Password: " + password);
    }

}
