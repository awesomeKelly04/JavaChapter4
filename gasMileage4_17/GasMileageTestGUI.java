package gasMileage4_17;

import javax.swing.JOptionPane;

public class GasMileageTestGUI {	

	private static GasMileage gasMileage;

	public static void main(String[] args) {
		//String regexDecimal = "^-?\\d*\\.\\d+$";
		String regexInteger = "^-?\\d+$";
		//String regexDouble =  regexDecimal + "|" + regexInteger;
		gasMileage = new GasMileage();
		double milesPerGallon = 0;
		double combinedMilesPerGallon = 0;
				
		while(gasMileage.getMilesDriven() != -1) {
			
			boolean checker = false;
			while (checker == false) {
				String setMilesDriven = JOptionPane.showInputDialog("Enter miles driven  or -1 to exit:");
				
				if (setMilesDriven.matches(regexInteger)) {
					gasMileage.setMilesDriven(Integer.parseInt(setMilesDriven));	
					checker = true;
				}
				else {
					JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \n"
							+ "Please, only enter the integer value for miles driven.");
				}		
			}
						
			if (gasMileage.getMilesDriven() != -1) {
				checker = false;
				while (checker == false) {
					String setGallonsUsed = JOptionPane.showInputDialog("Enter gallons used: ");
					if (setGallonsUsed.matches(regexInteger)) {
						gasMileage.setGallonsUsed(Integer.parseInt(setGallonsUsed));
						checker = true;
					}
					else {
						JOptionPane.showMessageDialog(null, "Sorry! An integer value required... \n"
								+ "Please, only enter the integer value for gallons used.");
					}		
				}
				
				milesPerGallon = gasMileage.calculateMilesPerGallon(gasMileage.getMilesDriven(),
						gasMileage.getGallonsUsed());
				combinedMilesPerGallon += milesPerGallon;
				String message = String.format("The miles per gallon is %.2f%n%n", milesPerGallon);
				JOptionPane.showMessageDialog(null, message);
			}
		}
		
		String message = String.format("The combined miles per gallon is %.2f%n", combinedMilesPerGallon);
		JOptionPane.showMessageDialog(null, message);
		
	}

}
