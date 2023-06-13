package CucumberIntegration.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/test/resources/Features",
		glue = {"IntegrationTests_stepdefination"}
			//,	plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class LoginRunner extends AbstractTestNGCucumberTests {

	
	
}
