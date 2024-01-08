package promain;
import java.util.logging.Logger;

import java.util.Scanner;

public class Customer {
	private static final String S_S_N = "%s: %s%n";
	private static final String PUT_A_NEW_PASSWARD = "\nPut a new Passward: ";
	private static final String PUT_A_NEW_EMAIL = "\nPut a new Email: ";
	private static final String PASSWORD = "Password: ";
	private static final String EMAIL = "Email: ";
	static OrderManager ord = new OrderManager();
	static int flag=0;
	public static int custchoice=0;
	private static final Logger LOGGER = Logger.getLogger(Customer.class.getName());
	private Customer() {
	    throw new IllegalStateException("Utility class");
	  }
	public static boolean list(){
		
		ProductCatalog catalog = new ProductCatalog();		
		Scanner scanner = new Scanner(System.in);
		 while ( true) {
			 LOGGER.info("\n========= Customer Menu: ===========\n" +
		                "\\n1. View profile.\n" +
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
	                	viewMyaccount();
	                	break;
	                case 2:
	                	editMyaccount();
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
	                	Admin.catalog.viewAllProducts();
	                
	                  ord.purchaseProduct(Admin.catalog);
	                     break; 
	                case 6:
	                	ord.viewOrder(); 
	                    break;	
	                case 7:
	                	ord.deleteOrder();
	                	break;
	                case 0:
	                	 LOGGER.info("\nExiting the customer menu. Goodbye!");
	                	 LOGGER.info("\nDid you want to sign again? (yes or no):");
	                     scanner.nextLine(); 
	                     String y = scanner.nextLine();
	                     if (y.toLowerCase().equals("yes")){Auth.sign();
	                     if (Auth.email.equals(Auth.emails[0])) {
	             			LOGGER.info("\nWelcome Our CUSTOMER!");
	             			    		Admin.list();
	             			}else LOGGER.info("\nInvalid Email or pass.");
	                     }
	                    
	                     else 
	                     	LOGGER.info("\nExiting the PROGRAM. Goodbye!");
	                     scanner.close();
	                     return true;
	 	                default:
	                	 LOGGER.warning("\nInvalid choice. Please enter a valid option.");
	            }
	        }

	}
	public static boolean viewMyaccount()
	{
		LOGGER.info(
			    String.format(
			        "%ncustomer1%n" +
			        S_S_N +
			        S_S_N,
			        EMAIL, Auth.emails[1], PASSWORD, Auth.emails[5]
			    )
			);

		return true;
    	
	}
	
	
	public static boolean viewAccount()
	{
		LOGGER.info(
			    String.format(
			        "%n1. Customer1%n" +
			        "Email: %s%n" +
			        "Password: %s%n" +
			        "%n2. Customer2%n" +
			        "Email: %s%n" +
			        "Password: %s%n",
			        Auth.emails[1], Auth.emails[5], Auth.emails[2], Auth.emails[6]
			    )
			);
		return true;
    	
	}
	
	public static boolean editAccount()
	{
		viewAccount();
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("\nEnter the details: "+
		            "\nCustomer Number: ");
         String CustomerN = scanner.nextLine();
         if (CustomerN.equals("1")) {
        	 LOGGER.info(PUT_A_NEW_EMAIL);
             String em = scanner.nextLine();
             LOGGER.info(PUT_A_NEW_PASSWARD);
             String pass = scanner.nextLine();
             Auth.emails[1]=em;
             Auth.emails[5]=pass;
         }
         else if (CustomerN.equals("2")) {
        	 LOGGER.info(PUT_A_NEW_EMAIL);
             String em = scanner.nextLine();
             LOGGER.info(PUT_A_NEW_PASSWARD);
             String pass = scanner.nextLine();
             Auth.emails[2]=em;
             Auth.emails[6]=pass;
         }else LOGGER.info("\nWrong number.");
		return true; 	
    	
	}
	
	public static boolean editMyaccount(){
		viewMyaccount();
		Scanner scanner = new Scanner(System.in);
		LOGGER.info(" \nEnter the details: ");
		LOGGER.info(PUT_A_NEW_EMAIL);
             String em = scanner.nextLine();
             LOGGER.info(PUT_A_NEW_PASSWARD);
             String pass = scanner.nextLine();
             Auth.emails[1]=em;
             Auth.emails[5]=pass;   
             return true;
	}
	
	
	
	public static boolean deleteAccount(){
		viewAccount();
		LOGGER.info("\nPut the number of customer: ");
		Scanner scanner = new Scanner(System.in);
             String num = scanner.nextLine();
            
            if (num.equals("1")) {
            	Auth.emails[1]=null;
            	Auth.emails[5]=null;
            	LOGGER.info(
            		    String.format(
            		        "%n1. Customer2%n" +
            		        S_S_N +
            		        S_S_N,
            		        EMAIL, Auth.emails[2], PASSWORD, Auth.emails[6]
            		    )
            		);

            }
            
            else if (num.equals("2")) {
            	Auth.emails[2]=null;
            	Auth.emails[6]=null;
            	LOGGER.info(
            		    String.format(
            		        "%n1. Customer1%n" +
            		        S_S_N +
            		        S_S_N,
            		        EMAIL, Auth.emails[1], PASSWORD, Auth.emails[5]
            		    )
            		);

            }
            return true;       	
	}
}
	
	    
