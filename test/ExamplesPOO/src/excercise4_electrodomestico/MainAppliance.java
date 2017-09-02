package excercise4_electrodomestico;

import java.util.ArrayList;
import java.util.List;

public class MainAppliance {

	public static void main(String[] args) {
		List<Appliances> list = createAppliance();
		printAppliances(list);

	}

	public static List<Appliances> createAppliance() {
		List<Appliances> appliances = new ArrayList<Appliances>();
		appliances.add(new Washer());
		appliances.add(new Washer(300, 20));
		appliances.add(new Television());
		appliances.add(new Television(200, 10));
		return appliances;
	}

	public static void printAppliances(List<Appliances> list) {
		double washerSum = 0;
		double tvSum = 0;
		for (Appliances appliances : list) {
			if (appliances instanceof Washer) {
				System.out.println(appliances.toString());
				washerSum = ((Washer) appliances).finalPrice() + washerSum;
			}

			if (appliances instanceof Television) {
				System.out.println(appliances.toString());
				tvSum = ((Television) appliances).finalPrice() + tvSum;
			}
		}
		System.out.println("Precio total lavadoras: " + washerSum);
		System.out.println("Precio total televisores: " + tvSum);
		/*
		 * if (appliances instanceof Washer) { ((Washer) appliances).finalPrice();
		 * System.out.println(appliances.toString()); } }
		 */
	}

}
