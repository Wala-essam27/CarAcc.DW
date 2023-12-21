package Pro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	
	public static void list(){
		Scanner scanner = new Scanner(System.in);
		 while ( true) {
	            System.out.println("Customer Menu:");
	            System.out.println("1. Edit profile");
	            System.out.println("2. View order history and installation requests");
	            System.out.println("3. View products");
	            System.out.println("4. Purchase products");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                	
	                    
	                    break;
	                case 2:
	                    
	                    break;
	                case 3:
	                    
	                    break;
	                case 4:
	                    
	                    break;
	                case 0:
	                    System.out.println("Exiting the customer menu. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }

	}

	/*  private ProductCatalog productCatalog;
	    private List<String[]> orders;

	    public Customer(ProductCatalog productCatalog) {
	        this.productCatalog = productCatalog;
	        this.orders = new ArrayList<String[]>();
	    }

	   public void makePurchase(String categoryName, int productIndex) {
	        String[] product = getProductFromCategory(categoryName, productIndex);
	        if (product != null) {
	            orders.add(product);
	            System.out.println("Product added to the order: " + product[0]);
	        } else {
	            System.out.println("Product not available at the specified index.");
	        }
	    }

	    private String[] getProductFromCategory(String categoryName, int productIndex) {
			return null;
	       
	        }


	    public void viewOrders() {
	        System.out.println("Customer's Orders:");
	        System.out.println("----------------------------------------------------");
	        System.out.println("Name\t\tPrice\tDescription");
	        System.out.println("----------------------------------------------------");
	        for (String[] order : orders) {
	            System.out.println(order[0] + "\t" + order[1] + "\t" + order[2]);
	        }
	        System.out.println("----------------------------------------------------");
	    }
	


	    
*/
}
