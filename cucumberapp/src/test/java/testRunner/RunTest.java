package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/coder/project/workspace/cucumberapp/src/test/resources/Features",
        glue = "StepDefinition",
        dryRun = false,
        monochrome = false,
        plugin = {"pretty", "html:results/cucumber-reports.html", "json:results/cucumber.json", "junit:results/cucumber.xml"}
)
public class RunTest {
}