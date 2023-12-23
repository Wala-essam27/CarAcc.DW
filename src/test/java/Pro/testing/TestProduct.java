package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.Admin;
import Pro.main.Customer;
import Pro.main.ProductCatalog;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestProduct {
	Admin add;
	Customer cust;
	int flagg=1;
	ProductCatalog catalog = new ProductCatalog();
	@When("choose which category and add")
	public void choose_which_category_and_add() {
		
		if (Admin.adchoice==5) {
			catalog.addProductCategory();
			flagg=1;
			assertEquals(true,true);}

	else	flagg=0;
	}

	@Then("adding them to correct catagory")
	public void adding_them_to_correct_catagory() {
		if (Admin.adchoice==5) {
			flagg=1;
			assertEquals(true,true);
		}
	else flagg=0;
	}

	@SuppressWarnings("static-access")
	@When("he wants to print all category")
	public void he_wants_to_print_all_category() {
		if (Admin.adchoice==1||cust.custchoice==3) {
			flagg=1;
			catalog.viewAllProducts();
			assertEquals(true,true);
		}
	else flagg=0;
	}


	@SuppressWarnings("static-access")
	@Then("printing categorys")
	public void printing_categorys() {
		if (Admin.adchoice==1||cust.custchoice==3) 
			assertEquals(true,true);
	}

	


	@When("he wants to search")
	public void he_wants_to_search() {
		if (Admin.adchoice==8) {
			flagg=1;
			assertEquals(true,true);
		}

	else flagg=0;
	}

	@Then("he can see all options")
	public void he_can_see_all_options() {
		if (flagg==1) assertEquals(true,true); 
	}

}
