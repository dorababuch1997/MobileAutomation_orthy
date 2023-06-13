package IntegrationTests.DriversMangers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import IntegrationTest.Utilites.FilePaths;
import IntegrationTest.Utilites.LogBack;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;

public class CreateSessionDriver {
	
	
	public static AppiumDriver driver =null;
	public FilePaths filePaths;
	public Properties properties;
	public FileInputStream fileInputStream;
	public LogBack log;
	
	public void CreateAppiumDriver(String OS) {
		
		if (OS.equalsIgnoreCase("Andriod")) {
			try {
				andriodDriver();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (OS.equalsIgnoreCase("IOS")) {
			
		}
	}
	
	public void andriodDriver() throws MalformedURLException {
		File file = new File(readConfig("dev", "Andriodpath"));
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Andriod Emulator");
		cap.setCapability("platFormName", "Andriod");
		cap.setCapability("appPackage", "net.slideshare.mobile");
		cap.setCapability("appActivity", "net.slideshare.mobile.ui.SplashActivity");
//		cap.setCapability("name",method.getName());
		cap.setCapability("app",file.getAbsolutePath() );
		driver = new AndroidDriver( new URL("http://localhost:4723/wd/hub"), cap);
		
	}
	
	
	public void activeApp() {
		((InteractsWithApps) driver).activateApp("net.slideshare.mobile");

	
	}
	
	public void terminateApp() {
		((InteractsWithApps) driver).terminateApp("net.slideshare.mobile");

	}
	
	public Properties readProperties(String env) {
		
		try {
			if (env.equalsIgnoreCase("dev")) {
				fileInputStream = new FileInputStream(filePaths.dev_configpath);	
			}else {
				fileInputStream = new FileInputStream(filePaths.qa_configpath);	
			}
			properties = new Properties();
			properties.load(fileInputStream);
			log.info("readfile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	
	public  String readConfig(String env,String keys) {
		String properties = readProperties(env).getProperty(keys);
		return properties;
	}
	
	public AppiumDriver getdriverr() {
		return driver;
	
	}
	public void AppiumScreecnCapture(Scenario scenario) {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		byte[] screen = screenshot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screen, "image/png", scenario.getName());
		
	}
	
	
}
