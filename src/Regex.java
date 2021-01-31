import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input you name in valid format. (e.g. Petro Petrenko)");
		String text = input.nextLine();
				
		while(!text.matches("([A-Z][a-z]{1,})\\s([A-Z][a-z]{1,})")) {
			System.out.println(text + " has not valid format. Please input your name again in valid format");
			text = input.nextLine();			
		} 
		
		input.close();
		System.out.println("Your name " + text + " has valid format");
	}

}
