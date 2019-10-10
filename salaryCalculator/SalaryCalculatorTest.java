package salaryCalculator;

import java.util.Scanner;

public class SalaryCalculatorTest {

	private static Scanner value;
	private static SalaryCalculator employee1;
	private static SalaryCalculator employee2;
	private static SalaryCalculator employee3;

	public static void main(String[] args) {

		value = new Scanner(System.in);
		
		employee1 = new SalaryCalculator(40);
		employee2 = new SalaryCalculator(40);
		employee3 = new SalaryCalculator(40);
		
		int employeeNumber = 1;
		
		while(employeeNumber <= 3) {
			System.out.printf("Enter employee %d numbers of hours worked: ", employeeNumber);
			if(employeeNumber == 1) {
				setNumberOfHours(employee1);
			}
			else if(employeeNumber == 2) {
				setNumberOfHours(employee2);
			}
			else {
				setNumberOfHours(employee3);
			}
			
			System.out.printf("Enter employee %d hourly rate: ", employeeNumber);
			if(employeeNumber == 1) {
				setHourlyRate(employee1);
			}
			else if(employeeNumber == 2) {
				setHourlyRate(employee2);
			}
			else {
				setHourlyRate(employee3);
			}
			
			employeeNumber++;
		}
		
		System.out.println();	
		employeeNumber = 1;
		while(employeeNumber <= 3) {
			double grossPay = 0;
			if(employeeNumber == 1) {
				grossPay = grossPay(employee1);
			}
			else if(employeeNumber == 2) {
				grossPay = grossPay(employee2);
			}
			else {
				grossPay = grossPay(employee3);
			}
			System.out.printf("Enter employee %d gross pay is $%.2f%n ", employeeNumber, grossPay);	
			employeeNumber++;
		}		
	}
	
	public static void setNumberOfHours(SalaryCalculator employee) {
		employee.setNumberOfHours(value.nextInt());
	}
	
	public static void setHourlyRate(SalaryCalculator employee) {
		employee.setHourlyRate(value.nextDouble());
	}

	public static double grossPay(SalaryCalculator employee) {
		return employee.grossPay(employee.getHourlyRate(), employee.getNumberOfHours());
	}
	
}

