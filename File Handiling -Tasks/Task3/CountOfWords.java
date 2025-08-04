package tasks.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOfWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("info1.txt"));
		String line;
		int wordCount = 0;
		
		while((line = br.readLine())!= null)
		{
			String[] words = line.split("\\s+");
			wordCount += words.length;
		}
		
		br.close();
		System.out.println("Total words : "+wordCount);
	}

}
