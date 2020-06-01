package assignment02;

public class FullArrayException extends Exception{
	public FullArrayException() {
		super("List is full!\nTry to expand...\nHow much will it expand??");
		System.out.println("List is full!\nTry to expand...\nHow much will it expand??");
	}
	public FullArrayException(String msg) {
		super(msg);
		System.out.println("List is full!\nTry to expand...\nHow much will it expand??");
	}
}
