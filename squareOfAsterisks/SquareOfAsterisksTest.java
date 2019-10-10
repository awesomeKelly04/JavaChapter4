package squareOfAsterisks;

import java.util.Scanner;

public class SquareOfAsterisksTest {

	private static Scanner value;

	public static void main(String[] args) {
		
		value = new Scanner(System.in);
		
		SquareOfAsterisks squareOfAsterisks = new SquareOfAsterisks();
		
		System.out.print("Enter an integer number: ");
		int number = value.nextInt();
		squareOfAsterisks.setSize(number);
		
		squareOfAsterisks.getSquare(squareOfAsterisks.getSize());
		
		

	}

}
