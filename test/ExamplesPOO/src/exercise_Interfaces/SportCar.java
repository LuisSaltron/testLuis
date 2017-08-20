package exercise_Interfaces;

public class SportCar extends Car {

	public SportCar() {
		super();
	}

	public SportCar(String brand, String model, String year) {
		super(brand, model, year);
	}

	@Override
	public void starEngine() {
		System.out.println("El " + this.brand + " deportivo ha sido encendido");

	}

	@Override
	public void turnoffEngine() {
		System.out.println("El " + this.brand + " deportivo ha sido apagado");
	}

	@Override
	public void acelerate() {
		System.out.println("El "+this.brand+" deportivo está acelerando");

	}

	@Override
	public void brake() {
		System.out.println("El "+this.brand+" deportivo está frenando");
	}

	@Override
	public void showInformation() {
		System.out.println(
				"Este carro es deportivo marca: " + this.brand + " modelo: " + this.model + " y del año: " + this.year);
	}

}
