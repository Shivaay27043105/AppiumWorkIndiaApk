package Runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", "html:Reports",
"junit:junitreport/cucumber.xml" }, features = "./src/test/java/feature", glue = { "StepDefinitions", "Hooks",
				"Operations" }, tags = "@appium")
public class TestRunner extends AbstractTestNGCucumberTests {

}
