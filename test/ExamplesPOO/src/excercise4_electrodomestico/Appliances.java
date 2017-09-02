package excercise4_electrodomestico;

public abstract class Appliances implements Appliances_Interfaces {

	protected double basicPrice;
	protected double finalPrice;
	protected double weight;
	protected double weightPrice;
	protected double energyUsePrice;
	protected String energyUse;
	protected String color;
	
	// default constructor
	public Appliances() {
		this.basicPrice = Constants.DEFAULT_PRICE;
		this.weight = Constants.DEFAULT_WEIGHT;
		this.energyUse = Constants.DEFAULT_USE_ENERGY;
		this.color = Constants.DEFAULT_COLOR;
	}

	public Appliances(double basicPrice, double weight) {
		this.basicPrice = basicPrice;
		this.weight = weight;
		this.energyUse = Constants.DEFAULT_USE_ENERGY;
		this.color = Constants.DEFAULT_COLOR;
	}

	public Appliances(double basicPrice, double weight, String energyUse, String color) {
		this.basicPrice = basicPrice;
		this.weight = weight;
		this.energyUse = energyUse;
		this.color = color;
	}

	public void energyUseExtra() {
		switch (this.energyUse) {
		case "A":
			this.energyUsePrice = Constants.ENERGY_USE_A;
			break;
		case "B":
			this.energyUsePrice = Constants.ENERGY_USE_B;
			break;
		case "C":
			this.energyUsePrice = Constants.ENERGY_USE_C;
			break;
		case "D":
			this.energyUsePrice = Constants.ENERGY_USE_D;
			break;
		case "E":
			this.energyUsePrice = Constants.ENERGY_USE_E;
			break;
		case "F":
			this.energyUsePrice = Constants.ENERGY_USE_F;
			break;
		}
	}
	
	public void checkWeight() {
		if (this.weight >= 0 && this.weight <= 19)
			this.weightPrice = Constants.WEIGHT_19;
		else if (this.weight >= 20 && this.weight <= 49)
			this.weightPrice = Constants.WEIGHT_49;
		else if (this.weight >= 50 && this.weight <= 79)
			this.weightPrice = Constants.WEIGHT_79;
		else if (this.weight >= 80)
			this.weightPrice = Constants.WEIGHT_80;
	}

	@Override
	public String toString() {
		return "Appliances [basicPrice=" + basicPrice + ", finalPrice=" + finalPrice + ", weight=" + weight
				+ ", weightPrice=" + weightPrice + ", energyUsePrice=" + energyUsePrice + ", energyUse=" + energyUse
				+ ", color=" + color + "]";
	}
	
	

}
