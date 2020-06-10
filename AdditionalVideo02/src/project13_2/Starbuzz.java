package project13_2;

public class Starbuzz {
	
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	
		Beverage beverage3 = new Decaf();
		beverage3 = new Soy(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		Beverage beverage4 = new HouseBlend();
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
		
		Beverage beverage5 = new HyperDark();
		beverage5 = new Cinnamon(beverage5);
		System.out.println(beverage5.getDescription() + " $" + beverage5.cost());
	}
}
