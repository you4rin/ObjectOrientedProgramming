package selftest;

public class ChocolateFactory {
	public static void main(String[] args) {
		ChocolateBoiler a=ChocolateBoiler.getInstance();
		ChocolateBoiler b=ChocolateBoiler.getInstance();
	
		a.fill();
		b.fill();
		a.boil();
		b.boil();
		a.drain();
		b.drain();
	}
}
