package tasks.oops;

class AdditionOverloading {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    String add(String firstName, String lastName) {
        return firstName.concat(" " + lastName); // added space between names
    }
}

public class Calculator {
    public static void main(String[] args) {
        AdditionOverloading add = new AdditionOverloading();

        int intResult = add.add(12, 12);
        double doubleResult = add.add(20.0, 34.5);
        String stringResult = add.add("Podila", "Pravallika");

        System.out.println("Addition of integers: " + intResult);
        System.out.println("Addition of doubles: " + doubleResult);
        System.out.println("Concatenation of strings: " + stringResult);
    }
}
