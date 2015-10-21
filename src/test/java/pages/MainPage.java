package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by s016374 on 15/10/21.
 */
public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }


    public void openURL(String url) {
        driver.get(url);
    }

    public void checkHelloworld() {
        driver.findElement(By.xpath("/html/body/a[1]")).click();
    }
}
