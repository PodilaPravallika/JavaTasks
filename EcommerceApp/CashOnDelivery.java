package ecommerce.payment;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Cash on Delivery - Amount to be collected: ₹" + amount);
    }
}
