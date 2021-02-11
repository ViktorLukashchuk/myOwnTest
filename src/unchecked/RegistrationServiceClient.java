package unchecked;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RegistrationServiceClient {

	public static void main(String[] args) {
		System.out.println("Please input your email for checking");
		Scanner input = new Scanner(System.in);
		
		String email = input.nextLine();
		validateEmail(email);
    }
	public static void validateEmail(String email) {
        if (!isDomainValid(email)) {
            throw new CustomUncheckedException("Invalid domain");
        }
    }

    private static boolean isDomainValid(String email) {
        List<String> validDomains = Arrays.asList("gmail.com", "yahoo.com", "outlook.com");
        if (validDomains.contains(email.substring(email.indexOf("@") + 1))) {
            return true;
        }
        return false;
    }
}
