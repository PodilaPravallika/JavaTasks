package ecommerce.app;

import ecommerce.model.*;
import ecommerce.payment.*;

import java.util.*;

public class EcommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create sample products
        List<Product> productList = new ArrayList<>();
        productList.add(new Book("B1001", "Effective Java", 899, "Joshua Bloch", "Pearson", 5));
        productList.add(new Furniture("F1002", "Office Chair", 2999, "Wood", "40x40x90cm", 2));
        productList.add(new Electronics("E1003", "Samsung S24", 75999, "Samsung", 24, 1));
        productList.add(new Clothing("C1004", "Formal Shirt", 1299, "M", "Cotton", 3));

        // Input Customer Details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        Customer customer = new Customer(name, email);

        // Show available products
        System.out.println("\nAvailable Products:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.print((i + 1) + ". ");
            productList.get(i).displayDetails();
        }

        // Select products
        System.out.print("\nEnter product numbers to order (comma-separated): ");
        String[] selectedIndexes = scanner.nextLine().split(",");
        List<Product> selectedProducts = new ArrayList<>();
        for (String indexStr : selectedIndexes) {
            int index = Integer.parseInt(indexStr.trim()) - 1;
            if (index >= 0 && index < productList.size()) {
                selectedProducts.add(productList.get(index));
            }
        }

        // Create Order
        Order order = new Order(customer, selectedProducts);

        // Discount input
        System.out.print("Enter discount percentage (e.g. 10 for 10%): ");
        double discountPercent = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        Discountable discount = price -> price * ((100 - discountPercent) / 100);

        // Payment Method
        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash on Delivery");
        System.out.print("Choice: ");
        int paymentChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Payment payment = null;
        switch (paymentChoice) {
            case 1:
                System.out.print("Enter UPI ID: ");
                String upi = scanner.nextLine();
                payment = new UpiPayment(0, upi);
                break;
            case 2:
                System.out.print("Enter Card Number: ");
                String card = scanner.nextLine();
                payment = new CardPayment(0, card);
                break;
            case 3:
                payment = new CashOnDelivery(0);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to COD.");
                payment = new CashOnDelivery(0);
        }

        // Place Order
        order.placeOrder(payment, discount);

        // Save to File
        order.saveOrderToFile("orders.txt");

        // Save to DB
        //order.saveToDatabase();

        // Cancel Option
        System.out.print("\nDo you want to cancel the order? (yes/no): ");
        String cancelChoice = scanner.nextLine();
        if (cancelChoice.equalsIgnoreCase("yes")) {
            order.cancelOrder();
        }

        order.displayOrderStatus();
        scanner.close();
    }
}
