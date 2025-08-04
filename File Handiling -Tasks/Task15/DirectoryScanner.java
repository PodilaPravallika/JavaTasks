package tasks.filehandling;

import java.io.*;

public class DirectoryScanner {
    public static void main(String[] args) {
        File dir = new File(".");

        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println((f.isDirectory() ? "Directory" : "File") +
                        ": " + f.getName() + " - Size: " + f.length() + " bytes");
            }
        }
    }
}

