import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Utilities;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver = null;

    @BeforeMethod
    public void openPortal() throws IOException {
        driver = new ChromeDriver();
        driver.get(Utilities.getPropertyValue("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
