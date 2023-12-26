package promain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProductCatalog {
    private static final String NOT_FOUND = "' not found.";
	private static final String ENTER_PRODUCT_DETAILS = "\nEnter product details:";
	private static final String CATEGORY = "\nCategory '";
	private static final String AVAILABILITY = "Availability: ";
	private static final String PRICE = "Price: ";
	private static final String DESCRIPTION = "Description: ";
	private static final String IN_STOCK = "In Stock";
	private static final String PRODUCT = "\nProduct: ";
	public static List<String[][]> productCategories;
    private static final Logger LOGGER = Logger.getLogger(Customer.class.getName());
    public ProductCatalog() {
    	 ProductCatalog.productCategories = new ArrayList<>();

        String[][] InteriorCategory = new String[][] {
        	 {"Interior", null, null, null},
             {"Seat Covers", "Custom-fit seat covers for comfort", "29.99", IN_STOCK},
             {"Floor Mats", "Durable and easy to clean floor mats", "19.99", IN_STOCK},
             {"Steering Wheel Cover", "Stylish cover for a comfortable grip", "14.99", IN_STOCK},
             {null, null, null, null}
        };

        String[][] ExteriorCategory = new String[][] {
        	{"Exterior", null, null, null},
            {"Car Wax", "Protects and enhances the car's exterior shine", "9.99", IN_STOCK},
            {"Windshield Wipers", "High-quality wipers for clear visibility", "7.99", IN_STOCK},
            {"License Plate Frame", "Customizable frame for a personal touch", "5.99", IN_STOCK},
            {null, null, null, null}
        };
        
        String[][] ElectronicsCategory = new String[][] {
        	 {"Electronics", null, null, null},
             {"Car Charger", "Dual USB port charger for devices", "12.99", IN_STOCK},
             {"Bluetooth Car Kit", "Hands-free calling and music streaming", "24.99", IN_STOCK},
             {"GPS Navigation System", "Turn-by-turn directions for easy navigation", "79.99", IN_STOCK},
             {null, null, null, null}
        };

        
        productCategories.add(ElectronicsCategory);
        productCategories.add(ExteriorCategory);
        productCategories.add(InteriorCategory);
    }


    public boolean addProductCategory() {
        @SuppressWarnings("resource")
		Scanner scanne = new Scanner(System.in);
LOGGER.info("\nEnter Category details:");
        scanne.nextLine(); 
        LOGGER.info("\nCategory Name: ");
        String categoryName = scanne.nextLine();
        LOGGER.info(ENTER_PRODUCT_DETAILS+
        "\nProduct Name: ");
        String name = scanne.nextLine();
        LOGGER.info(DESCRIPTION);
        String description = scanne.nextLine();
        LOGGER.info(PRICE);
        String price = scanne.nextLine();
        LOGGER.info(AVAILABILITY);
        String availability = scanne.nextLine();
        String[][] newCategory = new String[][] {
          	 {categoryName, null, null, null},
               {name, description, price, availability},
               {null, null, null, null},
               {null, null, null, null},
               {null, null, null, null}};
           productCategories.add(newCategory);
        
           
           
           LOGGER.info(String.format("New product category '%s' added.", categoryName));

        return true;
        
    }

    public void addProduct(String categoryName, String name, String description, String price, String availability) {
        for (String[][] category : productCategories) {
            if (category[0][0] != null && category[0][0].equalsIgnoreCase(categoryName)) {
                for (int i = 0; i < category.length; i++) {
                    if (category[i][0] == null) {
                        category[i] = new String[]{name, description, price, availability};
                        LOGGER.info("Product added to category '" + categoryName + "'.");
                        return;
                    }
                }
                LOGGER.warning(CATEGORY + categoryName + "' is full. Cannot add more products.");
                return;
            }
        }
        LOGGER.warning(CATEGORY + categoryName + NOT_FOUND);
    }
    public boolean viewAllProducts() {
        if (productCategories.isEmpty()) {
        	LOGGER.warning("\nNo products in the catalog.");
            return false;
        }

        LOGGER.info("\n All Products in the Catalog:\n");

        for (String[][] category : productCategories) {
            for (String[] product : category) {

                if (product[0] != null && product[1] != null && product[2] != null && product[3] != null) {
                	LOGGER.info(
                            "Category: " + category[0][0] + "\n" +
                                    PRODUCT + product[0] + "\n" +
                                    DESCRIPTION + product[1] + "\n" +
                                    PRICE + product[2] + "\n" +
                                    AVAILABILITY + product[3] + "\n" +
                                    "------------------------"
                    );
                }
            }
        }
        return true;
    }

    
    public boolean searchAndFilterProducts(String keyword) {
        List<String[]> foundProducts = new ArrayList<>();

        for (String[][] category : productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[1] != null &&
                    product[2] != null && product[3] != null &&
                    (product[0].toLowerCase().contains(keyword.toLowerCase()) ||
                     product[1].toLowerCase().contains(keyword.toLowerCase()) ||
                     product[2].toLowerCase().contains(keyword.toLowerCase()) ||
                     product[3].toLowerCase().contains(keyword.toLowerCase()))) {
                    foundProducts.add(product);
                }
            }
        }

        if (foundProducts.isEmpty()) {
        	LOGGER.warning("No products found matching the keyword: " + keyword);
        } else {
        	LOGGER.info("\nFound Products Matching '" + keyword + "':");
            for (String[] product : foundProducts) {

            	LOGGER.info(
                                PRODUCT + product[0] + "\n" +
                                DESCRIPTION + product[1] + "\n" +
                                PRICE + product[2] + "\n" +
                                AVAILABILITY + product[3] + "\n" +
                                "------------------------"                );
            }
            }
		return true;
            
        }
    
    public boolean deleteProduct() {
    	Scanner scanner = new Scanner(System.in);
    	LOGGER.info("\nEnter product Name:");
        String productName = scanner.nextLine();
        for (String[][] category : productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                   
                    product[0] = null;
                    product[1] = null;
                    product[2] = null;
                    product[3] = null;
                    LOGGER.info(PRODUCT + productName + "' deleted.");
                    return true;
                }
            }
        }

        LOGGER.warning(PRODUCT + productName + NOT_FOUND);
        return false;
    }

    public boolean editProduct() {
    	Scanner scnner = new Scanner(System.in);
    	LOGGER.info(ENTER_PRODUCT_DETAILS+
    	    			
    	            "\nProduct Name: ");
        String productName = scnner.nextLine();
        LOGGER.info("\nNEW Product Name: ");
        String newName = scnner.nextLine();
        LOGGER.info("\nNEW Description: ");
        String newDescription = scnner.nextLine();
        LOGGER.info("\nNEW Price: ");
        String newPrice = scnner.nextLine();
        LOGGER.info("\nNEW Availability: ");
        String newAvailability = scnner.nextLine();
    	
    	    	
    	for (String[][] category : productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                    product[0] = newName;
                    product[1] = newDescription;
                    product[2] = newPrice;
                    product[3] = newAvailability;
                    LOGGER.info(PRODUCT  + productName + "' updated.");
                    return true;
                }
            }
        }

        LOGGER.info(PRODUCT + productName + NOT_FOUND);
        return false;
    }

    
   
}
