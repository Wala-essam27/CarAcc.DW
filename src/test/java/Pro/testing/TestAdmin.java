package Pro.testing;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import promain.Admin;
import promain.Auth;
import promain.Customer;
import promain.ProductCatalog;

public class TestAdmin {
	private static final Logger LOGGER = Logger.getLogger(TestAdmin.class.getName());
	Admin add;
	Customer cust;
	int flagg=1;	
	ProductCatalog catalog = new ProductCatalog();
@SuppressWarnings("static-access")
@When("add new category")
public void add_new_category() {
	
	 if (Auth.gohome(Auth.email, Auth.password) == 1)
		{assertEquals(true,add.list());
	
		}
	}

@Then("adding it successfully")
public void adding_it_successfully() {
	if (flagg==4) LOGGER.info("Adding successfully");
	}


@When("choose which category and edit")
public void choose_which_category_and_edit() {
	if (Admin.adchoice==3) {
		flagg=1;
		assertEquals(true,catalog.editProduct());}
	else flagg=0;}



@Then("done editing")
public void done_editing() {
	if (flagg==1) assertEquals(true,catalog.editProduct());
	}

@When("choose which product and delete")
public void choose_which_category_and_delete() {
	if (Admin.adchoice==4) {
		flagg=1;
		assertEquals(true,catalog.deleteProduct());
		
	}
	else
	 flagg=0;	}


@Then("done deleting")
public void done_deleting() {
if (flagg==1) assertEquals(true,catalog.deleteProduct());
}

@SuppressWarnings("static-access")
@When("view customer accounts")
public void view_customer_accounts() {
	if (Admin.adchoice==8) {
		flagg=1;
		assertEquals(true,cust.viewAccount());
	
	}

	else	flagg=0;
	}

@SuppressWarnings("static-access")
@When("update customer accounts")
public void update_customer_accounts() {
	if (Admin.adchoice==8) {
		flagg=1;
		assertEquals(true,cust.editAccount());
	
		
	}

else flagg=0;}
	
@SuppressWarnings("static-access")
@Then("printing cust accounts")
public void printing_cust_accounts() {
if (flagg==1 && Admin.adchoice==7)
	{assertEquals(true,cust.viewAccount());
}

}



@When("he want to search a product {string}")
public void he_want_to_search_a_product(String string) {
	if (Admin.adchoice==8) {
		flagg=1;
		assertEquals(true,catalog.searchAndFilterProducts(string));
	}
		
}

@Then("searching done")
public void searching_done() {
	if(Admin.adchoice==8) LOGGER.info("Searching successfully");
}
}


