package exerc_3_constants;

public class Constants {

	public static void main(String[] args) {
		final double toInches = 2.54; // declaración de una constante

		double cm = 6;
		double cmToInches = cm / toInches;
		int a = 5;
		int b = 7;
		int c = b + a; // operador aritmético (c=12)
		c++; // operador de incremento (c=13)
		c += 5; // otro operador de incremento (c=18)
		System.out.println(c);
		System.out.println("En " + cm + "centrímetros hay " + cmToInches + " pulgadas");
	}

}
