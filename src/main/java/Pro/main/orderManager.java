package Pro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class orderManager {
    private List<String[]> orders;

    public orderManager() {
        this.orders = new ArrayList<>();
    }

    public void purchaseProduct(ProductCatalog catalog) {
    	 catalog.viewAllProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the product you want to purchase:");
        String productName = scanner.nextLine();

        for (String[][] category : catalog.productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                    orders.add(product);
                    System.out.println("Product '" + productName + "' added to the order.");
                    return;
                }
            }
        }

        System.out.println("Product '" + productName + "' not found in the catalog.");
    }

    public void viewOrder() {
        if (orders.isEmpty()) {
            System.out.println("No products in the order.");
        } else {
            System.out.println("\nOrder List:\n");
            for (String[] product : orders) {
                System.out.println("Product: " + product[0]);
                System.out.println("Description: " + product[1]);
                System.out.println("Price: " + product[2]);
                System.out.println("Availability: " + product[3]);
                System.out.println("------------------------");
            }
        }
    }
}
