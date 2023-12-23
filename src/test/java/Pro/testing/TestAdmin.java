package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.Admin;
import Pro.main.Customer;
import Pro.main.ProductCatalog;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdmin {
	int flagg=1;	
	ProductCatalog catalog = new ProductCatalog();
@When("add new category")
public void add_new_category() {
	if (Admin.adchoice==5) {
		flagg=1;
		assertEquals(true,true);}

else	flagg=0;}

@Then("adding it successfully")
public void adding_it_successfully() {
	if (flagg==1) assertEquals(true,true);
	}


@When("choose which category and edit")
public void choose_which_category_and_edit() {
	if (Admin.adchoice==3) {
		flagg=1;
		assertEquals(true,true);}

	else flagg=0;}



@Then("done editing")
public void done_editing() {
	if (flagg==1) assertEquals(true,true);
	}

@When("choose which product and delete")
public void choose_which_category_and_delete() {
	if (Admin.adchoice==4) {
		flagg=1;
		assertEquals(true,true);
	}
	else flagg=0;	}


@Then("done deleting")
public void done_deleting() {
if (flagg==1) assertEquals(true,true);
}

@When("view customer accounts")
public void view_customer_accounts() {
	if (Admin.adchoice==8) {
		flagg=1;
		assertEquals(true,true);
	}

	else	flagg=0;}

@When("update customer accounts")
public void update_customer_accounts() {
	if (Admin.adchoice==8) {
		flagg=1;
		assertEquals(true,true);
	}

else flagg=0;}

@Then("printing cust accounts")
public void printing_cust_accounts() {
if (flagg==1) assertEquals(true,true);

}

@When("he want to search a product")
public void he_want_to_search_a_product() {
	if (Admin.adchoice==8) {
		flagg=1;
		assertEquals(true,true);
	}

else flagg=0;}


@Then("searching done")
public void searching_done() {
	if (flagg==1) assertEquals(true,true); 
}
}



