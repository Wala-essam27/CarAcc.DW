package Pro.main;

import java.util.Scanner;

public class Admin {
	
	
	public static void list()
{ 
    ProductCatalog catalog = new ProductCatalog();
	Scanner scanner = new Scanner(System.in);
while (true) {
	
    System.out.println("\n Admin Menu:");
    System.out.println("1. Show product categories.");
    System.out.println("2. Add product listings.");
    System.out.println("3. update product listings.");
    System.out.println("4. Delete product listings.");
    System.out.println("5. Add a new catagory.");
    System.out.println("6. Search for a product.");
    System.out.println("7. View customer accounts.");
    System.out.println("8. Manage customer accounts.");
    System.out.println("9. Schedule and manage installation appointments.");
    System.out.println("0. Exit");

    System.out.print("\n Enter your choice: ");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
             catalog.viewAllProducts();
            break;
        case 2:
        	  System.out.println("Enter product details:");
              scanner.nextLine(); // Consume the newline character
              System.out.print("Category Name: ");
              String categoryName = scanner.nextLine();
              System.out.print("Product Name: ");
              String name = scanner.nextLine();
              System.out.print("Description: ");
              String description = scanner.nextLine();
              System.out.print("Price: ");
              String price = scanner.nextLine();
              System.out.print("Availability: ");
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
        	 System.out.println("Enter keyword to search:");
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
             break;
        case 0:
            System.out.println("Exiting the admin menu. Goodbye!");
            scanner.close();
            System.exit(0);
        default:
            System.out.println("Invalid choice. Please enter a valid option.");} }
	}

	
	}

