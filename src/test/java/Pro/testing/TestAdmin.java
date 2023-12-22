package Pro.testing;

import static org.junit.Assert.assertEquals;

import Pro.main.Customer;
import Pro.main.ProductCatalog;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAdmin {
	ProductCatalog catalog = new ProductCatalog();
@When("add new category")
public void add_new_category() {
	assertEquals(true,catalog.addProductCategory());
}

@Then("adding it successfully")
public void adding_it_successfully() {
	 System.out.println("Successfully adding.");
	assertEquals(true,true);
}


@When("choose which category and edit")
public void choose_which_category_and_edit() {
	assertEquals(true,catalog.editProduct());
}



@Then("done editing")
public void done_editing() {
	assertEquals(true,true); 
}

@When("choose which product and delete")
public void choose_which_category_and_delete() {
	assertEquals(true,catalog.deleteProduct());
}


@Then("done deleting")
public void done_deleting() {
	assertEquals(true,true); 
}

@When("view customer accounts")
public void view_customer_accounts() {
	assertEquals(true,Customer.view_account());
	
}

@When("update customer accounts")
public void update_customer_accounts() {
	assertEquals(true,Customer.edit_account());
}

@Then("printing cust accounts")
public void printing_cust_accounts() {
	assertEquals(true,true);
}
}
