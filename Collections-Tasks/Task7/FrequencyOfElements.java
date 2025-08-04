package tasks.collections;

import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C", "Java", "Python", "Java");

        int freq = Collections.frequency(list, "Java");
        System.out.println("Frequency of 'Java': " + freq);
    }
}

