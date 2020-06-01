package assignment03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ElectionSim {

	private String outputFile;
	private int population;
	private Candidate[] candidates;
	private Region[] regions;
	
	public ElectionSim(String inputFile, String outputFile) {
		this.outputFile=outputFile;
		try {
			Scanner scanner=new Scanner(new FileInputStream(inputFile));
			scanner.next();population=scanner.nextInt();
			scanner.next();candidates=new Candidate[scanner.nextInt()];
			for(int i=0;i<candidates.length;++i)candidates[i]=new Candidate(scanner.next(),population);
			scanner.next();regions=new Region[scanner.nextInt()];
			for(int i=0;i<regions.length;++i)regions[i]=new Region(scanner.next(),scanner.nextInt(),scanner.nextInt(),candidates);
			scanner.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(0);
		}
	}
	
	public void saveData() {
		Arrays.sort(candidates);
		PrintWriter output;
		try{
			output=new PrintWriter(new FileOutputStream(outputFile));
			for(int i=0;i<candidates.length;++i) {
				if(i!=0)output.println("\n=================================");
				output.println("------------Candidate------------");
				output.println(candidates[i].toString());
				for(int j=0;j<regions.length;++j)output.println(regions[j].getRegionName()+": "+candidates[i].toRegionString(regions[j].getRegionNum()));
			}
			output.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(0);
		}
	}
	
	public void runSimulation() {
		boolean alive=true;
		for(int i=0;i<regions.length;++i)regions[i].start();
		while(alive) {
			boolean check=false;
			for(int i=0;i<regions.length;++i)check=check||regions[i].isAlive();
			alive=check;
		}
		saveData();
	}
}
