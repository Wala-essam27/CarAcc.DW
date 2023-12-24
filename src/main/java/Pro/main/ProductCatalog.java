package Pro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCatalog {
    public static List<String[][]> productCategories;

    public ProductCatalog() {
    	 ProductCatalog.productCategories = new ArrayList<>();

        String[][] InteriorCategory = new String[][] {
        	 {"Interior", null, null, null},
             {"Seat Covers", "Custom-fit seat covers for comfort", "29.99", "In Stock"},
             {"Floor Mats", "Durable and easy to clean floor mats", "19.99", "In Stock"},
             {"Steering Wheel Cover", "Stylish cover for a comfortable grip", "14.99", "In Stock"},
             {null, null, null, null}
        };

        String[][] ExteriorCategory = new String[][] {
        	{"Exterior", null, null, null},
            {"Car Wax", "Protects and enhances the car's exterior shine", "9.99", "In Stock"},
            {"Windshield Wipers", "High-quality wipers for clear visibility", "7.99", "In Stock"},
            {"License Plate Frame", "Customizable frame for a personal touch", "5.99", "In Stock"},
            {null, null, null, null}
        };
        
        String[][] ElectronicsCategory = new String[][] {
        	 {"Electronics", null, null, null},
             {"Car Charger", "Dual USB port charger for devices", "12.99", "In Stock"},
             {"Bluetooth Car Kit", "Hands-free calling and music streaming", "24.99", "In Stock"},
             {"GPS Navigation System", "Turn-by-turn directions for easy navigation", "79.99", "In Stock"},
             {null, null, null, null}
        };

        productCategories.add(ElectronicsCategory);
        productCategories.add(ExteriorCategory);
        productCategories.add(InteriorCategory);
    }


    public int addProductCategory() {
        @SuppressWarnings("resource")
		Scanner scanne = new Scanner(System.in);
        System.out.println("Enter Category details:");
        scanne.nextLine(); 
        System.out.print("Category Name: ");
        String categoryName = scanne.nextLine();
        System.out.println("\nEnter product details:");
        System.out.print("Product Name: ");
        String name = scanne.nextLine();
        System.out.print("Description: ");
        String description = scanne.nextLine();
        System.out.print("Price: ");
        String price = scanne.nextLine();
        System.out.print("Availability: ");
        String availability = scanne.nextLine();
        String[][] newCategory = new String[][] {
          	 {categoryName, null, null, null},
               {name, description, price, availability},
               {null, null, null, null},
               {null, null, null, null},
               {null, null, null, null}};
           productCategories.add(newCategory);
        
        System.out.println("New product category '" + categoryName + "' added.");
        return 1;
        
    }

    public void addProduct(String categoryName, String name, String description, String price, String availability) {
        for (String[][] category : productCategories) {
            if (category[0][0] != null && category[0][0].equalsIgnoreCase(categoryName)) {
                for (int i = 0; i < category.length; i++) {
                    if (category[i][0] == null) {
                        category[i] = new String[]{name, description, price, availability};
                        System.out.println("Product added to category '" + categoryName + "'.");
                        return;
                    }
                }
                System.out.println("Category '" + categoryName + "' is full. Cannot add more products.");
                return;
            }
        }
        System.out.println("Category '" + categoryName + "' not found.");
    }
    public boolean viewAllProducts() {
        if (productCategories.isEmpty()) {
            System.out.println("No products in the catalog.");
            return true;
        }

        System.out.println("\n All Products in the Catalog:\n");

        for (String[][] category : productCategories) {
            for (String[] product : category) {

                if (product[0] != null && product[1] != null && product[2] != null && product[3] != null) {
                    System.out.println("Category: " + category[0][0]);
                    System.out.println("Product: " + product[0]);
                    System.out.println("Description: " + product[1]);
                    System.out.println("Price: " + product[2]);
                    System.out.println("Availability: " + product[3]);
                    System.out.println("------------------------");
                }
            }
        }
        return true;
    }

    
    public void searchAndFilterProducts(String keyword) {
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
            System.out.println("No products found matching the keyword: " + keyword);
        } else {
            System.out.println("\nFound Products Matching '" + keyword + "':");
            for (String[] product : foundProducts) {
                //System.out.println("Category: " + product[0]);
                System.out.println("\nProduct: " + product[0]);
                System.out.println("Description: " + product[1]);
                System.out.println("Price: " + product[2]);
                System.out.println("Availability: " + product[3]);
                System.out.println("------------------------");
            }
        }
    }
    public boolean deleteProduct() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter product Name:");
        String productName = scanner.nextLine();
        for (String[][] category : productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                    // Found the product, set its information to null
                    product[0] = null;
                    product[1] = null;
                    product[2] = null;
                    product[3] = null;
                    System.out.println("Product '" + productName + "' deleted.");
                    return true;
                }
            }
        }

        System.out.println("Product '" + productName + "' not found.");
        return false;
    }

    public boolean editProduct() {
    	Scanner scnner = new Scanner(System.in);
    	System.out.println("Enter product details:");
        System.out.print("Product Name: ");
        String productName = scnner.nextLine();
        System.out.print("NEW Product Name: ");
        String newName = scnner.nextLine();
        System.out.print("NEW Description: ");
        String newDescription = scnner.nextLine();
        System.out.print("NEW Price: ");
        String newPrice = scnner.nextLine();
        System.out.print("NEW Availability: ");
        String newAvailability = scnner.nextLine();
    	
    	    	
    	for (String[][] category : productCategories) {
            for (String[] product : category) {
                if (product != null && product[0] != null && product[0].equalsIgnoreCase(productName)) {
                    product[0] = newName;
                    product[1] = newDescription;
                    product[2] = newPrice;
                    product[3] = newAvailability;
                    System.out.println("Product '" + productName + "' updated.");
                    return true;
                }
            }
        }

        System.out.println("Product '" + productName + "' not found.");
        return false;
    }

    
   
}
