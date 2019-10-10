package creditLimitCalculator;

import java.util.Scanner;

public class CreditLimitCalculatorTest {

	private static Scanner value;

	public static void main(String[] args) {
		value = new Scanner(System.in);
		CreditLimitCalculator creditLimiter = new CreditLimitCalculator();
		System.out.print("Enter Account Number: ");
		creditLimiter.setAccountNumber(value.nextInt());		
		System.out.print("Enter Beginning Balance: ");
		creditLimiter.setBalance(value.nextInt());		
		System.out.print("Enter Total Of All Items Charged: ");
		creditLimiter.setTotalOfAllItemsCharged(value.nextInt());		
		System.out.print("Enter Total Of All Credits: ");
		creditLimiter.setTotalOfAllCredits(value.nextInt());		
		System.out.print("Enter Allowed Credit Limit: ");
		creditLimiter.setAllowedCreditLimit(value.nextInt());		
		
		int newBalance = creditLimiter.calculateNewBalance(creditLimiter.getBalance(), creditLimiter.getTotalOfAllItemsCharged(), creditLimiter.getTotalOfAllCredits());

		System.out.printf("%nYour new balance is %d%n", newBalance);
		
		if(newBalance > creditLimiter.getAllowedCreditLimit()) {
			System.out.println("\nCredit limit exceeded\n");
		}
	}

}