package exercise4_5;

public class Exercise4_5 {

	public static void main(String[] args) {
		int sum = 0, x = 1;
		
		while (x <= 10) {
			sum += x++;
		}
		System.out.printf("The sum is : %d%n", sum);

	}

}