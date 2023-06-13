package IntegrationTests_stepdefination;

import java.net.MalformedURLException;


import IntegrationTest.Utilites.LogBack;
import IntegrationTest.Utilites.UtilsMange;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	public UtilsMange utilsMange=null;
	
	public LogBack logback;
	Scenario scenario;
	public Hooks(UtilsMange utilsMange) {
		this.utilsMange=utilsMange;
	
	}

	@Before
	public void DriverScreenSetUp(Scenario scenario) throws MalformedURLException {
		
		logback.info("+++++++DriverScreenSetUpStarted+++++++++=");
		logback.startScenario(scenario.getName());
		if (utilsMange.createSessionDriver.driver==null) {
			utilsMange.createSessionDriver.CreateAppiumDriver("Andriod");
		//	utilsMange.createSessionDriver.AppiumScreecnCapture(scenario);
		}
	
		
	}
	
	@After
	public void DriverScreenClose(Scenario scenario) {
		logback.endScenario(scenario.getName());
		utilsMange.createSessionDriver.AppiumScreecnCapture(scenario);
	//	utilsMange.createSessionDriver.driver.quit();
		
	}
	
}
