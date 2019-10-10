package decimalEquivalent;

import java.util.Scanner;

public class DecimalEquivalentTest {
	private static Scanner value;

	public static void main(String[] args) {
		
		value = new Scanner(System.in);
		
		DecimalEquivalent binary = new DecimalEquivalent();
		
		System.out.print("Enter a binary number: ");
		int number = value.nextInt();
		
		System.out.printf("The decimal equivalent of %d is %d%n", number, binary.convertBinary(number));
		
//		if(number > 2147483647 && number < 0) {
//			System.out.printf("%.0f is not a valid binary number of integer%n", number);
//		}
//		else {
//			System.out.printf("The decimal equivalent of %.0f is %d%n", number, binary.convertBinary(number));
//		}
//		
	}

}
