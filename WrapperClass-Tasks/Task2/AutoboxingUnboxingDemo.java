package tasks.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        // Step 1: Declare a List<Double>
        List<Double> numbers = new ArrayList<>();

        // Step 2: Add primitive double values (Autoboxing happens here)
        numbers.add(10.5);
        numbers.add(20.0);
        numbers.add(15.75);
        numbers.add(9.25);

        // Step 3: Retrieve values using a loop and compute sum (Unboxing happens here)
        double sum = 0.0;
        for (Double num : numbers) {
            sum += num;  // implicit unboxing from Double to double
        }

        // Step 4: Calculate and display average
        double average = sum / numbers.size();

        // Output
        System.out.println("List of numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

