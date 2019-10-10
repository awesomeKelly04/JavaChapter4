package tabularOutput;

public class TabularOutput {

	public void getTableData() {
		int counter = 1;
		
		System.out.printf("N\t\t%d*N\t\t%d*N\t\t%d*N%n", 10, 100, 1000);
		
		while(counter <= 5) {
			System.out.printf("%d\t\t%d\t\t\t%d\t\t%d%n", counter, 10*counter, 100*counter, 1000*counter);			
			++counter;
		}
	}
}
