package promain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class OrderManager {
    private static final String NO_PRODUCTS_IN_THE_ORDER = "\nNo products in the order.";
	private static final String PRODUCT2 = "\nProduct '";
	private List<String[]> orders;
    private static final Logger LOGGER = Logger.getLogger(OrderManager.class.getName());
    public OrderManager() {
        this.orders = new ArrayList<>();
        
    }

    public void purchaseProduct(ProductCatalog catalog) {
    	 catalog.viewAllProducts();
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        LOGGER.info("\nEnter the name of the product you want to purchase:");
        String productName = scanner.nextLine();

        for (String[][] category : ProductCatalog.productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                    orders.add(product);
                    LOGGER.info(PRODUCT2 + productName + "' added to the order.");
                    return;
                }
            }
        }

        LOGGER.info(String.format("%s '%s' not found in the catalog.", PRODUCT2, productName));

    }

    public void viewOrder() {
        if (orders.isEmpty()) {
            LOGGER.info(NO_PRODUCTS_IN_THE_ORDER);
        } else {
            System.out.println("\nOrder List:\n");
            double totalPrice = 0.0;
            for (String[] product : orders) {
            	LOGGER.info(String.format(
            	        "\nProduct: %s\nDescription: %s\nPrice: %s\nAvailability: %s\n------------------------",
            	        product[0], product[1], product[2], product[3]
            	));
                totalPrice += Double.parseDouble(product[2]);
            }
            LOGGER.info(String.format("\nTotal Price: %s\n", totalPrice));

        }
    }
    
    public void deleteOrder() {
        if (orders.isEmpty()) {
        	LOGGER.warning(NO_PRODUCTS_IN_THE_ORDER);
            return;
        }

        Scanner scanner = new Scanner(System.in);
        LOGGER.info("\nEnter the name of the product you want to delete from the order:");
        String productName = scanner.nextLine();

        for (int i = 0; i < orders.size(); i++) {
            String[] product = orders.get(i);
            if (product[0].equalsIgnoreCase(productName)) {
                orders.remove(i);
                LOGGER.info(String.format("%s '%s' deleted from the order.", PRODUCT2, productName));

                return;
            }
        }

        LOGGER.info(String.format("%s '%s' not found in the order.", PRODUCT2, productName));

    }}
