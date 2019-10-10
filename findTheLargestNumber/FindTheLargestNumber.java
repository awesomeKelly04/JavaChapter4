package findTheLargestNumber;

import java.util.Scanner;

public class FindTheLargestNumber {

	private Scanner value;

	public int getLargest() {
		int counter = 0;
		int number;
		int largest = 0;
		value = new Scanner(System.in);
		
		while(counter < 10) {
			System.out.print("Enter an integer value: ");
			number = value.nextInt();
			if(largest < number) {
				largest = number;
			}
			++counter;
		}
		
		return largest;
	}
}
