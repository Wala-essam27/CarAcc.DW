package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.Auth;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAuthentication {
	
	@When("he sign in")
	public void he_sign_in() {
		assertEquals(true,Auth.sign());
	}

@When("he enter the valid email and password")
public void he_enter_the_valid_email_and_password() {
	assertEquals(true,Auth.valid());
	
}
	@Then("he should go to the home page")
	public void he_should_go_to_the_home_page() {
		 assertEquals(true, Auth.gohome(Auth.email, Auth.password));
		 
	}
	
	@When("he enter the invalid email and password")
	public void he_enter_the_invalid_email_and_password() {
		assertEquals(false ,Auth.valid());
		
	}
	@Then("he should see an error message saying {string}")
	public void he_should_see_an_error_message_saying(String string) {
		System.out.println(string +", PLEASE try again.");
		
	}

@Then("request to sign again")
public void request_to_sign_again() {
	assertEquals(true,Auth.sign());
	assertEquals(true, Auth.gohome(Auth.email, Auth.password));
}
}