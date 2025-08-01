package tasks.wrapperclasses;

import java.util.ArrayList;
import java.util.Collections;

public class GradesTracker {
    public static void main(String[] args) {
        // Step 1: Create ArrayList<Integer>
        ArrayList<Integer> marks = new ArrayList<>();

        // Step 2: Add 5 student marks using autoboxing
        marks.add(75);
        marks.add(88);
        marks.add(60);
        marks.add(92);
        marks.add(70);

        System.out.println("Original Marks: " + marks);

        // Step 3: Remove the lowest mark
        Integer minMark = Collections.min(marks);
        marks.remove(minMark);
        System.out.println("After removing lowest mark (" + minMark + "): " + marks);

        // Step 4: Calculate max, min, and average
        int maxMark = Collections.max(marks);
        int newMinMark = Collections.min(marks);
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / marks.size();

        // Step 5: Print results
        System.out.println("Maximum Mark: " + maxMark);
        System.out.println("Minimum Mark: " + newMinMark);
        System.out.println("Average Mark: " + average);
    }
}

