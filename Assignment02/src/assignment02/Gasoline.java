package assignment02;

public class Gasoline extends Oil {
	private int price;
	private double VAT;
	
	public Gasoline(String company,int price) {
		super(company,"gasoline");
		this.price=price;
		VAT=((int)(Math.random()*30)+1)/100.0;
		setConsumerPrice((1+VAT)*price);
	}
	
	public double getOilPrice() {return getConsumerPrice();}
	public String toString() {return super.toString()+"Supply Price : "+price+"\n";}
}