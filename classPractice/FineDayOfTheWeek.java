package classPractice;

public class FineDayOfTheWeek {

	public String findWhen(int number) {
		String day = "";
		
		if (number <= 6) {
			day = String.format("The day of the week is %s%n", getDayOfTheWeek(number));;
		}
		else if (number/7 == 1) {
			 day = String.format("Next week %s%n", getDayOfTheWeek(number % 7));
		}
		else {
			day = String.format("Next %d weeks %s%n", number/7, getDayOfTheWeek(number % 7));
		}
		
		return day;
	}
	
	public String getDayOfTheWeek(int number) {
		String day = "";
		
		switch(number) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		}
		
		return day;
	}
}
