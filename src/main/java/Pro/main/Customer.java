package Pro.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Customer {
	static orderManager ord = new orderManager();
	static int flag=0;
	
	public Customer() {
	    	
	    }
	public static void list(){
		
		ProductCatalog catalog = new ProductCatalog();		
		Scanner scanner = new Scanner(System.in);
		 while ( true) {
			 Customer cust =  new Customer();
	            System.out.println("\n Customer Menu: \n");
	            System.out.println("1. View profile.");
	            System.out.println("2. Edit profile.");
	            System.out.println("3. View products.");
	            System.out.println("4. Search products.");
	            System.out.println("5. Purchase products.");
	            System.out.println("6. View order history and installation requests.");
	            System.out.println("0. Exit");

	            System.out.print("\nEnter your choice: ");
	            int custchoice = scanner.nextInt();
	            if (custchoice<0 ||custchoice >9)
	        	{System.out.println("Invalid choice. Please enter a valid option.");
	        return;}
	            switch (custchoice) {
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
	                	 String searchKeyword = scanner.nextLine();
	                     catalog.searchAndFilterProducts(searchKeyword);
	                    break;
	                case 5:
	                	catalog.viewAllProducts();
	                
	                  ord.purchaseProduct(catalog);
	                     break; 
	                case 6:
	                	ord.viewOrder(); 
	                    break;	
	                case 0:
	                    System.out.println("Exiting the customer menu. Goodbye!");
	                    scanner.close();
	                    return;
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
	
	
	public static boolean view_account()
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
		return true;
    	
	}
	
	public static boolean edit_account()
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
		return true; 	
    	
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
}
	
	    

