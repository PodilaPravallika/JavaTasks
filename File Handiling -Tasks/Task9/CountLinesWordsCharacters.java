package tasks.filehandling;

import java.io.*;

public class CountLinesWordsCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("info1.txt"));
        int lines = 0, words = 0, chars = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            String[] wordArray = line.trim().split("\\s+");
            words += wordArray.length;
            chars += line.replace(" ", "").length();
        }

        br.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters (excluding spaces): " + chars);
    }
}
