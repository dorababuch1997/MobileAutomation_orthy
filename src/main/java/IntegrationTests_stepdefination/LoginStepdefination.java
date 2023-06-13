package IntegrationTests_stepdefination;



import IntegrationTest.Utilites.UtilsMange;
import IntegrationTests.Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginStepdefination {
	
	LoginPage loginPage;
	UtilsMange utilsMange;
	public LoginStepdefination(UtilsMange utilsMange) {
		this.utilsMange=utilsMange;
		loginPage = new LoginPage(utilsMange.createSessionDriver.driver,utilsMange);
	}
	
	
	@Given("user has {string} username and password")
	public void user_has_username_and_password(String string) {
	    
		
	}

	@When("user enters credentials")
	public void user_enters_credentials() {
	    
		loginPage.LoginTest("dorababu@gmail.com", "1215654");
	}

	@When("taps on {string} button")
	public void taps_on_button(String string) {
	    
		
	}

	@Then("{string} button should be visible")
	public void button_should_be_visible(String string) {
	 
		
	}

	@Then("user should be able to scroll")
	public void user_should_be_able_to_scroll() {
	   
		
	}

	@Then("long press the search icon")
	public void long_press_the_search_icon() {
	    
	    
	}




	
}