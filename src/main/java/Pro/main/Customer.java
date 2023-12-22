package Pro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	public static void list(){
		ProductCatalog catalog = new ProductCatalog();
		Scanner scanner = new Scanner(System.in);
		 while ( true) {
	            System.out.println("Customer Menu:");
	            System.out.println("1. Edit profile");
	            System.out.println("2. View order history and installation requests");
	            System.out.println("3. View products.");
	            System.out.println("4. Purchase products");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                	edit_myaccount();
	                    break;
	                case 2:
	                    
	                    break;
	                case 3:
	                	catalog.viewAllProducts();
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
	public static void view_myacount()
	{
		System.out.println("\n1. Customer1 \n");
    	System.out.println("Email: ");
    	System.out.println(Auth.emails[1]);
    	System.out.println("Password: ");
    	System.out.println(Auth.emails[5]);
    	System.out.println("\n");
    	
	}
	
	
	public static void view_acount()
	{
		System.out.println("\n1. Customer1 \n");
    	System.out.println("Email: ");
    	System.out.println(Auth.emails[1]);
    	System.out.println("Password: ");
    	System.out.println(Auth.emails[5]);
    	System.out.println("\n2. Customer2 \n");
    	System.out.println("Email: ");
    	System.out.println(Auth.emails[2]);
    	System.out.println("Password: ");
    	System.out.println(Auth.emails[6]);
    	System.out.println("\n");
    	
	}
	
	public static void edit_account()
	{
		view_acount();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the details: ");
		 System.out.print(" \nCustomer Number: ");
         String CustomerN = scanner.nextLine();
         if (CustomerN.equals("1")) {
        	 System.out.print("\nPut a new Email: ");
             String em = scanner.nextLine();
             System.out.print("Put a new Passward: ");
             String pass = scanner.nextLine();
             Auth.emails[1]=em;
             Auth.emails[5]=pass;
         }
         else if (CustomerN.equals("2")) {
        	 System.out.print("\nPut a new Email: ");
             String em = scanner.nextLine();
             System.out.print("Put a new Passward: ");
             String pass = scanner.nextLine();
             Auth.emails[2]=em;
             Auth.emails[6]=pass;
         }else System.out.println("\nWrong number."); 	
    	
	}
	
	public static void edit_myaccount()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print(" \nEnter the details: ");
        	 System.out.print("\nPut a new Email: ");
             String em = scanner.nextLine();
             System.out.print("Put a new Passward: ");
             String pass = scanner.nextLine();
             Auth.emails[1]=em;
             Auth.emails[5]=pass;
    	
	}
	
	  private ProductCatalog productCatalog;
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
	


	    

}
