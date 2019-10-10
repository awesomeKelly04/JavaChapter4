package worldPopulationGrowth;

import java.util.Scanner;

public class WorldPopulationGrowthTest {

	private static Scanner value;
	private static WorldPopulationGrowth worldPopulationGrowth;
	
	public static void main(String[] args) {
		value = new Scanner(System.in);
		worldPopulationGrowth = new WorldPopulationGrowth();
		boolean checker = false;
		
		
		System.out.println("\nA program to determines World Population Growth\n");
		
		while (checker == false) {
			System.out.print("Enter the current world population: ");
			double pSize = value.nextDouble();
			if (pSize != 0.0) {
				worldPopulationGrowth.setPopulationSize(pSize);
				checker = true;
			}
			else {
				System.out.print("Sorry! Please enter a valid population size...\n");
			}
		}
		
		checker = false;
		while (checker == false) {
			System.out.print("Enter the annual world population growth rate: ");
			double pSize = value.nextDouble();
			if (pSize != 0.0) {
				worldPopulationGrowth.setGrowthRate(pSize);
				checker = true;
			}
			else {
				System.out.print("Sorry! Please enter a valid population size...\n");
			}		
		}
		
		System.out.println("\nYear\tAnticipated World Population\t\tNumerical Increase");
		int year = 1;
		int doubleYear = 0;
		while (year <= 100) {
			double populationSize = worldPopulationGrowth.getAnticipatedPopulationSize(
					worldPopulationGrowth.getNumericalIncrease(worldPopulationGrowth.getGrowthRate(), worldPopulationGrowth.getPopulationSize()), 
					worldPopulationGrowth.getPopulationSize(), year);
			
			System.out.printf("%d\t\t%.0f\t\t\t\t\t%.0f%n", year, populationSize, 
					worldPopulationGrowth.getNumericalIncrease(worldPopulationGrowth.getGrowthRate(), worldPopulationGrowth.getPopulationSize()));
			
			if(populationSize / worldPopulationGrowth.getPopulationSize() >= 2) {
				doubleYear = year;
			}		
			
			year++;
		}
		
		System.out.printf("%nYear %d's population would be double what it is today", doubleYear);
	}

}
