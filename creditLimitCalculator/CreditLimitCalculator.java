package creditLimitCalculator;

public class CreditLimitCalculator {
	private int accountNumber;
	private int balance;
	private int totalOfAllItemsCharged;
	private int totalOfAllCredits;
	private int allowedCreditLimit;
	
	public int calculateNewBalance(int balance, int totalOfAllItemsCharged, int totalOfAllCredits) {
		return balance + totalOfAllItemsCharged - totalOfAllCredits;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTotalOfAllItemsCharged() {
		return totalOfAllItemsCharged;
	}

	public void setTotalOfAllItemsCharged(int totalOfAllItemsCharged) {
		this.totalOfAllItemsCharged = totalOfAllItemsCharged;
	}

	public int getTotalOfAllCredits() {
		return totalOfAllCredits;
	}

	public void setTotalOfAllCredits(int totalOfAllCredits) {
		this.totalOfAllCredits = totalOfAllCredits;
	}

	public int getAllowedCreditLimit() {
		return allowedCreditLimit;
	}

	public void setAllowedCreditLimit(int allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}
	
}
