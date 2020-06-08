package selfTest;

public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) { this.beverage = beverage; }
	
	@Override
	public String getDescription() { return beverage.getDescription() + ", Steamed milk"; }
	
	@Override
	public double cost() { return .10 + beverage.cost(); }
}
