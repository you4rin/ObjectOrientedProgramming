package assignment02;

public class Diesel extends Oil{
	private int price;
	private double VAT,envTax;
	
	public Diesel(String company,int price) {
		super(company,"diesel");
		this.price=price;
		VAT=((int)(Math.random()*30)+1)/100.0;
		envTax=500;
		setConsumerPrice((1+VAT)*price+envTax);
	}
	
	public double getOilPrice() {return getConsumerPrice();}
	public String toString() {return super.toString()+"Supply Price : "+price+"\n";}
}
