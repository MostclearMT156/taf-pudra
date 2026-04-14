import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void warmUp(){

    }

    @AfterMethod
    public void tearDown(){
        DriverSingleton.quit();
    }
}
