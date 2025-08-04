package tasks.collections;

import java.util.HashSet;
import java.util.Set;

public class SetProperties {
    public static void main(String[] args) {
        // Create HashSet of Strings
        Set<String> programmingLanguages = new HashSet<>();

        // Add elements (with duplicates)
        programmingLanguages.add("Java");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");     // Duplicate
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");      // Duplicate

        // Print the set
        System.out.println("HashSet contents: " + programmingLanguages);
    }
}
