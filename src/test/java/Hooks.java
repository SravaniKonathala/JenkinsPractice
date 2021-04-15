import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import stepdef.Utils;

import java.io.IOException;

public class Hooks {
    public WebDriver driver;
    Utils utils = new Utils();
    @Before
    public void startUp(){
        System.out.println("*****Entry******");
        utils.initializeBrowser();
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("*****exit******");
        if(scenario.isFailed()){
            try {
                utils.snapShotForFailedScenarios(scenario);
                utils.exitBrowser();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        utils.exitBrowser();;
    }
}
