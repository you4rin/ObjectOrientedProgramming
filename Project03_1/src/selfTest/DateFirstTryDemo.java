package selfTest;

public class DateFirstTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write the Code*/
		DateFirstTry date1=new DateFirstTry(),date2=new DateFirstTry();
		date1.month="April";date1.day=8;
		date2.month="Feburary";date2.day=14;
		
		date2.makeItNewYears();
		
		System.out.println("date1: " + date1.yellIfNewYear());
		System.out.println("date2: " + date2.yellIfNewYear());
		
	}

}
