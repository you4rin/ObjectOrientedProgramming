package assignment04;

public class AlreadyExistsInDicException extends Exception {
	public AlreadyExistsInDicException() {
		super("this word already exists in dictionary");
	}
	
	public AlreadyExistsInDicException(String e) {
		super(e);
	}
}
