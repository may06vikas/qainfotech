package stepdef;

import action.manage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdef3 {
	manage xyz=new manage();
	@Given("^Navigate to homepage$")
	public void navigate_to_homepage() {
		xyz.navigate_to_homepage();
		System.out.println("The cookies is being deleted");
	}
	@When("^Create cookies$")
	public void create_cookies() {
		xyz.create_cookies();
		System.out.println("THe cookies is generated ");
	}
	@Then("^Turning webpage into full screen$")
	public void Full_Screen() {
		xyz.Full_Screen();
		System.out.println("Webpage is now in full screen");
	}
	
   @Then("^Get the X coordinates and Y coordinates$")
    public void get_the_coordinates() {
	xyz.get_the_coordinates(); 
	System.out.println("The coordinates are");
}
	@Then("^Refresh the webpage$")
	public void refresh_the_webpage() {
		xyz.refresh_the_webpage();
		System.out.println("The page has been refresh");
	}
	@Then("^finally close the window$")
	public void close_the_window() {
		System.out.println("The window is closed");
	}
}
