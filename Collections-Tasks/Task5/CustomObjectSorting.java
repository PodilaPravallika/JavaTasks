package tasks.collections;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return Integer.compare(this.marks, s.marks);
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class CustomObjectSorting {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 85));
        list.add(new Student("Bob", 78));
        list.add(new Student("Charlie", 92));

        Collections.sort(list);
        System.out.println("Sorted by Marks: " + list);
    }
}

