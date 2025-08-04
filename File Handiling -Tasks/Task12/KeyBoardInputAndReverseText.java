package tasks.filehandling;

import java.util.*;

public class KeyBoardInputAndReverseText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reversed: " + sb.reverse());
    }
}

