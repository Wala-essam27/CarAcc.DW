package promain;
import java.util.logging.Logger;

import java.util.Scanner;




public class Admin {
	public static int adchoice=0;
	private static final Logger LOGGER = Logger.getLogger(Admin.class.getName());
	 private Admin() {
		    throw new IllegalStateException("Utility class");
		  }
	
	public static boolean list(){ 
    ProductCatalog catalog = new ProductCatalog();
	Scanner scanner = new Scanner(System.in);
while (true) {
	LOGGER.info(
		    "\n ========= Admin Menu: ===========\n" +
		    
		    "\n1. Show product categories.\n" +
		    "2. Add product listings.\n" +
		    "3. Update product listings.\n" +
		    "4. Delete product listings.\n" +
		    "5. Add a new category.\n" +
		    "6. Search for a product.\n" +
		    "7. View customer accounts.\n" +
		    "8. Manage customer accounts.\n" +
		    "9. Delete a customer account.\n" +
		    "10. Schedule and manage installation appointments.\n" +
		    "0. Exit."+
		    "\n\nEnter your choice: "
		);

		
		
		    
	adchoice = scanner.nextInt();
	
		switch (adchoice) {
        case 1:
             catalog.viewAllProducts();
            break;
        case 2:
        	LOGGER.info("\nEnter product details:\n");
        	  scanner.nextLine();
        	  LOGGER.info("Catagory Name: ");
              String categoryName = scanner.nextLine();
              LOGGER.info("Product Name: ");
              String name = scanner.nextLine();
              LOGGER.info("Description: ");
              String description = scanner.nextLine();
              LOGGER.info("Price: ");
              String price = scanner.nextLine();
              LOGGER.info("Availability: ");
              String availability = scanner.nextLine();

              catalog.addProduct(categoryName, name, description, price, availability);
              break;
        case 3:
        	 catalog.editProduct();
        	
        	 break;
        case 4:
        	catalog.deleteProduct();
        	 break;
        case 5:
        	
        	catalog.addProductCategory();
            break;
        case 6:
        	LOGGER.info("\nEnter keyword to search:");
             scanner.nextLine(); 
             String searchKeyword = scanner.nextLine();
             catalog.searchAndFilterProducts(searchKeyword);
            break;
        case 7:
        	Customer.view_account();
        	break;
        case 8:
        	Customer.edit_account();
        	 break;
        case 9:
        	Customer.delete_account();
             break;
        case 10:
        	
        	break;
        case 0:
        	LOGGER.info("\nExiting the admin menu. Goodbye!");
            scanner.close();
            return true;
        default:
        	LOGGER.warning("\nInvalid choice. Please enter a valid option.");
            } 
	
	}}}
	