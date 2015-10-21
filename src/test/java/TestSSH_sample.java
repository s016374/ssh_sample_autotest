import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by s016374 on 15/10/21.
 */
public class TestSSH_sample {
    private WebDriver driver = new ChromeDriver();

    @Test
    public void testSSH_sample() throws InterruptedException {
        driver.get("http://10.1.5.79:9090/dc/");
        driver.findElement(By.xpath("/html/body/a[1]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
