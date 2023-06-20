package model;

public class Product {
    public String productId;
    public String name;
    public double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
