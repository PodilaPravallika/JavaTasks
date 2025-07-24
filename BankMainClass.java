package tasks.oops;

public class BankMainClass 
{
	// Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount acc = new BankAccount("SB123456", 1000.0);

        // Using getters
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance       : ₹" + acc.getBalance());

        // Using deposit and withdraw
        acc.deposit(500);
        acc.withdraw(300);

        // Using setters
        acc.setAccountNumber("SB654321");
        acc.setBalance(2000);  // Using setter to directly set balance

        // Updated info
        System.out.println("Updated Account Number: " + acc.getAccountNumber());
        System.out.println("Updated Balance       : ₹" + acc.getBalance());
    }
}
