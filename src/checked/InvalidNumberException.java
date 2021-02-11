package checked;
public class InvalidNumberException extends Exception {
	
	public InvalidNumberException() {
		super("Invalid number. Please input number between 0 and 100");
	}
}