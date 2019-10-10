package decimalEquivalent;

public class DecimalEquivalent {
	
	public int convertBinary(int number) {
		int decimal = 0;
		int length = String.valueOf(number).length();
		int denominator = 1;
		while(length - 1 != 0) {
			denominator *= 10;
			length--;
		}
		
		length = String.valueOf(number).length();
		if(number / denominator < 10) {
			decimal += (number / denominator)* Math.pow(2, length - 1);
			decimal += (number % 10)  * Math.pow(2, 0);		
			length--;
		}
		
		while(length - 1 > 0) {
			decimal += ((number % denominator)  / (denominator/10))* Math.pow(2, length - 1);
			denominator /=  10;
			length--;
		}
		
		return decimal;
	}

}
