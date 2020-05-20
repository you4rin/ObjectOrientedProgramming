package selfTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		String name;
		
		try {
			Scanner scanner = new Scanner(new FileInputStream("resource\\candidate.txt"));
			
			while(scanner.hasNextLine()) {
				name=scanner.nextLine();
				calculator.addName(name);
			}
			scanner.close();
		
		} catch (FileNotFoundException e) {
			System.err.println("File not found or already be opened");
			System.exit(0);
		} catch (NoSuchElementException e) {
			System.err.println("Out of Boundary");
			System.exit(0);
		}
		
		try {
			File out = new File("resource\\election.txt");
			PrintWriter outputStream=new PrintWriter(new FileOutputStream(out));
			outputStream.println(calculator.toStringAllList());
			outputStream.close();
			
		} catch (IOException e) {
			System.err.println("IOException");
			System.exit(0);
		}
	}
}
