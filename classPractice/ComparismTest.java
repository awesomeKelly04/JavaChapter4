package classPractice;

public class ComparismTest {
	private static Comparism compare;

	public static void main(String[] args) {
		compare = new Comparism(23, 53) ;
		
		int max = compare.getGreater(compare.getFirstNumber(), compare.getSecondNumber());
		int min = compare.getLesser(compare.getFirstNumber(), compare.getSecondNumber());
		
		if (max != min) {
			System.out.printf("The larger number is %d%nThe lesser number is %d%n", max, min);
		}
		else {
			System.out.println("The numbers are equal");
		}

	}

}
