package enforcingPrivacyWithCryptography;

import java.util.Scanner;

public class DecrytionTest {

	private static Decryption decryption;
	private static Scanner value;

	public static void main(String[] args) {

		value = new Scanner(System.in);
		decryption = new Decryption();
		boolean checker = false;
		
		while (checker == false) {
			System.out.print("Enter a four-digit encrypted number to decrypt: ");
			String number = value.nextLine();
			if (number.length() == 4) {
				decryption.setNumber(number);
				checker = true;
			} else {
				System.out.print("Sorry! This app only works for a four-digit integer...\n");
			} 
		}
		
		System.out.printf("%nHere is the encrypted value is  %s%n", decryption.decryteValue(decryption.getNumber()));
		
	}

}
