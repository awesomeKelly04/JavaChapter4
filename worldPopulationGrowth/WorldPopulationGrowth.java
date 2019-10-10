package worldPopulationGrowth;

public class WorldPopulationGrowth {

	private double populationSize;
	private double growthRate;
	
	public double getPopulationSize() {
		return populationSize;
	}
	
	public void setPopulationSize(double populationSize) {
		this.populationSize = populationSize;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}
	
	public double getNumericalIncrease(double growthRate, double populationSize) {
		return growthRate / 100 * populationSize;
	}
	
	public double getAnticipatedPopulationSize(double numericalIncrease, double populationSize, int year) {
		return year * numericalIncrease + populationSize;
	}
	
}
