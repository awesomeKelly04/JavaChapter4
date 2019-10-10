package salaryCalculator;

public class SalaryCalculator {

	private int straightTime;
	private int numberOfHours;
	private double hourlyRate;
	
	public SalaryCalculator(int straightTime) {
		this.straightTime = straightTime;
	}

	public int getStraightTime() {
		return straightTime;
	}

	public void setStraightTime(int straightTime) {
		this.straightTime = straightTime;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double grossPay(double hourlyRate, int hours) {
		double grossPay = 0;
		if(hours <= straightTime) {
			grossPay = hourlyRate * hours;
		}
		else {
			grossPay = hourlyRate * (double)(3 * hours - straightTime) / 2;
		}
		return grossPay;
	}
}

