package tasks.filehandling;

import java.io.*;
import java.util.*;

public class ContactManager {
    static File file = new File("contacts.txt");

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact  2. Display All  3. Search by Name  4. Exit");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    bw.write(name + "," + phone);
                    bw.newLine();
                    bw.close();
                    break;

                case 2:
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    boolean found = false;
                    while ((line = reader.readLine()) != null) {
                        if (line.startsWith(search + ",")) {
                            System.out.println("Found: " + line);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Contact not found.");
                    reader.close();
                    break;

                case 4:
                    return;
            }
        }
    }
}

