package checked;
import java.util.Scanner;

public class CustomCheckedException {

	public static void main(String[] args) {
		
		System.out.println("Please enter number between 0 and 100");
		Scanner input = new Scanner(System.in);
		input.close();
		try {
			int num = input.nextInt();
			if (num < 0 || num > 100) {
				throw new InvalidNumberException();
			}
		} catch(InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
