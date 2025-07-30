package tasks.wrapperclasses;

public class WrapperComparisonDemo {
    public static void main(String[] args) {
        // Step 1: Create Integer objects
        Integer a = 100;                   // Autoboxing
        Integer b = 100;                   // Autoboxing
        Integer c = new Integer(100);      // Using constructor (not recommended in modern Java)
        Integer d = new Integer(100);      // Another new Integer object

        // Step 2: Compare using ==
        System.out.println("a == b (Autoboxing): " + (a == b));      // true (within Integer cache range)
        System.out.println("c == d (new Integer): " + (c == d));     // false (different objects)
        System.out.println("a == c (Autoboxed vs new): " + (a == c));// false (different memory)

        // Step 3: Compare using .equals()
        System.out.println("a.equals(b): " + a.equals(b));           // true
        System.out.println("c.equals(d): " + c.equals(d));           // true
        System.out.println("a.equals(c): " + a.equals(c));           // true
    }
}

