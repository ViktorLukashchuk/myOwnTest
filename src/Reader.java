import java.util.Scanner;

public class Reader extends User implements IAction, ILibraryAction{
	
	public Reader(String FirstName, String LastName) {
		super(FirstName, LastName);
		System.out.println("Role: " + this.getClass().getName() + "\n");
	}
	private double balance;
	
	
	
	@Override
	public void MonthlyBill() {
		balance = balance - payment;
		System.out.println(getFirstName() + " " + getLastName() + " your bill is paid.");
		ShowBalance();
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void ShowBalance() {
		System.out.println("Your balance: " + balance);
		
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
		System.out.println("Please choose between following books: " + java.util.Arrays.asList(Book.values()) + "\n");
		
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
		default:
			System.out.println("UNKNOWN input. Please run the program again.");
			break;
		
	}
	}

	
}
