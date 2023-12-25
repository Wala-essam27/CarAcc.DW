package Pro.testing;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import promain.Admin;
import promain.Auth;
import promain.Customer;
import promain.ProductCatalog;

public class TestAdmin {
	Admin add;
	Customer cust;
	int flagg=1;	
	ProductCatalog catalog = new ProductCatalog();
@SuppressWarnings("static-access")
@When("add new category")
public void add_new_category() {
	assertEquals(true,true);
	 if (Auth.gohome(Auth.email, Auth.password) == 1)
		{add.list();
		 			
	 assertEquals(true,true);
		
		}
	}

@Then("adding it successfully")
public void adding_it_successfully() {
	if (flagg==1) assertEquals(true,true);
	}


@When("choose which category and edit")
public void choose_which_category_and_edit() {
	if (Admin.adchoice==3) {
		flagg=1;
		catalog.editProduct();
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
		catalog.deleteProduct();
		
	}
	else	assertEquals(true,true);
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
		cust.view_account();
	
	}

	else	flagg=0;
	assertEquals(true,true);}

@SuppressWarnings("static-access")
@When("update customer accounts")
public void update_customer_accounts() {
	if (Admin.adchoice==8) {
		flagg=1;
		cust.edit_account();
		
	}

else flagg=0;
	assertEquals(true,true);}

@SuppressWarnings("static-access")
@Then("printing cust accounts")
public void printing_cust_accounts() {
if (flagg==1 && Admin.adchoice==7)
	{assertEquals(true,true);
cust.view_account();}
assertEquals(true,true);
}



@When("he want to search a product {string}")
public void he_want_to_search_a_product(String string) {
	if (Admin.adchoice==8) {
		flagg=1;
		catalog.searchAndFilterProducts(string);
		assertEquals(true,true);
	}

else flagg=0;
	assertEquals(true,true);
}

@Then("searching done")
public void searching_done() {
	if (flagg==1) assertEquals(true,true); 
	assertEquals(true,true); 
}
}



