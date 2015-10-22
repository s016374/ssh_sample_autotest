import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by s016374 on 15/10/21.
 */
public class TestSSH_sample {
    private static final String TEST_URL = "http://10.1.5.79:9090/dc/";
    private static WebDriver driver;
    @Before
    public void setUp() throws Exception {
//        driver = new ChromeDriver();
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://10.1.5.79:4444/wd/hub"), dc);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    @Test
    public void testSSH_sample() throws InterruptedException {
        driver.get(TEST_URL);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/a[1]")).click();
//        assertEquals("HelloWorld success", driver.findElement(By.xpath("/html/body/p")));
        Thread.sleep(2000);
        driver.close();
    }
}
