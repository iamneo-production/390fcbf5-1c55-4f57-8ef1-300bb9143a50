package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "/home/coder/project/workspace/car rental project/src/test/java/car rental project/resources/Features/Createbrand.feature" }, glue = {
		"stepDefinition" }, monochrome = false, plugin = { "pretty", "html:target/HTMLReports/report.html" })
public class CreateBrandTest {

}

