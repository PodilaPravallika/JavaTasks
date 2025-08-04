package tasks.filehandling;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));

        for (String fname : new String[]{"info1.txt", "nyfile.txt"}) {
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();
        }

        bw.close();
        System.out.println("Files merged successfully.");
    }
}

