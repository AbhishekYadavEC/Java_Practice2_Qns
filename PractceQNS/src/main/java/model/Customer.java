package model;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String customerId;
    public String name;
    public List<Order> orders;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<> ( );
    }

    public void placeOrder(Order order) {
        orders.add (order);
    }

    public double getTotalPayableAmount() {
        double totalAmount = 0.0;
        for (Order order : orders) {
            totalAmount += order.getTotalAmount ( );
        }
        return totalAmount;
    }

    public int getProductOrderCount(String productId) {
        int count = 0;
        for (Order order : orders) {
            if (order.hasProduct (productId)) {
                count++;
            }
        }
        return count;
    }
}
