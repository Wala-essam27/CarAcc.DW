package Pro.main;

import java.util.Scanner;

public class Admin {
	
	
	public static void list()
{ 
    ProductCatalog catalog = new ProductCatalog();
	Scanner scanner = new Scanner(System.in);
while (true) {
	
    System.out.println("\n Admin Menu:");
    System.out.println("1. Show product categories");
    System.out.println("2. Add and update product listings");
    System.out.println("3. Add a new catagory.");
    System.out.println("4. View and manage customer accounts");
    System.out.println("5. Schedule and manage installation appointments");
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
        	System.out.println("Enter Category details:");
            scanner.nextLine(); // Consume the newline character
            System.out.print("Category Name: ");
            String categoryNam = scanner.nextLine();
            System.out.print("max Size ");
            int size = Integer. parseInt(scanner.nextLine());
        	catalog.addProductCategory(size, categoryNam);
            break;
        case 4:
           
            break;
        case 0:
            System.out.println("Exiting the admin menu. Goodbye!");
            scanner.close();
            System.exit(0);
        default:
            System.out.println("Invalid choice. Please enter a valid option.");} }
	}

	
	}

