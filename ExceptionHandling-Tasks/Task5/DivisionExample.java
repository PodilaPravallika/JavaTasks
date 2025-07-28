package tasks.exceptionhandling;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to divide 100: ");
        int number = sc.nextInt();

        try {
            int result = 100 / number;
            System.out.println("Result: 100 / " + number + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}

