package org.example;


import model.Customer;
import model.Order;
import model.Product;

public class Main {
    public static void main(String[] args) {
        // Register Customers
        Customer customer1 = new Customer("C1", "John");
        Customer customer2 = new Customer("C2", "Jane");

        // Create Products
        Product product1 = new Product("P1", "Product 1", 10.0);
        Product product2 = new Product("P2", "Product 2", 15.0);
        Product product3 = new Product("P3", "Product 3", 20.0);

        // Place Orders
        Order order1 = new Order("O1");
        order1.addProduct(product1);
        order1.addProduct(product2);
        customer1.placeOrder(order1);

        Order order2 = new Order("O2");
        order2.addProduct(product1);
        order2.addProduct(product3);
        customer1.placeOrder(order2);

        Order order3 = new Order("O3");
        order3.addProduct(product2);
        customer2.placeOrder(order3);

        // Get total payable amount for a customer
        System.out.println("Total payable amount for Customer 1: $" + customer1.getTotalPayableAmount());

        // Get number of orders for a specific product
        String productId = "P1";
        int orderCount = customer1.getProductOrderCount(productId);
        System.out.println("Number of orders for product " + productId + ": " + orderCount);
    }
}
