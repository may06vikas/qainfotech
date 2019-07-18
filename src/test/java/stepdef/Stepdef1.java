package stepdef;

import action.Action1;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef1 {
	Action1 du=new Action1();
	
@Given("^Open the Website$")
public void open_the_Website()   {
	du.open_the_Website();
	System.out.println("The webpage open successfully");
	

	
}
@Then("^Verify the Website$")
public void verify_the_website()  {
	du.open_the_Website();
	System.out.println("The site is verified");
	
}
@When("^Find how many links are avaliable$")
public void how_many_liks_are_avaliable()  {
	du.how_many_liks_are_avaliable();
	System.out.println("The list are: ");
	
}
@Then("^Click on the last link$")
public void click_on_the_link() {
	System.out.println("Get the result");
}

}
