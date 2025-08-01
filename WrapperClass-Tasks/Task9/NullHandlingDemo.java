package tasks.wrapperclasses;

import java.util.Optional;

public class NullHandlingDemo {
    public static void main(String[] args) {
        // Step 1: Declare a Double object and set to null
        Double amount = null;

        // Step 2: Try unboxing to double (will cause NullPointerException)
        try {
            double value = amount; // Unboxing null
            System.out.println("Value: " + value);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException while unboxing: " + e);
        }

        // Step 3: Use default value strategy
        double safeValue = (amount != null) ? amount : 0.0;
        System.out.println("Safe value using default check: " + safeValue);

        // Step 4: Use Optional to handle null safely
        Optional<Double> optionalAmount = Optional.ofNullable(amount);
        double optionalValue = optionalAmount.orElse(0.0);
        System.out.println("Safe value using Optional: " + optionalValue);
    }
}
