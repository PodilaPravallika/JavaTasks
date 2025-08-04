package tasks.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentFromOneFileToAnother {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("info1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));
		
		String line;
		while((line = br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
		System.out.println("Content copied Successfully");
	}

}
