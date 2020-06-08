package selfTest;

public class Cinnamon extends CondimentDecorator {
	Beverage beverage;
	
	public Cinnamon(Beverage beverage) { this.beverage = beverage; }
	
	@Override
	public String getDescription() { return beverage.getDescription() + ", Cinnamon"; }
	
	@Override
	public double cost() { return .50 + beverage.cost(); }
}
