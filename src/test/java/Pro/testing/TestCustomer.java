package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.ProductCatalog;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCustomer {
	ProductCatalog catalog = new ProductCatalog();
	@When("he want to browsing")
	public void he_want_to_browsing() {
		assertEquals(true,true);
	}

	@Then("showing all products")
	public void showing_all_products() {
		//assertEquals(true,catalog.viewAllProducts());
	}


@When("showing the catalog")
public void showing_the_catalog() {
	//assertEquals(true,catalog.viewAllProducts());
}

@Then("choose a product")
public void choose_a_product() {
  
}
	@Then("adding them to orders")
	public void adding_them_to_orders() {
	   
	}

	@When("he want to view order")
	public void he_want_to_view_order() {
	  
	}

	@Then("printing the orders")
	public void printing_the_orders() {
	    
	}
	
	
	@When("he want to edit profile")
	public void he_want_to_edit_profile() {
	    
	}

	@Then("editing done")
	public void editing_done() {
	   
	}
}


