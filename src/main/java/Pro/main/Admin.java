package Pro.main;

import java.util.Scanner;

public class Admin {
	public static void list()
{ 
	
	Scanner scanner = new Scanner(System.in);
while (true) {
    System.out.println("Admin Menu:");
    System.out.println("1. Manage product categories");
    System.out.println("2. Add and update product listings");
    System.out.println("3. View and manage customer accounts");
    System.out.println("4. Schedule and manage installation appointments");
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
            System.out.println("Exiting the admin menu. Goodbye!");
            scanner.close();
            System.exit(0);
        default:
            System.out.println("Invalid choice. Please enter a valid option.");} }
	}

	
	}

