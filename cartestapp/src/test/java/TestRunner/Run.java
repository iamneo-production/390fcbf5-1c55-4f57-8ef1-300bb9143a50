package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/coder/project/workspace/cartestapp/src/test/resources",
        glue = "sample1",
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:results/cucumber-reports.html", "json:results/cucumber.json", "junit:results/cucumber.xml"}
)
public class Run {
}
