import java.util.Scanner;

enum WeekDays {
	MONDAY {
        public String nextDay() { return "TUESDAY"; }
    	},
    TUESDAY {
        public String nextDay() { return "WEDNESDAY"; }
    	},
	WEDNESDAY {
	    public String nextDay() { return "THURSDAY"; }
		},
	THURSDAY {
		public String nextDay() { return "FRIDAY"; }
		},
	FRIDAY {
		public String nextDay() { return "SATURDAY"; }
		},
	SATURDAY {
		public String nextDay() { return "SUNDAY"; }
		},
	SUNDAY {
	    public String nextDay() { return "MONDAY"; }
		 };

    public abstract String nextDay();

}

public class Day {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your day of the week ");
		String day = input.nextLine();
			
		switch(day.toLowerCase()) {
		case "monday":
			System.out.println("The next day after " + day + " is " + WeekDays.MONDAY.nextDay());
			break;
		case "tuesday":
			System.out.println("The next day after " + day + " is " + WeekDays.TUESDAY.nextDay());
			break;
		case "wednesday":
			System.out.println("The next day after " + day + " is " + WeekDays.WEDNESDAY.nextDay());
			break;
		case "thursday":
			System.out.println("The next day after " + day + " is " + WeekDays.THURSDAY.nextDay());
			break;
		case "friday":
			System.out.println("The next day after " + day + " is " + WeekDays.FRIDAY.nextDay());
			break;
		case "saturday":
			System.out.println("The next day after " + day + " is " + WeekDays.SATURDAY.nextDay());
			break;
		case "sunday":
			System.out.println("The next day after " + day + " is " + WeekDays.SUNDAY.nextDay());
			break;
		}
				
	}

}
