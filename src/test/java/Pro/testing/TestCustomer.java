package Pro.testing;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import promain.Admin;
import promain.Auth;
import promain.Customer;
import promain.ProductCatalog;
import promain.OrderManager;

public class TestCustomer {
	private static final Logger LOGGER = Logger.getLogger(TestCustomer.class.getName());
	int flagg=1;
	Customer cust;
	OrderManager ordm;
	ProductCatalog catalog = new ProductCatalog();
	@SuppressWarnings("static-access")
	@When("he want to browsing")
	public void he_want_to_browsing() {
		 if (Auth.gohome(Auth.email, Auth.password) == 2)
		{
			
			
		assertEquals(true,Customer.list());
		}

		
	else flagg=0;
	}

	@Then("showing all products")
	public void showing_all_products() {
		if (flagg==1)
		assertEquals(true,	catalog.viewAllProducts());
		
	}


@SuppressWarnings("static-access")
@When("showing the catalog")
public void showing_the_catalog() {
	if (cust.custchoice==3) 
	catalog.viewAllProducts();
}

@SuppressWarnings("static-access")
@Then("choose a product")
public void choose_a_product() {
	if (cust.custchoice==5) {
		flagg=1;
		ordm.purchaseProduct(catalog);
	}
else flagg=0;
}
	@SuppressWarnings("static-access")
	@Then("adding them to orders")
	public void adding_them_to_orders() {
		if (cust.custchoice==5) {
	   
			LOGGER.info("adding to orders correctly.");}
		
	}

	@SuppressWarnings("static-access")
	@When("he want to view order")
	public void he_want_to_view_order() {
		if (cust.custchoice==5) LOGGER.info("Viewing successfully.");
		
	}

	@SuppressWarnings("static-access")
	@Then("printing the orders")
	public void printing_the_orders() {
		if (cust.custchoice==6) {
			flagg=1;
			ordm.viewOrder();
		}
	else	flagg=0;
	}
	
	
	@SuppressWarnings("static-access")
	@When("he want to edit profile")
	public void he_want_to_edit_profile() {
		
			if (cust.custchoice==2) {
				flagg=1;
				cust.edit_myaccount();
			}
		else	flagg=0;
	}

	@SuppressWarnings("static-access")
	@Then("editing done")
	public void editing_done() {
		if (cust.custchoice==2)
			LOGGER.info("Editng successfully.");
	}
}


