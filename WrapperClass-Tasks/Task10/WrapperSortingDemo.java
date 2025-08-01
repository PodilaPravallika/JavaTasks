package tasks.wrapperclasses;

import java.util.Arrays;

public class WrapperSortingDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of Integer objects
        Integer[] numbers = {45, 22, 89, 67, 89, 31};

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(numbers); // Ascending order

        // Step 3: Display sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Step 4: Find 2nd highest value (handle duplicates)
        int secondHighest = findSecondHighest(numbers);
        System.out.println("Second highest value: " + secondHighest);
    }

    // Utility method to find 2nd highest unique value
    public static int findSecondHighest(Integer[] arr) {
        // Start from end (highest values)
        int highest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (!arr[i].equals(highest)) {
                return arr[i]; // Found 2nd highest
            }
        }
        return -1; // If all values are the same
    }
}


