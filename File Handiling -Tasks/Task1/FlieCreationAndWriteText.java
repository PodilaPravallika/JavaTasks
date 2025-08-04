package tasks.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FlieCreationAndWriteText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("info1.txt");
		fw.write("Java is a poweful language");
		fw.append("Learn java step by step");
		fw.close();
		System.out.println("File written successfully");
	}

}

