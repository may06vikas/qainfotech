package stepdef;

import action.navigate;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stefdef2 {
	navigate abc=new navigate();
	
	@When("^Enter text in search box$")
	public void enter_text_in_search_box()  {
		abc.enter_text_in_search_box();
		System.out.println("The text entered in the search box");
		}
@Then("^Click on the search button$")
public void click_on_button()  {
	abc.click_on_button();
	System.out.println("Search result appears");
	
}

@When("^Go back to homepage$")
public void back_to_homepage() {
	abc.back_to_homepage();
	System.out.println("Successfully done ");
}
@When("^Get the full location of element$")
public void get_the_location() {
	abc.get_the_location();
	System.out.println("The location is: ");
}
@When("^Again go onto forward page$")
public void again_go_onto_forward_pages() {
	abc.again_go_onto_forward_pages();
	System.out.println("The operation is performed");
}
@When("^Get the full location of element $")
public void get_full_location() {
	
}
}
