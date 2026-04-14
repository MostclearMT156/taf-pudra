import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DriverSingleton {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Work\\Documents\\Java\\Driver\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
            driver.manage().window().maximize();
        }
        return driver;
    }

    private DriverSingleton(){

    }

    public static void quit(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
