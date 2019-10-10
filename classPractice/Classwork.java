package classPractice;

import java.util.Scanner;

public class Classwork {

	private static Scanner value;

	public static void main(String[] args) {
		value = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = value.nextInt();
		
		if(number % 2 != 0) {
			System.out.printf("The number you entered is %d%n", number);
		}
		else {
			System.out.printf("The entered number is %d%n", number);
			System.out.printf("The even numbers between 0 and %d is(are): ", number);
			for(int i = 0; i < number; i++) {
				if(i%2 == 0 && i != 0) {
					System.out.printf("%d, ", i);
				}
			}
		}
		
	}

}
