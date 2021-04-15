package stepdef;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Utils {
    public static WebDriver driver;

    public void snapShotForFailedScenarios(Scenario scenario) throws IOException {
        System.out.println("Scenario:"+scenario.getName());
        String scenarioName= scenario.getName().replace(" ","_");
        System.out.println("Scenario Name: "+scenarioName);
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String img = "target/screenshots/"+scenarioName+".png";
        System.out.println("img: "+img);
        FileUtils.copyFile(srcFile,new File(img));
    }

    public void initializeBrowser(){
        WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        // options.addArguments("headless");
        driver = new ChromeDriver();
    }

    public void exitBrowser(){
        System.out.println("Driver quit");
        driver.quit();
    }

}
