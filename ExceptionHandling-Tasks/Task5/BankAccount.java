package tasks.exceptionhandling;


class InvalidAccountException extends Exception {
 public InvalidAccountException(String message) {
     super(message);
 }
}


public class BankAccount {
 private double balance;

 
 public BankAccount(double balance) throws InvalidAccountException {
     if (balance < 0) {
         throw new InvalidAccountException("Account balance cannot be negative: " + balance);
     }
     this.balance = balance;
 }

 public void displayBalance() {
     System.out.println("Account balance: ₹" + balance);
 }

 public static void main(String[] args) {
     try {
        
         BankAccount account = new BankAccount(-5000);
         account.displayBalance();
     } catch (InvalidAccountException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }

     System.out.println("Program ends...");
 }
}

