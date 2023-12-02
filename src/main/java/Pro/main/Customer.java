package Pro.main;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	 private ProductCatalog productCatalog;
	    private List<String[]> orders;

	    public Customer(ProductCatalog productCatalog) {
	        this.productCatalog = productCatalog;
	        this.orders = new ArrayList<String[]>();
	    }

	    public void makePurchase(String categoryName, int productIndex) {
	        String[] product = getProductFromCategory(categoryName, productIndex);
	        if (product != null) {
	            orders.add(product);
	            System.out.println("Product added to the order: " + product[0]);
	        } else {
	            System.out.println("Product not available at the specified index.");
	        }
	    }

	    private String[] getProductFromCategory(String categoryName, int productIndex) {
	        switch (categoryName.toLowerCase()) {
	            case "interior":
	                return getProductFromList(productCatalog.getInteriorProducts(), productIndex);
	            case "exterior":
	                return getProductFromList(productCatalog.getExteriorProducts(), productIndex);
	            case "electronics":
	                return getProductFromList(productCatalog.getElectronicsProducts(), productIndex);
	            default:
	                System.out.println("Invalid category name. Please use 'interior', 'exterior', or 'electronics'.");
	                return null;
	        }
	    }


	    public void viewOrders() {
	        System.out.println("Customer's Orders:");
	        System.out.println("----------------------------------------------------");
	        System.out.println("Name\t\tPrice\tDescription");
	        System.out.println("----------------------------------------------------");
	        for (String[] order : orders) {
	            System.out.println(order[0] + "\t" + order[1] + "\t" + order[2]);
	        }
	        System.out.println("----------------------------------------------------");
	    }
	



}
