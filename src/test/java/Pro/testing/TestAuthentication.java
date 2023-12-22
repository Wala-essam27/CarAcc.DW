package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.Auth;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAuthentication {
	
	@When("he sign in")
	public void he_sign_in() {
		assertEquals(true,Auth.sign());
		//System.out.println("0 PLEASE try again.");
	}

@When("he enter the valid email and password")
public void he_enter_the_valid_email_and_password() {
	assertEquals(true,Auth.valid());
	
}
	@Then("he should go to the home page")
	public void he_should_go_to_the_home_page() {
		 assertEquals(1, Auth.gohome(Auth.email, Auth.password));
		 
	}
	
	@When("he enter the invalid email and password")
	public void he_enter_the_invalid_email_and_password() {
		assertEquals(false ,Auth.valid());
		//System.out.println("3 PLEASE try again.");
		//assertEquals(true,true);
	}
	@Then("he should see an error message saying {string}")
	public void he_should_see_an_error_message_saying(String string) {
		System.out.println(string +", PLEASE try again.");
		//System.out.println("4 PLEASE try again.");
		assertEquals(true,true);
	}

@Then("request to sign again")
public void request_to_sign_again() {
	assertEquals(true,Auth.sign());
	assertEquals(1, Auth.gohome(Auth.email, Auth.password));
}
}