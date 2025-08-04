package tasks.filehandling;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogFileWithTimeStamps {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("app.log", true));

        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        bw.write("[" + timestamp + "] Application started");
        bw.newLine();
        bw.close();

        System.out.println("Log written.");
    }
}

