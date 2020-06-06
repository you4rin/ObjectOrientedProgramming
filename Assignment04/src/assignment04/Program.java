package assignment04;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Program {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		DictionaryArray arr=new DictionaryArray();
		ArrayList<WordDefinitionPair> DicList;
		String word,def,outputFile;
		boolean exit=false;
		int enter=0;
		
		while(!exit) {
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a word to dictionary");
			System.out.println("(2) Show definition of word");
			System.out.println("(3) Show word list");
			System.out.println("(4) Remove word");
			System.out.println("(5) Print all contents");
			System.out.println("(6) Exit program");
			System.out.println("=========================================");
			System.out.print("choose a menu : ");
			enter=keyboard.nextInt();
			switch(enter) {
			case 1:
				try {
					System.out.println("word : ");
					word=keyboard.next();
					System.out.println("definition : ");
					keyboard.nextLine();
					def=keyboard.nextLine();
					arr.insertEntry(word,def);
				}catch(AlreadyExistsInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("word for searching :");
					word=keyboard.next();
					arr.getDefinition(word);
				}catch(EmptyException e) {
					System.out.println(e.getMessage());
				}catch(NotInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {arr.printWords();}catch(EmptyException e) {System.out.println(e.getMessage());}
				break;
			case 4:
				try {
					System.out.print("word to remove : ");
					word=keyboard.next();
					arr.removeWord(word);
				}catch(EmptyException e) {
					System.out.println(e.getMessage());
				}catch(NotInDicException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {arr.printAll();}catch(EmptyException e) {System.out.println(e.getMessage());}
				break;
			case 6:
				exit=true;
				break;
			default:
				System.out.println("Insert 1 ~ 6");	
			}		
		}
		DicList=arr.getDicList();
		System.out.println("\nEnter a file name : ");
		outputFile=keyboard.next();
		try {
			PrintWriter writer=new PrintWriter(new FileOutputStream(outputFile));
			for(int i=0;i<DicList.size();++i) {
				writer.println((i+1)+". word : "+DicList.get(i).getWord());
				writer.println("   definition : "+DicList.get(i).getDefinition());
			}
			writer.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		System.out.print("saved as "+outputFile+"\nexit program");
	}
}
