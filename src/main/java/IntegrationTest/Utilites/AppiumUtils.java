package IntegrationTest.Utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Timeouts;

import IntegrationTests.DriversMangers.CreateSessionDriver;
import io.appium.java_client.AppiumDriver;

public class AppiumUtils {
	
	public AppiumDriver driver = CreateSessionDriver.driver;
	
	public Timeouts ImplicateWait(int i) {
		
		return driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);

	}

}
