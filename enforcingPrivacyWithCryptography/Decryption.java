package enforcingPrivacyWithCryptography;

public class Decryption {

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String decryteValue(String num) {
		int number = Integer.parseInt(num);
		int num3 = number / 1000;
		int num4 = number / 100 % 10;
		int num1 = number % 100 / 10;
		int num2 = number % 10;
				
		/* Replace each digit with the result of adding 7 to the digit and 
		getting the remainder after dividing the new value by 10.*/
		num1 = (10 + num1 - 7) % 10;
		num2 = (10 + num2 - 7) % 10;
		num3 = (10 +num3 - 7) % 10;
		num4 = (10 + num4 - 7) % 10;
		
		//Then swap the first digit with the third, and swap the second digit with the fourth.
		String decryted = String.format("%d%d%d%d%n", num1, num2, num3, num4);
		
		return decryted;
	}
}
