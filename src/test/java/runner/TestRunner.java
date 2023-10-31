package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource/Features",
		glue = {"stepDefinition", "hooks"},
		dryRun = false,
		monochrome = true,
		plugin =  {"pretty","html:target/CucumberReports/cucumberReport.html"},
		publish = true
		)





public class TestRunner {

}
