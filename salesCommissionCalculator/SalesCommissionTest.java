package salesCommissionCalculator;

import java.util.Scanner;

public class SalesCommissionTest {

	private static Scanner value;
	private static SalesCommissionCalculator salesComm;

	public static void main(String[] args) {
		value = new Scanner(System.in);
		salesComm = new SalesCommissionCalculator(239.99, 129.75, 99.95, 350.89);

		int item = 1;
		double grossSales = 0.0;
		
		while(item <= 4) {
			System.out.printf("Enter number of items sold for item %d: ", item);
			grossSales += salesComm.calculateSales(value.nextInt(), item++);
		}
		
		System.out.printf("%nSalesperson’s earnings $%.2f%n", salesComm.calculateEarnings(grossSales));
		
	}

}
