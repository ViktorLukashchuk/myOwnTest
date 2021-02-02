import java.util.Scanner;

public class User {
	private static int ID = 1;
	private String FirstName;
	private String LastName;
	
	
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public User(String FirstName, String LastName) {
		
			this.FirstName = FirstName;
			this.LastName = LastName;
		
		System.out.println("New user created:\n Name: "+ FirstName + " " + LastName+ "\n ID: " + ID++);
		//System.out.println(ID++);
	}
	
}
