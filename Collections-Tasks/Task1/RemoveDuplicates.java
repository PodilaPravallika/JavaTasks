package tasks.collections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Original list with duplicates
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("C");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Python");

        // Print original list
        System.out.println("Original List: " + listWithDuplicates);

        // Convert to Set to remove duplicates
        LinkedHashSet<String> setWithoutDuplicates = new LinkedHashSet<>(listWithDuplicates);

        // Convert back to list (optional)
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        // Print result
        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
    }
}

