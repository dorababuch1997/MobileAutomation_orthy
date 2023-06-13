package IntegrationTests_stepdefination;

import IntegrationTest.Utilites.LogBack;
import IntegrationTests.DriversMangers.CreateSessionDriver;
import io.cucumber.java.en.Given;


public class BaseStep {
	
		CreateSessionDriver createSessionDriver;
	
	public BaseStep() {
		createSessionDriver = new CreateSessionDriver();
		
	}
	
	@Given("^User has slideshare android app$")
	public void userhasslideshareandroidapp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		createSessionDriver.CreateAppiumDriver("Andriod");
	}

}
