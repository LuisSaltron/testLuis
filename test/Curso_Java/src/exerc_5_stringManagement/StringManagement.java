package exerc_5_stringManagement;

public class StringManagement {

	public static void main(String[] args) {
		String cadena=" Es una cadena  ";
		int length=cadena.length();					//longitud de la cadena
		String cadenaSinEspacio=cadena.trim();		//quitar espacios al inicio y fin de la cadena
		int lengthSinEsp=cadenaSinEspacio.length(); 
		char primerCaracter=cadena.trim().charAt(0);
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		String fraseResult=frase.substring(29,57); //muestra todos los caracteres que hay a partir del indice indicado
		String frase1="Es la frase número 1";
		String frase2="es la frase número 1";
		System.out.println(cadena);
		System.out.println("La cantidad de caracteres de la cadena es: "+length);
		System.out.println("La primera letra de la cadena es: "+primerCaracter);
		System.out.println(cadenaSinEspacio);
		System.out.println("La cantidad de caracteres de la cadena sin espacios al final e inicio es: "+lengthSinEsp);
		System.out.println("La última letra de la cadena es: "+cadenaSinEspacio.charAt(lengthSinEsp-1));
		System.out.println("Método substring: "+fraseResult);
		System.out.println("La frase 1 y la frase son iguales?: "+frase1.equals(frase2)); //evalua si las cadenas son iguales teniendo en cuenta mayusculas
		System.out.println("La frase 1 y la frase son iguales?: "+frase1.equalsIgnoreCase(frase2)); //evalua si son iguales ignorando mayusuculas
	}

}
