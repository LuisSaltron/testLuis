package exercise_Interfaces;

public class TruckCar extends Car {
	
	boolean traction; 
	
	public TruckCar() {
		super();
		this.traction=false;
	}

	public TruckCar(String brand, String model, String year, boolean traction) {
		super(brand, model, year);
		this.traction=traction;
	}

	@Override
	public void starEngine() {
		System.out.println("La " + this.brand + " camioneta ha sido encendido");

	}

	@Override
	public void turnoffEngine() {
		System.out.println("La " + this.brand + " camioneta ha sido apagado");
	}

	@Override
	public void acelerate() {
		System.out.println("La "+this.brand+" camioneta está acelerando");

	}

	@Override
	public void brake() {
		System.out.println("La "+this.brand+" camioneta está frenando");
	}

	@Override
	public void showInformation() {
		System.out.println("Este carro es una camioneta marca: " + this.brand + " modelo: " + this.model + " tracción 4*4 "+this.traction+" y del año: " + this.year);
	}


}
