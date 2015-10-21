package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

/**
 * Created by s016374 on 15/10/21.
 */
public class MyStepdefs {

    private WebDriver driver = new ChromeDriver();

    @Then("^open url \"([^\"]*)\"$")
    public void open_url(String arg1) throws Throwable {
        MainPage mainPage = new MainPage(driver);
        mainPage.openURL(arg1);
    }

    @Then("^check helloworld$")
    public void check_helloworld() throws Throwable {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkHelloworld();
    }
}
