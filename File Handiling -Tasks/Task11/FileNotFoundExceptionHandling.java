package tasks.filehandling;

import java.io.*;

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nofile.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

