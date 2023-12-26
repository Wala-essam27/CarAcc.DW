package Pro.testing;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import promain.Admin;
import promain.Customer;
import promain.ProductCatalog;

public class TestProduct {
	private static final Logger LOGGER = Logger.getLogger(TestProduct.class.getName());
	Admin add;
	Customer cust;
	int flagg=1;
	ProductCatalog catalog = new ProductCatalog();
	@When("choose which category and add")
	public void choose_which_category_and_add() {
		
		if (Admin.adchoice==5) {
			catalog.addProductCategory();
			flagg=1;
			}

	else	flagg=0;
	}

	@Then("adding them to correct catagory")
	public void adding_them_to_correct_catagory() {
		if (Admin.adchoice==5) {
			flagg=1;
			assertEquals(true,catalog.addProductCategory());
		}
	else flagg=0;
	}

	@SuppressWarnings("static-access")
	@When("he wants to print all category")
	public void he_wants_to_print_all_category() {
		if (Admin.adchoice==1||cust.custchoice==3) {
			flagg=1;
			
			assertEquals(true,catalog.viewAllProducts());
		}
	else flagg=0;
	}


	@SuppressWarnings("static-access")
	@Then("printing categorys")
	public void printing_categorys() {
		if (Admin.adchoice==1||cust.custchoice==3) 
			LOGGER.info("Printing Successfully.");
	}



@When("he wants to editing one of them and choose one")
public void he_wants_to_editing_one_of_them_and_choose_one() {
	if (Admin.adchoice==3) {
		flagg=1;
		
		assertEquals(true,catalog.editProduct());}

	else flagg=0;
}

@Then("printing the result")
public void printing_the_result() {
	if (Admin.adchoice==3) {
		flagg=1;
		
		assertEquals(true,catalog.viewAllProducts());}

	else flagg=0;
}

@SuppressWarnings("static-access")
@When("he wants to search {string}")
public void he_wants_to_search(String string) {
	if (Admin.adchoice==6||cust.custchoice==4) {
		flagg=1;
		
		assertEquals(true,catalog.searchAndFilterProducts(string));
	}
else flagg=0;
   
}

	@Then("he can see all options")
	public void he_can_see_all_options() {
		if (flagg==1)  LOGGER.info("Viewing successfully.");
		
		
	}

}
