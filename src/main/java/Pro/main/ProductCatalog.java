package Pro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCatalog {
    private List<String[][]> productCategories;

    public ProductCatalog() {
    	 this.productCategories = new ArrayList<>();

        // Initialize with some initial values (example)
        String[][] InteriorCategory = new String[][] {
        	 {"Interior", null, null, null},
             {"Seat Covers", "Custom-fit seat covers for comfort", "$29.99", "In Stock"},
             {"Floor Mats", "Durable and easy to clean floor mats", "$19.99", "In Stock"},
             {"Steering Wheel Cover", "Stylish cover for a comfortable grip", "$14.99", "In Stock"},
             {null, null, null, null}
        };

        String[][] ExteriorCategory = new String[][] {
        	{"Exterior", null, null, null},
            {"Car Wax", "Protects and enhances the car's exterior shine", "$9.99", "In Stock"},
            {"Windshield Wipers", "High-quality wipers for clear visibility", "$7.99", "In Stock"},
            {"License Plate Frame", "Customizable frame for a personal touch", "$5.99", "In Stock"},
            {null, null, null, null}
        };
        
        String[][] ElectronicsCategory = new String[][] {
        	 {"Electronics", null, null, null},
             {"Car Charger", "Dual USB port charger for devices", "$12.99", "In Stock"},
             {"Bluetooth Car Kit", "Hands-free calling and music streaming", "$24.99", "In Stock"},
             {"GPS Navigation System", "Turn-by-turn directions for easy navigation", "$79.99", "In Stock"},
             {null, null, null, null}
        };

        // Add initialized categories to the list
        productCategories.add(ElectronicsCategory);
        productCategories.add(ExteriorCategory);
        productCategories.add(InteriorCategory);
    }


    public void addProductCategory(int maxProducts, String categoryName) {
        String[][] newCategory = new String[maxProducts][4];
        productCategories.add(newCategory);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product details:");
        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Price: ");
        String price = scanner.nextLine();
        System.out.print("Availability: ");
        String availability = scanner.nextLine();
        addProduct(categoryName, name, description, price, availability);
        System.out.println("New product category '" + categoryName + "' added.");}

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
    public void viewAllProducts() {
        if (productCategories.isEmpty()) {
            System.out.println("No products in the catalog.");
            return;
        }

        System.out.println("All Products in the Catalog:");

        for (String[][] category : productCategories) {
            for (String[] product : category) {
            	
                if (product[0] != null && product[1] != null&& product[2] != null&& product[3] != null) {
                	System.out.println("Category: " + category[0][0]);
                    System.out.println("Product: " + product[0]);
                    System.out.println("Description: " + product[1]);
                    System.out.println("Price: " + product[2]);
                    System.out.println("Availability: " + product[3]);
                    System.out.println("------------------------");
                }
            }
        }
    }
    
    public String[][] searchProducts(String keyword) {
        List<String[]> foundProducts = new ArrayList<>();
        for (String[][] category : productCategories) {
            for (String[] product : category) {
                if (product[0] != null && (product[0].toLowerCase().contains(keyword.toLowerCase()) ||
                        product[1].toLowerCase().contains(keyword.toLowerCase()))) {
                    foundProducts.add(product);
                }
            }
        }
        return foundProducts.toArray(new String[0][]);
    }
}
