package ejercicio.electrodomesticos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Electrodomestico> list=createList();
		printPrice(list);
		printTypePrice(list);
	}
	
	public static List<Electrodomestico> createList(){
		List<Electrodomestico> list=new ArrayList<Electrodomestico>();
		list.add(new Lavadora(5,100,10,Constants.COLOR_GRIS,Constants.CONSUMO_C));
		list.add(new Television(20,true,100,10,Constants.COLOR_NEGRO,Constants.CONSUMO_D));
		list.add(new Lavadora());
		list.add(new Television());
		list.add(new Electrodomestico());
		return list;
	}
	
	public static void printPrice(List<Electrodomestico> list){
		for (Electrodomestico electrodomestico: list){
			System.out.println(electrodomestico.precioFinal());
		}
	}
	
	public static void printTypePrice(List<Electrodomestico> list){
		double priceLavadora=0;
		int cantLavadoras=0;
		double priceTelevision=0;
		int cantTelevision=0;
		for (Electrodomestico electrodomestico: list){
			if (electrodomestico instanceof Lavadora){
				cantLavadoras++;
				priceLavadora=electrodomestico.precioFinal()+priceLavadora;
				((Lavadora) electrodomestico).doNothing(); //esto es para hacer un casting transformar un electrodomestico al tipo de que es instancia
			}
			
			if (electrodomestico instanceof Television){
				cantTelevision++;
				priceTelevision=electrodomestico.precioFinal()+priceTelevision;
			}
			
		}
		System.out.println("El precio final de "+cantLavadoras+" lavadoras es "+priceLavadora);
		System.out.println("El precio final de "+cantTelevision+" televisores es "+priceTelevision);
	}
}
