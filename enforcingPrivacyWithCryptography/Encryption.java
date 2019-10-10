package enforcingPrivacyWithCryptography;

public class Encryption {

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String encryteValue(String number) {
		
		/* Replace each digit with the result of adding 7 to the digit and 
		getting the remainder after dividing the new value by 10.*/
		int num1 = (Integer.parseInt(String.valueOf(number.charAt(0))) + 7) % 10;
		int num2 = (Integer.parseInt(String.valueOf(number.charAt(1))) + 7) % 10;
		int num3 = (Integer.parseInt(String.valueOf(number.charAt(2))) + 7) % 10;
		int num4 = (Integer.parseInt(String.valueOf(number.charAt(3))) + 7) % 10;
		
		//Then swap the first digit with the third, and swap the second digit with the fourth.
		String encryted = String.format("%d%d%d%d%n", num3, num4, num1, num2);
		
		return encryted;
	}
}

