package selfTest;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileInputStream;

public class HasNextLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String line;
		int cnt=1;
		
		try {
			
			inputStream=new Scanner(new FileInputStream("resource\\BladeRunner.txt"));
			outputStream=new PrintWriter(new FileOutputStream("resource\\NumberdRunner.txt"));
			while(inputStream.hasNextLine()) {
				line=inputStream.nextLine();
				outputStream.println((cnt++)+" "+line);
			}
			inputStream.close();
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files.");
			System.exit(0);
		}
	}

}
