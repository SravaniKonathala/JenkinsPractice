package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyStepdefs extends Utils{
    public static Logger log = LoggerFactory.getLogger(MyStepdefs.class);

    @Given("^I launch the browser$")
    public void i_launch_the_browser()  {
        log.info("I launch the browser.");
        log.info("My Driver: {}",driver);
    }

    @Given("^I launch the application$")
    public void i_launch_the_application()  {
        driver.get("http://automationpractice.com/inde.php");
    }

    @Then("^I quit the browser$")
    public void i_quit_the_browser()  {
       // driver.findElement(By.name("name")).click();
    }

}
