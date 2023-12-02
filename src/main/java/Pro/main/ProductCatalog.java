package Pro.main;

import java.util.ArrayList;
import java.util.List;
public class ProductCatalog {
   /* public String[][] interiorProducts;
    public String[][] exteriorProducts;
    public String[][] electronicsProducts;

    public ProductCatalog(int maxInterior, int maxExterior, int maxElectronics) {
        this.interiorProducts = new String[maxInterior][4]; // Assuming 4 columns for product listing: name, description, price, availability
        this.exteriorProducts = new String[maxExterior][4];
        this.electronicsProducts = new String[maxElectronics][4];
    }

    public void addInteriorProduct(String name, String description, String price, String availability) {
        for (int i = 0; i < interiorProducts.length; i++) {
            if (interiorProducts[i][0] == null) {
                interiorProducts[i] = new String[]{name, description, price, availability};
                return;
            }
        }
        System.out.println("Interior product category is full. Cannot add more products.");
    }

    public void addExteriorProduct(String name, String description, String price, String availability) {
        for (int i = 0; i < exteriorProducts.length; i++) {
            if (exteriorProducts[i][0] == null) {
                exteriorProducts[i] = new String[]{name, description, price, availability};
                return;
            }
        }
        System.out.println("Exterior product category is full. Cannot add more products.");
    }

    public void addElectronicsProduct(String name, String description, String price, String availability) {
        for (int i = 0; i < electronicsProducts.length; i++) {
            if (electronicsProducts[i][0] == null) {
                electronicsProducts[i] = new String[]{name, description, price, availability};
                return;
            }
        }
        System.out.println("Electronics product category is full. Cannot add more products.");
    }

    public String[][] searchProducts(String keyword) {
        List<String[]> foundProducts = new ArrayList<String[]>();
        for (String[] product : interiorProducts) {
            if (product[0] != null && (product[0].toLowerCase().contains(keyword.toLowerCase()) ||
                    product[1].toLowerCase().contains(keyword.toLowerCase()))) {
                foundProducts.add(product);
            }
        }
        for (String[] product : exteriorProducts) {
            if (product[0] != null && (product[0].toLowerCase().contains(keyword.toLowerCase()) ||
                    product[1].toLowerCase().contains(keyword.toLowerCase()))) {
                foundProducts.add(product);
            }
        }
        for (String[] product : electronicsProducts) {
            if (product[0] != null && (product[0].toLowerCase().contains(keyword.toLowerCase()) ||
                    product[1].toLowerCase().contains(keyword.toLowerCase()))) {
                foundProducts.add(product);
            }
        }
        return foundProducts.toArray(new String[0][]);
    }*/
}