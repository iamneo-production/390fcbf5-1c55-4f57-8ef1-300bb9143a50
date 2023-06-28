package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/coder/project/workspace/cartest/src/test/resources",
        glue = "StepDefination",
        dryRun = false,
        monochrome = false,
        plugin = {"pretty","html:Reports/cucumber-reports.html"}
)

public class Run {

}
