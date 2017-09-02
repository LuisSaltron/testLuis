package excercise4_electrodomestico;

public class Washer extends Appliances {

	static final double DEFAULT_LOAD = 5;
	static final double K30_LOAD_EXTRA = 50;

	private double load;
	private double loadPrice;

	// default constructor
	public Washer() {
		super();
		this.load = DEFAULT_LOAD;
		super.energyUseExtra();
		super.checkWeight();
		checkLoad();
		finalPrice();
	}

	public Washer(double basicPrice, double weight, String energyUse, String color, double load) {
		super(basicPrice, weight, energyUse, color);
		this.load = load;
		super.energyUseExtra();
		super.checkWeight();
		checkLoad();
		finalPrice();
	}

	public Washer(double basicPrice, double weight) {
		super(basicPrice, weight);
		this.load = DEFAULT_LOAD;
		super.energyUseExtra();
		super.checkWeight();
		checkLoad();
		finalPrice();
	}

	private void checkLoad() {
		if (this.load > 30)
			this.loadPrice = K30_LOAD_EXTRA;
		else
			this.loadPrice = 0;
	}

	@Override
	public double finalPrice() {
		this.finalPrice = this.basicPrice + this.energyUsePrice + this.loadPrice + this.weightPrice;
		return this.finalPrice;
	}

	@Override
	public String toString() {
		return "Washer [load=" + load + ", loadPrice=" + loadPrice + ", basicPrice=" + basicPrice + ", finalPrice="
				+ finalPrice + ", weight=" + weight + ", energyUsePrice=" + energyUsePrice + ", energyUse=" + energyUse
				+ ", color=" + color + "]";
	}

}
