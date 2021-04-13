package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyStepdefs {
    public static WebDriver driver;

    @Given("^I launch the browser$")
    public void i_launch_the_browser() throws Throwable {
        WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("headless");
        driver = new ChromeDriver();

    }

    @Given("^I launch the application$")
    public void i_launch_the_application() throws Throwable {
        driver.get("http://automationpractice.com/index.php");
    }

    @Then("^I quit the browser$")
    public void i_quit_the_browser()  {
        driver.quit();
    }

}
