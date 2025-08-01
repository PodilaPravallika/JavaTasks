package tasks.wrapperclasses;

import java.util.ArrayList;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Step 1: Input list of temperature strings
        String[] tempStrings = {"36", "38", "40"};

        // Step 2: Convert to integers (Celsius) and calculate Fahrenheit
        ArrayList<Double> fahrenheitList = new ArrayList<>();

        System.out.println("Celsius to Fahrenheit Conversion:");
        for (String tempStr : tempStrings) {
            int celsius = Integer.parseInt(tempStr); // Parse to int
            double fahrenheit = (celsius * 9.0 / 5) + 32; // Convert to Fahrenheit
            fahrenheitList.add(fahrenheit); // Autobox to Double

            // Print both values
            System.out.println("Celsius: " + celsius + "°C  ->  Fahrenheit: " + fahrenheit + "°F");
        }

        // Optional: Print the Fahrenheit list
        System.out.println("\nStored Fahrenheit values in ArrayList: " + fahrenheitList);
    }
}

