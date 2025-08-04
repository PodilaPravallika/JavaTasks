package tasks.collections;

import java.util.*;
import java.util.stream.*;

class Employee1 {
    String name;
    String department;

    Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class StreamGrouping {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Alice", "Sales"),
            new Employee1("Bob", "HR"),
            new Employee1("Charlie", "Sales"),
            new Employee1("David", "HR")
        );

        Map<String, List<Employee1>> map = employees.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}

