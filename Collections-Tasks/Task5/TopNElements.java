package tasks.collections;

import java.util.*;

class Student3 {
    String name;
    int marks;

    Student3(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class TopNElements {
    public static void main(String[] args) {
        PriorityQueue<Student3> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.marks, a.marks)
        );

        pq.add(new Student3("Alice", 85));
        pq.add(new Student3("Bob", 92));
        pq.add(new Student3("Charlie", 88));
        pq.add(new Student3("David", 75));

        int topN = 3;
        System.out.println("Top " + topN + " Students:");
        for (int i = 0; i < topN && !pq.isEmpty(); i++) {
            System.out.println(pq.poll());
        }
    }
}

