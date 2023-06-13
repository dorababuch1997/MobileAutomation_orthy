package IntegrationTests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import IntegrationTest.Utilites.UtilsMange;
import IntegrationTests.DriversMangers.CreateSessionDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class LoginPage {
	private AppiumDriver driver;
	public UtilsMange utilsMange=null;
	
	public LoginPage(AppiumDriver driver,UtilsMange utilsMange) {
		this.driver=driver;
		this.utilsMange=utilsMange;
		
		PageFactory.initElements(driver, this);
	}
	
	@AndroidBy(id = "net.slideshare.mobile:id/slideshare_login")
	AndroidElement slideloginButton;
	
	@AndroidBy(id="net.slideshare.mobile:id/login")
	AndroidElement slideusername;
	
	@AndroidBy(id="net.slideshare.mobile:id/password")
	AndroidElement slideupassword;
	
	@AndroidBy(id="net.slideshare.mobile:id/sign_in_button")
	AndroidElement slidesignButton;
	
	
	public void LoginTest(String username,String password) {
		utilsMange.appiumUtils.ImplicateWait(20);
		slideloginButton.click();
		slideusername.sendKeys(username);
		slideupassword.sendKeys(password);
		slidesignButton.click();
		
	}
	
	
}
