package findTheLargestNumber;

public class LargestNumberTest {

	private static FindTheLargestNumber largestNum;

	public static void main(String[] args) {
		largestNum = new FindTheLargestNumber();
		System.out.printf("%nThe largest integer is %d%n", largestNum.getLargest());
	}

}
