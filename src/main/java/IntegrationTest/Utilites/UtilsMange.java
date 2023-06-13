package IntegrationTest.Utilites;

import IntegrationTests.DriversMangers.CreateSessionDriver;

public class UtilsMange {

	public CreateSessionDriver createSessionDriver=null;
	public AppiumUtils appiumUtils =null;
	
	public UtilsMange(CreateSessionDriver createSessionDriver,AppiumUtils appiumUtils) {
		this.createSessionDriver= createSessionDriver;
		this.appiumUtils =appiumUtils;
	}
	
	
}
