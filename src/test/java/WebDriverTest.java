import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method------");
    }

    @Test
    public void test1(){
        System.out.println("Test Methods A");
    }

    @Test
    public void test2(){
        System.out.println("Test Method B");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method--------");
    }
}
