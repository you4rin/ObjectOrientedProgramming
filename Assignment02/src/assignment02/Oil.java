package assignment02;

public abstract class Oil {
	private String company,oilType;
	private double consumerPrice;
	
	public Oil(String company,String oilType){
		this.company=company;
		this.oilType=oilType;
		setConsumerPrice(0);
	}
	public double getConsumerPrice() {return consumerPrice;}
	public void setConsumerPrice(double consumerPrice) {this.consumerPrice=consumerPrice;}
	public String toString() {return "company : "+company+"\noiltype : "+oilType+"\n";}
	public abstract double getOilPrice();
}
