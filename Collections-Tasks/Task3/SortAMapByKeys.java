package tasks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAMapByKeys {
    public static void main(String[] args) {
        // Step 1: Create an unsorted HashMap
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(103, "Alice");
        unsortedMap.put(101, "Bob");
        unsortedMap.put(105, "Charlie");
        unsortedMap.put(102, "David");

        System.out.println("Unsorted HashMap:");
        for (Map.Entry<Integer, String> entry : unsortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Step 2: Convert HashMap to TreeMap (automatically sorted by keys)
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        System.out.println("\nSorted TreeMap (by keys):");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

