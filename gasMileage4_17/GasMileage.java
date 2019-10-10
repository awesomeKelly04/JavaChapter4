package gasMileage4_17;

import java.util.Scanner;

public class GasMileage {
	private int milesDriven;
	private int gallonsUsed;
	private static Scanner value;
	
	public int getMilesDriven() {
		return milesDriven;
	}
	
	public void setMilesDriven(int milesDriven) {
		this.milesDriven = milesDriven;
	}
	
	public int getGallonsUsed() {
		return gallonsUsed;
	}
	
	public void setGallonsUsed(int gallonsUsed) {
		this.gallonsUsed = gallonsUsed;
	}
	
	public double calculateMilesPerGallon(int milesDriven, int gallonsUsed) {		
		return (double)milesDriven / gallonsUsed;
	}
	
	public void combinedMilesPerGallon() {
		value = new Scanner(System.in);		
		double milesPerGallon = 0;
		double combinedMilesPerGallon = 0;
		int counter = 0;
		
		while(milesDriven != -1) {
			System.out.print("Enter miles driven  or -1 to exit: ");
			milesDriven = value.nextInt();			
			
			if (milesDriven != -1) {
				System.out.print("Enter gallons used: ");
				gallonsUsed = value.nextInt();
				
				milesPerGallon = calculateMilesPerGallon(milesDriven,
						gallonsUsed);
				counter++;
				combinedMilesPerGallon += milesPerGallon;
				System.out.printf("The miles per gallon is %.2f%n%n", milesPerGallon);
			}
		}
		
		if (combinedMilesPerGallon > 0) {
			System.out.printf("%nThe combined miles per gallon is %.2f%n%.2f%n", combinedMilesPerGallon,
					combinedMilesPerGallon / counter);
		}
		else {
			System.out.println("\nNo miles driven or gallon(s) used supplied.");
		}
		
	}
}
