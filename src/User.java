import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		System.out.println("List of all available books: " + bl.toString() + "\n");
		
		Collections.sort(bl);
		System.out.println("List of all available books, sorted alphabetically: " + bl.toString()+ "\n");
		
		System.out.println("-----------------------------------");
		System.out.println("Input your search criteria in following format: (bookName, author, genre, yearOfPublishing)");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine().toLowerCase();
		input.close();
		
		
		String[] byElement = userInput.split(",");
		
		List<Books> DF = 
				bl.stream()
			               .filter(a -> a.getAuthor().toLowerCase().equals(byElement[1].trim()))
			               .collect(Collectors.toList());
		System.out.println("Book(s) which matched your criteria (author) :" + DF.toString()+ "\n");
		
				
        //Check if at least one book in your list corresponds to some search criteria (e.g. year of Publishing)
        
        Predicate<Books> publishingYear = p->p.getYearOfPublishing()<=(Integer.parseInt(byElement[3].trim()));
	        if (bl.stream().anyMatch(publishingYear)) {
	        	System.out.println("At least one book in the library match your search criteria (year)");
	        	List<Books> DF1 = 
						bl.stream()
					               .filter(p->p.getYearOfPublishing()<=(Integer.parseInt(byElement[3].trim()))).collect(Collectors.toList());
				System.out.println("Book(s) which matched your criteria: " + DF1.toString()+ "\n");
	        } else {
	        	System.out.println("None of the book in the library match your search criteria (year)\n");
	        }
	        
        
        //Check if all books in your list corresponds to some search criteria (e.g. Genre)
	        
        Predicate<Books> genre = p->p.getGenre().toLowerCase().equals(byElement[2].trim());
        	if (bl.stream().allMatch(genre)) {
        		System.out.println("All books in library match your search criteria (genre): " + bl.toString()+ "\n");
        	} else {
        		System.out.println("Not of all books in library match your search criteria(genre)\n");
        	}
        	
        //Check if none of the books in your list corresponds to some search criteria (e.g. author)
        Predicate<Books> author = p->p.getAuthor().toLowerCase().equals(byElement[1].trim());
        	if (bl.stream().anyMatch(author)) {
        		System.out.println("At least one book in the library match your search criteria(author)\n");
        	} else {
        		System.out.println("None of the books in library match your search criteria(author)\n");
        	}
		}
				
	}
			
			

