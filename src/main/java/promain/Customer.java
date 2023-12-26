package promain;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Customer {
	static OrderManager ord = new OrderManager();
	static int flag=0;
	public static int custchoice=0;
	private static final Logger LOGGER = Logger.getLogger(Customer.class.getName());
	public Customer() {
		
	    }
	@SuppressWarnings("resource")
	public static boolean list(){
		
		ProductCatalog catalog = new ProductCatalog();		
		Scanner scanner = new Scanner(System.in);
		 while ( true) {
			 LOGGER.info("\n========= Customer Menu: ===========\n" +
		                "1.\n View profile.\n" +
		                "2. Edit profile.\n" +
		                "3. View products.\n" +
		                "4. Search products.\n" +
		                "5. Purchase products.\n" +
		                "6. View order history and installation requests.\n" +
		                "7. Delete an order.\n" +
		                "0. Exit"+
		                "\n\nEnter your choice: ");

		             
					custchoice = scanner.nextInt();
				
	           
	        
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
	                	 LOGGER.info("\nEnter keyword to search: ");
	                	 scanner.next();
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
	                case 7:
	                	ord.deleteOrder();
	                	break;
	                case 0:
	                	 LOGGER.info("\nExiting the customer menu. Goodbye!");
	                    scanner.close();
	 	                default:
	                	 LOGGER.warning("\nInvalid choice. Please enter a valid option.");
	            }return true;
	        }

	}
	public static boolean view_myaccount()
	{
		  LOGGER.info(
	                "\ncustomer1  \n" +
	                "Email: " + Auth.emails[1] + "\n" +
	                "Password: " + Auth.emails[5] + "\n");
		return true;
    	
	}
	
	
	public static boolean view_account()
	{
		LOGGER.info("\n1. Customer1 \n" +
	                "Email: " + Auth.emails[1] + "\n" +
	                "Password: " + Auth.emails[5] + "\n" +
	                "\n2. Customer2 \n" +
	                "Email: " + Auth.emails[2] + "\n" +
	                "Password: " + Auth.emails[6] + "\n");
		return true;
    	
	}
	
	public static boolean edit_account()
	{
		view_account();
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("\nEnter the details: "+
		            "\nCustomer Number: ");
         String CustomerN = scanner.nextLine();
         if (CustomerN.equals("1")) {
        	 LOGGER.info("\nPut a new Email: ");
             String em = scanner.nextLine();
             LOGGER.info("\nPut a new Passward: ");
             String pass = scanner.nextLine();
             Auth.emails[1]=em;
             Auth.emails[5]=pass;
         }
         else if (CustomerN.equals("2")) {
        	 LOGGER.info("\nPut a new Email: ");
             String em = scanner.nextLine();
             LOGGER.info("\nPut a new Passward: ");
             String pass = scanner.nextLine();
             Auth.emails[2]=em;
             Auth.emails[6]=pass;
         }else LOGGER.info("\nWrong number.");
		return true; 	
    	
	}
	
	public static boolean edit_myaccount(){
		view_myaccount();
		Scanner scanner = new Scanner(System.in);
		LOGGER.info(" \nEnter the details: ");
		LOGGER.info("\nPut a new Email: ");
             String em = scanner.nextLine();
             LOGGER.info("\nPut a new Passward: ");
             String pass = scanner.nextLine();
             Auth.emails[1]=em;
             Auth.emails[5]=pass;   
             return true;
	}
	
	
	
	public static boolean delete_account(){
		view_account();
		LOGGER.info("\nPut the number of customer: ");
		Scanner scanner = new Scanner(System.in);
             String num = scanner.nextLine();
            
            if (num.equals("1")) {
            	 LOGGER.info(
                         "\n1. Customer2 \n" +
                                 "Email: " + Auth.emails[2] + "\n" +
                                 "Password: " + Auth.emails[6] + "\n"
                 );
            }
            
            else if (num.equals("2")) {
            	 LOGGER.info(
                         "\n1. Customer1 \n" +
                                 "Email: " + Auth.emails[1] + "\n" +
                                 "Password: " + Auth.emails[5] + "\n" 
                                
                 );
            }
            return true;       	
	}
}
	
	    

