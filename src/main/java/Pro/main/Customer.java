package Pro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	public static void list(){
		ProductCatalog catalog = new ProductCatalog()
				;
		Scanner scanner = new Scanner(System.in);
		 while ( true) {
	            System.out.println("\n Customer Menu: \n");
	            System.out.println("1. View profile.");
	            System.out.println("2. Edit profile.");
	            System.out.println("3. View products.");
	            System.out.println("4. Search products.");
	            System.out.println("5. Purchase products.");
	            System.out.println("6. View order history and installation requests.");
	            System.out.println("0. Exit");

	            System.out.print("\nEnter your choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                	view_myaccount();
	                	break;
	                case 2:
	                	edit_myaccount();
	                    break;
	                case 3:
	                	catalog.viewAllProducts();
	                    break;
	                case 4:
	                	 System.out.println("Enter keyword to search:");
	                     scanner.nextLine(); 
	                     String searchKeyword = scanner.nextLine();
	                     catalog.searchAndFilterProducts(searchKeyword);
	                    break;
	                case 5:
	                	catalog.viewAllProducts();
	                	Scanner canner = new Scanner(System.in);
	                     System.out.println("Enter the name of product: ");
	                     String productName = canner.nextLine();
	                     makePurchase(productName);
	                     break; 
	                case 6:
	                	viewOrders(); 
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
	public static void view_myaccount()
	{
		System.out.println("\n1. Customer1 \n");
    	System.out.println("Email: ");
    	System.out.println(Auth.emails[1]);
    	System.out.println("Password: ");
    	System.out.println(Auth.emails[5]);
    	System.out.println("\n");
    	
	}
	
	
	public static void view_account()
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
		view_account();
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
	
	public static void edit_myaccount(){
		view_myaccount();
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
	    private static List<String[]> orders;
	    public Customer(ProductCatalog productCatalog) {
	        this.productCatalog = productCatalog;
	        this.orders = new ArrayList<String[]>();
	    }


	    public static void makePurchase( String productName) {
	    	 List<String[]> order = new ArrayList<>();

	         for (String[][] category : ProductCatalog.productCategories) {
	             for (String[] product : category) {
	                 if (product != null && product[0] != null && product[1] != null &&
	                     product[2] != null && product[3] != null &&
	                     (product[0].toLowerCase().contains(productName.toLowerCase()) ||
	                      product[1].toLowerCase().contains(productName.toLowerCase()) ||
	                      product[2].toLowerCase().contains(productName.toLowerCase()) ||
	                      product[3].toLowerCase().contains(productName.toLowerCase()))) {
	                	 orders.add(product);
	                 }
	             }
	         }
	         System.out.println("Succesfully purchase.");}

	    public static void viewOrders() {
	        System.out.println("Customer's Orders:");
	        System.out.println("----------------------------------------------------");
	        System.out.println("Category\tProduct\tPrice\tAvailability");
	        System.out.println("----------------------------------------------------");
	        for (String[] order : orders) {
	            System.out.println(order[0] + "\t" + order[1] + "\t" + order[2] + "\t" + order[3]);
	        }
	        System.out.println("----------------------------------------------------");
	    }


	    

}
