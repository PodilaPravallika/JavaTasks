package ecommerce.model;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import ecommerce.payment.Payment;
public class Order {

    enum Status {
        ORDERED,
        CANCELLED
    }

    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private Status status;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
        this.status = Status.ORDERED;
    }
    
    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void saveOrderToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) { // append mode
            writer.write("===== ORDER DETAILS =====\n");
            writer.write("Customer: " + customer.getName() + " | Email: " + customer.getEmail() + "\n");

            for (Product p : products) {
                writer.write("Product: " + p.name + " | Price: ₹" + p.price + " | Remaining Stock: " + p.stockQuantity + "\n");
            }

            writer.write("Total Amount: ₹" + totalAmount + "\n");
            writer.write("Status: " + status + "\n");
            writer.write("Date: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
            writer.write("=========================\n\n");
            System.out.println("Order saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public void placeOrder(Payment payment, Discountable discountable) {
        if (status == Status.CANCELLED) {
            System.out.println("Order has been cancelled. Cannot place order.");
            return;
        }
        
        for (Product p : products) {
            if (!p.isInStock()) {
                System.out.println("Product out of stock: " + p.name);
                return;
            }
        }

        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();
        
        for (Product p : products) {
            p.reduceStock();
        }
        
        status = Status.ORDERED;
        
        saveOrderToFile("orders.txt");
    }

    public void cancelOrder() {
        if (status == Status.CANCELLED) {
            System.out.println("Order is already cancelled.");
        } else {
            status = Status.CANCELLED;
            System.out.println("Order has been cancelled successfully.");
        }
    }

    public void displayOrderStatus() {
        System.out.println("Current Order Status: " + status);
    }
    
}
