import java.util.Scanner;

enum WeekDays {
		
	MONDAY {
		@Override
		public String nextDay() { return WeekDays.MONDAY.next().name();}
    	},
    TUESDAY {
    	@Override
        public String nextDay() { return WeekDays.TUESDAY.next().name(); }
    	},
	WEDNESDAY {
    	@Override
    	public String nextDay() { return WeekDays.WEDNESDAY.next().name(); }
		},
	THURSDAY {
		@Override
		public String nextDay() { return WeekDays.THURSDAY.next().name(); }
		},
	FRIDAY {
		@Override
		public String nextDay() { return WeekDays.FRIDAY.next().name(); }
		},
	SATURDAY {
		@Override
		public String nextDay() { return WeekDays.SATURDAY.next().name(); }
		},
	SUNDAY {
		@Override
	    public String nextDay() { return WeekDays.SUNDAY.next().name(); }
		 };

    abstract String nextDay();
    static final WeekDays[] values = values();
    public WeekDays next() {
        return values[(ordinal() + 1) % values.length];
    }
}

public class Day {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your day of the week ");
		String day = input.nextLine();
		input.close();
		
		switch(day.toLowerCase()) {
		case "monday":
			System.out.println("The next day after Monday is " + WeekDays.MONDAY.nextDay());
			break;
		case "tuesday":
			System.out.println("The next day after Tuesday is " + WeekDays.TUESDAY.nextDay());
			break;
		case "wednesday":
			System.out.println("The next day after Wednesday is " + WeekDays.WEDNESDAY.nextDay());
			break;
		case "thursday":
			System.out.println("The next day after Thursday is " + WeekDays.THURSDAY.nextDay());
			break;
		case "friday":
			System.out.println("The next day after Friday is " + WeekDays.FRIDAY.nextDay());
			break;
		case "saturday":
			System.out.println("The next day after Saturday is " + WeekDays.SATURDAY.nextDay());
			break;
		case "sunday":
			System.out.println("The next day after Sunday is " + WeekDays.SUNDAY.nextDay());
			break;
		default:
			System.out.println("UNKNOWN input. Please run the program again.");
			break;
		}
				
	}

}
