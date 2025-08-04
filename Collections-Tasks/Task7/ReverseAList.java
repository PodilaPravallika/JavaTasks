package tasks.collections;

import java.util.*;

public class ReverseAList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "C", "Python", "Ruby"));
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}

