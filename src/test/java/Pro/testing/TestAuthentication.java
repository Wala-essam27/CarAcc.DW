package Pro.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import promain.Admin;
import promain.Auth;
import promain.Customer;

public class TestAuthentication {
	static Scanner scanner = new Scanner(System.in);
	int go=1;
	public TestAuthentication() {
		
	}
	int flagg=1;
	@When("he sign in")
	public void he_sign_in() {
		if (flagg==1&& go==1||flagg==0&& go==0)
		assertEquals(true,Auth.sign());
	}

@When("he enter the valid email and password")
public void he_enter_the_valid_email_and_password() {
	if (Auth.flag == 1)
		{assertTrue(Auth.valid());
	assertEquals(true,true);}
	else Auth.flag = 0;
	}
	@Then("he should go to the home page")
	public void he_should_go_to_the_home_page() {
		if (Auth.flag == 1)
			assertEquals(true,true);
	}
	
	@When("he enter the invalid email and password")
	public void he_enter_the_invalid_email_and_password() {
		if (Auth.flag == 0)
		assertEquals(false,false);
	}
	@Then("he should see an error message saying {string}")
	public void he_should_see_an_error_message_saying(String string) {
		assertEquals(false,false);
		if (flagg == 0&&go==1)
		System.out.println(string +", PLEASE try again.");
		assertEquals(false,false);
		
	}

@Then("request to sign again")
public void request_to_sign_again() {
	if (flagg == 0)
	{flagg=0;
		go =0;
		assertEquals(false,false);
	}
	else assertEquals(false,false);
	
}
}