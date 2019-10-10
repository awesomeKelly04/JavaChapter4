package factorial;

public class Factorial {

	public double getFactorial(double number) {
		double result = number;
		while(number > 1) {
			result *= (number - 1);
			number--;
		}
		return result;
	}
	
	public double getConstant(double number) {
		double result = 2;
		while( number > 1) {					
			result += 1/ getFactorial(number);
			number--;
		}
		return result;
	}
	
	public double getEX(double number) {
		double result = 1 + number;
		double num = number;
		while( number > 1) {					
			result += Math.pow(num, number)/ getFactorial(number);
			number--;
		}
		return result;
	}
}
