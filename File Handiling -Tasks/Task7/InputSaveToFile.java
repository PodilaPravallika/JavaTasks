package tasks.filehandling;

import java.io.*;
import java.util.*;

public class InputSaveToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("userdata.txt"));

        System.out.print("Enter name: ");
        bw.write("Name: " + sc.nextLine() + "\n");

        System.out.print("Enter email: ");
        bw.write("Email: " + sc.nextLine() + "\n");

        System.out.print("Enter address: ");
        bw.write("Address: " + sc.nextLine() + "\n");

        bw.close();
        System.out.println("User data saved.");
    }
}

