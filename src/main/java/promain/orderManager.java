package promain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class orderManager {
    private List<String[]> orders;
    private static final Logger LOGGER = Logger.getLogger(orderManager.class.getName());
    public orderManager() {
        this.orders = new ArrayList<>();
        
    }

    public void purchaseProduct(ProductCatalog catalog) {
    	 catalog.viewAllProducts();
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("\nEnter the name of the product you want to purchase:");
        String productName = scanner.nextLine();

        for (String[][] category : catalog.productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                    orders.add(product);
                    LOGGER.info("\nProduct '" + productName + "' added to the order.");
                    return;
                }
            }
        }

        LOGGER.info("\nProduct '" + productName + "' not found in the catalog.");
    }

    public void viewOrder() {
        if (orders.isEmpty()) {
            System.out.println("No products in the order.");
        } else {
            System.out.println("\nOrder List:\n");
            double totalPrice = 0.0;
            for (String[] product : orders) {
            	 LOGGER.info(
                         "\nProduct: " + product[0] + "\n" +
                                 "Description: " + product[1] + "\n" +
                                 "Price: " + product[2] + "\n" +
                                 "Availability: " + product[3] + "\n" +
                                 "------------------------"
                 );
                totalPrice += Double.parseDouble(product[2]);
            }
            LOGGER.info("\nTotal Price: " + totalPrice+"\n");
        }
    }
    
    public void deleteOrder() {
        if (orders.isEmpty()) {
        	LOGGER.warning("\nNo products in the order.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        LOGGER.info("\nEnter the name of the product you want to delete from the order:");
        String productName = scanner.nextLine();

        for (int i = 0; i < orders.size(); i++) {
            String[] product = orders.get(i);
            if (product[0].equalsIgnoreCase(productName)) {
                orders.remove(i);
                LOGGER.info("\nProduct '" + productName + "' deleted from the order.");
                return;
            }
        }

        LOGGER.info("\nProduct '" + productName + "' not found in the order.");
    }}
