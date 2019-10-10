package salesCommissionCalculator;

public class SalesCommissionCalculator {

	private double itemOneValue;
	private double itemTwoValue;
	private double itemThreeValue;
	private double itemFourValue;
	
	public SalesCommissionCalculator(double itemOneValue, double itemTwoValue, double itemThreeValue, double itemFourValue) {
		this.itemOneValue = itemOneValue;
		this.itemTwoValue = itemTwoValue;
		this.itemThreeValue = itemThreeValue;
		this.itemFourValue = itemFourValue;
	}
	
	public double getItemOneValue() {
		return itemOneValue;
	}

	public void setItemOneValue(double itemOneValue) {
		this.itemOneValue = itemOneValue;
	}

	public double getItemTwoValue() {
		return itemTwoValue;
	}

	public void setItemTwoValue(double itemTwoValue) {
		this.itemTwoValue = itemTwoValue;
	}

	public double getItemThreeValue() {
		return itemThreeValue;
	}

	public void setItemThreeValue(double itemThreeValue) {
		this.itemThreeValue = itemThreeValue;
	}

	public double getItemFourValue() {
		return itemFourValue;
	}

	public void setItemFourValue(double itemFourValue) {
		this.itemFourValue = itemFourValue;
	}

	public double calculateEarnings(double grossSales) {
		return grossSales * 9 / 100 + 200;
	}
	
	public double calculateSales(int numberOfItems, int item) {
		double sales = 0;
		if (item == 1) {
			sales = numberOfItems * itemOneValue;
		}
		else if(item == 2) {
			sales = numberOfItems * itemTwoValue;
		}
		else if(item == 3) {
			sales = numberOfItems * itemThreeValue;
		}
		else {
			sales = numberOfItems * itemFourValue;
		}
		
		return sales;
	}
	
}
