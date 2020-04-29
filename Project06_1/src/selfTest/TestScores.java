package selfTest;
import java.util.Scanner;

public class TestScores {
	public static final int MAX_NUMBER_SCORES = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] scores = new double[MAX_NUMBER_SCORES];
		int counting = 0;
		
		System.out.println("This program reads test scores and shows");
		System.out.println("how much each differs from the average.");
		System.out.println("Enter test scores:");
		
		counting = fillArray(scores);
		showDifference(scores, counting);
		
	}

	public static int fillArray(double[] numbers)
	{
		System.out.println("Mark the end of the list with a negative number.");	
		/* your code */
		Scanner keyboard=new Scanner(System.in);
		double temp;
		int size=0;
		while(true) {
			temp=keyboard.nextDouble();
			if(temp<0)break;
			numbers[size++]=temp;
		}
		return size;
	}
	
	public static void showDifference(double[] numbers,int size)
	{
		double average = computeAverage(numbers,size);
		
		System.out.println("Average of the scores = " + average);
		System.out.println("The scores are: ");
		
		/* your code */
		for(int i=0;i<size;++i)System.out.println(numbers[i]+" differs from average by "+(numbers[i]-average));
	}
	
	public static double computeAverage(double[] numbers,int size)
	{	
		/* your code */
		double ret=0;
		for(int i=0;i<size;++i)ret+=numbers[i];
		return ret/size;
	}
}
