import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JenkinsPractice {
    public static WebDriver driver;

    @Test
    public void testRegistration() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("priyapal111@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("customer_firstname"))).build().perform();
        actions.click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Priya");
    }
}
