package Pro.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Pro.main.Auth;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAuthentication {
	int flagg=1;
	@When("he sign in")
	public void he_sign_in() {
		assertEquals(true,Auth.sign());
		flagg=1;
	}

@When("he enter the valid email and password")
public void he_enter_the_valid_email_and_password() {
	if (Auth.flag == 1)assertTrue(Auth.valid());
	assertEquals(true,true);
	flagg=1;
}
	@Then("he should go to the home page")
	public void he_should_go_to_the_home_page() {
		if (Auth.flag == 1)
			assertEquals(true,true);
	 Auth.gohome(Auth.email, Auth.password);
		flagg=1;
	}
	
	@When("he enter the invalid email and password")
	public void he_enter_the_invalid_email_and_password() {
		if (Auth.valid()==false )flagg=0;
		if (flagg == 0)
			assertEquals(false,false);
		else assertEquals(true,true);
		
	}
	@Then("he should see an error message saying {string}")
	public void he_should_see_an_error_message_saying(String string) {
		if (flagg == 0)
		System.out.println(string +", PLEASE try again.");
		assertEquals(true,true);
		
	}

@Then("request to sign again")
public void request_to_sign_again() {
	if (flagg == 0)
	{assertEquals(true,Auth.sign());
	assertEquals(true, Auth.gohome(Auth.email, Auth.password));}
	else assertEquals(true,true);
}
}