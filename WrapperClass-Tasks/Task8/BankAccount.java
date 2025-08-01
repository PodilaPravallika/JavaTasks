package tasks.wrapperclasses;

public class BankAccount {
    private String accountNumber;
    private Double balance;

    // Constructor
    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        // Step: Handle null balance (set to 0.0 if null)
        if (balance == null) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Show balance method
    public void showBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: ₹" + balance);
    }

    // Main method for demo
    public static void main(String[] args) {
        // Step: Create account with null balance
        BankAccount acc1 = new BankAccount("ACC12345", null);
        acc1.showBalance();   // Should show ₹0.0

        acc1.deposit(5000);
        acc1.withdraw(1500);
        acc1.showBalance();

        // Another account with non-null initial balance
        BankAccount acc2 = new BankAccount("ACC67890", 2000.0);
        acc2.showBalance();
        acc2.withdraw(2500); // Try overdraft
    }
}

