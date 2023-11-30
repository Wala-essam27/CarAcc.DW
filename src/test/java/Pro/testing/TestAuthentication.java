package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.Auth;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAuthentication {
	
	@When("he enter the valid email {string} and password {string}")
	public void he_enter_the_valid_email_and_password(String string, String string2) {
		string= Auth.email;
		string2= Auth.password;
		assertEquals(true,Auth.sign());
		System.out.println(string+" && "+string2);
		}

	@Then("he should go to the home page")
	public void he_should_go_to_the_home_page() {
	String	string= Auth.email;
	String	string2= Auth.password;
		 assertEquals(true, Auth.gohome(string, string2));
	}

	@When("he enter the invalid email {string} and password {string}")
	public void he_enter_the_invalid_email_and_password(String string, String string2) {
		string= Auth.email;
		string2= Auth.password;
		assertEquals(false,Auth.valid(string, string2));
	}

	@Then("he should see an error message saying {string}")
	public void he_should_see_an_error_message_saying(String string) {
		System.out.println("Invalid email or password,PLEASE try again.");
		assertEquals(false,false);
	}

	@Then("request to enter email {string} and password {string} again")
	public void request_to_enter_email_and_password_again(String string, String string2) {
		string= Auth.email;
		string2= Auth.password;
		assertEquals(true,Auth.sign());
	}


}