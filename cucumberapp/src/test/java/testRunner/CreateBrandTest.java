package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/Createbrand.feature" }, glue = {
		"stepDefinition" }, monochrome = false, plugin = { "pretty", "html:target/HTMLReports/report.html" })
public class CreateBrandTest {

}

