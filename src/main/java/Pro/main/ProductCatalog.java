package Pro.main;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<String[][]> productCategories;

    public ProductCatalog() {
        this.productCategories = new ArrayList<>();
    }

    public void addProductCategory(int maxProducts, String categoryName) {
        String[][] newCategory = new String[maxProducts][4];
        productCategories.add(newCategory);
        System.out.println("New product category '" + categoryName + "' added.");
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
