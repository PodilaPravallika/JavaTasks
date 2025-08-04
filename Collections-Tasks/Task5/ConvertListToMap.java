package tasks.collections;

import java.util.*;
import java.util.stream.*;

class Student2 {
    String id;
    String name;

    Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
            new Student2("S1", "Alice"),
            new Student2("S2", "Bob"),
            new Student2("S3", "Charlie")
        );

        Map<String, Student2> map = students.stream()
            .collect(Collectors.toMap(s -> s.id, s -> s));

        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

