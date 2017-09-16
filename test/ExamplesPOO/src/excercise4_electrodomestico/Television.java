package excercise4_electrodomestico;

public class Television extends Appliances {

	static final double DEFAULT_SIZE = 20;
	static final boolean DEFAULT_TDT = false;
	static final double TDT_EXTRA = 50;
	static final double SCREEN40_EXTRA = 0.3;

	private double screenPrice;
	private double tdtPrice;
	private double screenSize;
	private boolean tdt;

	public Television() {
		super();
		this.screenSize = DEFAULT_SIZE;
		this.tdt = DEFAULT_TDT;
		super.energyUseExtra();
		super.checkWeight();
		checkTdt();
		checkScreen();
		finalPrice();
		
		
	}

	public Television(double basicPrice, double weight, String energyUse, String color, double screenSize,
			boolean tDT) {
		super(basicPrice, weight, energyUse, color);
		this.screenSize = screenSize;
		this.tdt = tDT;
		super.energyUseExtra();
		super.checkWeight();
		checkTdt();
		checkScreen();
		finalPrice();
	}

	public Television(double basicPrice, double weight) {
		super(basicPrice, weight);
		this.screenSize = DEFAULT_SIZE;
		this.tdt = DEFAULT_TDT;
		super.energyUseExtra();
		super.checkWeight();
		checkTdt();
		checkScreen();
		finalPrice();
	}

	private void checkTdt() {
		if (this.tdt)
			this.tdtPrice = TDT_EXTRA;
		else
			this.tdtPrice = 0;
	}

	private void checkScreen() {
		if (this.screenSize > 40)
			this.screenPrice = this.basicPrice*SCREEN40_EXTRA;
		else
			this.screenPrice = 0;
	}

	@Override
	public double finalPrice() {
		this.finalPrice = this.basicPrice + this.energyUsePrice + this.screenPrice + this.weightPrice + this.tdtPrice;
		return this.finalPrice;
	}

	@Override
	public String toString() {
		return "Television [screenPrice=" + screenPrice + ", tdtPrice=" + tdtPrice + ", screenSize=" + screenSize
				+ ", tdt=" + tdt + ", basicPrice=" + basicPrice + ", finalPrice=" + finalPrice + ", weight=" + weight
				+ ", weightPrice=" + weightPrice + ", energyUsePrice=" + energyUsePrice + ", energyUse=" + energyUse
				+ ", color=" + color + "]";
	}

}
