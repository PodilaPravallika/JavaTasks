package tasks.exceptionhandling;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class AgeChecking {
	static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older.");
     } else {
         System.out.println("Age is valid: " + age);
     }
 }

 public static void main(String[] args) {
     int age = 16; 

     try {
         validateAge(age);
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }

     System.out.println("Program continues after validation...");
 }
}

