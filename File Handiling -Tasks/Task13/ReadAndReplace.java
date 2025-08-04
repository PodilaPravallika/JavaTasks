package tasks.filehandling;

import java.io.*;

public class ReadAndReplace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("copy.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("info1.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            line = line.replace("Java", "Python");
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
        System.out.println("Replacement done.");
    }
}

