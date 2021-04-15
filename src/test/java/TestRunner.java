import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import stepdef.Utils;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".")
public class TestRunner  {
}