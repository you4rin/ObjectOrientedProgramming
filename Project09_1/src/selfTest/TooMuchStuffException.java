package selfTest;

public class TooMuchStuffException extends Exception {

	private int inputNumber;
	
	public TooMuchStuffException() {
		/* your code */
		super("Too much stuff!");
	}
	
	public TooMuchStuffException(int val) {
		/* your code */
		super();
		inputNumber=val;
	}
	
	public int getNumber() {
		/* your code */
		return inputNumber;
	}
	
}
