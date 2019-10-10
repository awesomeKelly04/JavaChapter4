package findTheTwoLargestNumbers;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {

	private Scanner value;

	public void getTwoLargestNumbers() {
		int counter = 0;
		int number;
		int largest = 0;
		int secondLargest = 0;
		value = new Scanner(System.in);
		
		while(counter < 10) {
			System.out.print("Enter an integer value: ");
			number = value.nextInt();
			if(largest < number) {
				secondLargest = largest;
				largest = number;
			}			
			++counter;
		}
		
		System.out.printf("%nThe largest integer is %d%nThe second largest integer is %d%n", largest, secondLargest);
	}
}
