package model;


import java.util.ArrayList;
import java.util.List;

public class Order {
    public String orderId;
    public List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<> ( );
    }

    public void addProduct(Product product) {
        products.add (product);
    }

    public double getTotalAmount() {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice ( );
        }
        return totalAmount;
    }

    public boolean hasProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId ( ).equals (productId)) {
                return true;
            }
        }
        return false;
    }
}
