import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class User {
	private static int id = 1;
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public User(String firstName, String lastName) {
		
			this.firstName = firstName;
			this.lastName = lastName;
		
		System.out.println("New user created:\n Name: "+ firstName + " " + lastName+ "\n ID: " + id++);
		//System.out.println(ID++);
	}
	public void BList() {
		List<Books> bl = new ArrayList<Books>();
		bl.add(new Books("Blur", "Doe", "Novel", 1961));
		bl.add(new Books("Shining", "King", "Horror", 1981));
		bl.add(new Books("Harry Potter1", "Rowling", "Fentezi", 1999));
		bl.add(new Books("11.22.1961", "King", "Novel", 2015));
		bl.add(new Books("Christine", "King", "Horror", 1981));
		bl.add(new Books("Harry Potter2", "Rowling", "Fentezi", 2001));
		bl.add(new Books("Harry Potter3", "Rowling", "Fentezi", 2002));
		bl.add(new Books("Harry Potter4", "Rowling", "Fentezi", 2003));
		bl.add(new Books("Harry Potter5", "Rowling", "Fentezi", 2005));
		bl.add(new Books("Harry Potter6", "Rowling", "Fentezi", 2005));
		bl.add(new Books("Harry Potter7", "Rowling", "Fentezi", 2005));
		bl.add(new Books("Doctor Sleep", "King", "Novel", 2013));
		bl.add(new Books("Afterlife", "Samson", "Novel", 2015));
		
		System.out.println("List of all available books: " + bl.toString());
		
		Collections.sort(bl);
		System.out.println("List of all available books, sorted alphabetically: " + bl.toString());
		
		System.out.println("-----------------------------------");
		System.out.println("Please choose your author: ");
		Scanner input = new Scanner(System.in);
		String authorInput = input.nextLine().toLowerCase();
		input.close();
		
		List<Books> DF = 
				bl.stream()
			               .filter(a -> a.getAuthor().toLowerCase().equals(authorInput))
			               .collect(Collectors.toList());
		System.out.println("Book(s) which matched your criteria: " + DF.toString());
		
			}
				
	}
			
			

