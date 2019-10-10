package classPractice;

import javax.swing.JOptionPane;

public class FineDayOfTheWeekTest {

	public static void main(String[] args) {

		String regexInteger = "^-?\\d+$";
		FineDayOfTheWeek day = new FineDayOfTheWeek();
		
		for ( ; ; ) {
			String getDay = JOptionPane.showInputDialog("Enter the integer value of the day of the week?");			
			
			if (getDay.matches(regexInteger)) {
				JOptionPane.showMessageDialog(null, day.findWhen(Integer.parseInt(getDay)));
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \n"
						+ "Please, only enter the integer value of the day of the week.");
			} 
		}		
	}
}
