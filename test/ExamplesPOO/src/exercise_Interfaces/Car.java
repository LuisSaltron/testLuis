package exercise_Interfaces;

public  abstract class Car implements Actions {
	
	String brand;
	String model;
	String year;
	
	public Car() {
		this.brand = "Marca genérica";
		this.model = "Modelo genérico";
		this.year = "Año genérico";
	}
	
	public Car(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	
}
