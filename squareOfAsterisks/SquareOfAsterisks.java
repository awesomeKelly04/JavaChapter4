package squareOfAsterisks;

public class SquareOfAsterisks {

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void getSquare(int size) {
		if(size > 1 && size <20 ) {			
			int counter = 1;
			while (counter <= size) {
				if (counter == 1 || counter == size ) {
					for (int i = 1; i <= size; i++) {
						System.out.print("* ");
					} 
				}
				else {
					for (int i = 1; i <= size; i++) {
						if (i == 1 || i == size) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					} 
				}
				
				System.out.print("\n");
				counter++;
			}
		}
		else {
			System.out.println("Enter number between 1 and 20");
		}
	}
}
