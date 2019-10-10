package enforcingPrivacyWithCryptography;

import java.util.Scanner;

public class EncryptionTest {

	private static Encryption encrytion;
	private static Scanner value;

	public static void main(String[] args) {

		value = new Scanner(System.in);
		encrytion = new Encryption();
		
		boolean checker = false;
		
		while (checker == false) {
			System.out.print("Enter a four-digit number to encrypt: ");
			String number = value.nextLine();
			if (number.length() == 4) {
				encrytion.setNumber(number);
				checker = true;
			} else {
				System.out.print("Sorry! This app only works for a four-digit integer...\n");
			} 
		}
		
		System.out.printf("%nHere is the encrypted value is  %s%n", encrytion.encryteValue(encrytion.getNumber()));
	}

}
