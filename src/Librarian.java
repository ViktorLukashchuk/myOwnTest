import java.util.Scanner;

public class Librarian extends User implements ILibraryAction {

	public Librarian(String FirstName, String LastName) {
		super(FirstName, LastName);
		System.out.println("Role: " + this.getClass().getName()+ "\n");
	}

	@Override
	public String ReturnTheBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CurrentBooks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SeeAllBooks() {
		System.out.println("Please choose between following books: " + java.util.Arrays.asList(Book.values())  + "\n" + java.util.Arrays.asList(HiddenBook.values()) + "\n");
		
	}

	@Override
	public void TakeTheBooks() {
		Scanner input = new Scanner(System.in);
		String book = input.nextLine();
		switch(book.toLowerCase()) {
		case "national geographic":
			System.out.println("Your choise is " + Book.NATIONAL_GEOGRAPHIC);
			break;
		case "harry potter":
			System.out.println("Your choise is " + Book.HARRY_POTTER);
			break;
		case "beautiful one":
			System.out.println("Your choise is " + Book.BEAUTIFUL_ONE);
			break;
		case "christine":
			System.out.println("Your choise is " + Book.CRISTINE);
			break;
		case "blur":
			System.out.println("Your choise is " + Book.BLUR);
			break;
		case "catboat":
			System.out.println("Your choise is " + Book.CATBOAT);
			break;
		case "truth is the way":
			System.out.println("Your choise is " + Book.TRUTH_IS_THE_WAY);
			break;
		case "ameno":
			System.out.println("Your choise is " + HiddenBook.AMENO);
			break;
		case "state of mind":
			System.out.println("Your choise is " + HiddenBook.State_OF_MIND);
			break;
		default:
			System.out.println("UNKNOWN input. Please run the program again.");
			break;
		
	}
	}
	

	
}
