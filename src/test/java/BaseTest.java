import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void warmUp(){
        driver = new EdgeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
