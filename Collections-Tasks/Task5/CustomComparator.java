package tasks.collections;

import java.util.*;

class Student1 {
    String name;
    int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("Charlie", 90));
        list.add(new Student1("Alice", 85));
        list.add(new Student1("Bob", 75));

        list.sort(Comparator.comparing(s -> s.name));
        System.out.println("Sorted by Name: " + list);
    }
}

