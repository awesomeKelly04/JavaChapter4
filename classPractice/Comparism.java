package classPractice;

public class Comparism {

	private int firstNumber;
	private int secondNumber;
	
	public Comparism(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}	
	
	public int getGreater(int firstNumber, int secondNumber) {
		int max = 0;
		if(firstNumber > secondNumber) {
			max = firstNumber;			
		}
		else{
			max = secondNumber;
		}
		return max;
	}
	
	public int getLesser(int firstNumber, int secondNumber) {
		int min = 0;
		if(firstNumber < secondNumber) {
			min = firstNumber;			
		}
		else{
			min = secondNumber;
		}
		return min;
	}
}
