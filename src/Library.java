import java.util.Arrays;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Librarian lb1 = new Librarian("Pavlo", "Petrenko");
//		lb1.SeeAllBooks();
//		lb1.TakeTheBooks();
		
		
		System.out.println("--------------------------------");
		Reader rd1 = new Reader("Viktor", "Tyshchenko");
//		rd1.setBalance(500);
//		rd1.MonthlyBill();
//		rd1.SeeAllBooks();
//		rd1.TakeTheBooks();
		rd1.BList();
	}
	
	
}
