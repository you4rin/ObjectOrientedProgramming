package selftest;

public class Project01_1 {
	public static void main(String[] args) {
		
		/*
		 * Declare 'counter' and 'totalDistance' variables.
		 * 		Initialize variable 'counter' as type int and value 3.
		 * 		Initialize variable 'totalDistance' as type int and value 15.
		 * Declare 'quotient' and 'remainder' variables as int type.
		 * 		Variable 'quotient' is a quotient of 'totalDistance / counter'.
		 * 		Variable 'remainder' is a remainder of 'totalDistance / counter'.
		 */
		int counter=3,totalDistance=15;
		int quotient=totalDistance/counter,remainder=totalDistance%counter;
		
			
		System.out.println("Quotient of totalDistance / counter: " + quotient);
		System.out.println("Remainder of totalDistance / counter: " + remainder);
	}
}
