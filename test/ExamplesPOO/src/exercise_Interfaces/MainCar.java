package exercise_Interfaces;

public class MainCar {

	public static void main(String[] args) {
		sportCar();
		truckCar();

	}
	
	public static void sportCar() {
		SportCar sportcar=new SportCar("Toyota","Corolla","2015");
		sportcar.showInformation();
		sportcar.starEngine();
		sportcar.acelerate();
		sportcar.brake();
		sportcar.turnoffEngine();
	}
	
	public static void truckCar() {
		TruckCar sportcar=new TruckCar("Toyota","Autana","2015",true);
		sportcar.showInformation();
		sportcar.starEngine();
		sportcar.acelerate();
		sportcar.brake();
		sportcar.turnoffEngine();
	}
}
