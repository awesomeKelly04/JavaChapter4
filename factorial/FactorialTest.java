package factorial;

import java.util.Scanner;

public class FactorialTest {
	private static Scanner value;

	public static void main(String[] args) {
		value = new Scanner(System.in);
		
		Factorial factorial = new Factorial();
		
		System.out.print("Enter a number to calculate factorial: ");
		double number = value.nextDouble();
		
		System.out.printf("The factorial of %.0f is %.0f%n", number, factorial.getFactorial(number));
		System.out.printf("The Mathematical constant e of %.0f factorial is %f%n", number, factorial.getConstant(number));
		System.out.printf("The Mathematical constant e^%.0f factorial is %f%n", number, factorial.getEX(number));
	}

}
