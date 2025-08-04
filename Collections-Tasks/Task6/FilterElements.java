package tasks.collections;

import java.util.*;
import java.util.stream.*;

public class FilterElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C", "JavaScript", "Python");

        List<String> result = list.stream()
            .filter(s -> s.startsWith("J"))
            .collect(Collectors.toList());

        System.out.println("Strings starting with J: " + result);
    }
}

