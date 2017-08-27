package exercise1_cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String titular="";
		String number="";
		
		try {
			System.out.println("Ingrese el nombre del titular: ");
			titular = br.readLine();
			System.out.println("Ingrese la cantidad inicial de la cuenta: ");
			number = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		double cantidad=Double.parseDouble(number); //tipo String a double
		Cuenta cuenta=new Cuenta(titular,cantidad);
		cuenta.ingresar();
		cuenta.retirar(-1);
		System.out.println(cuenta.toString());
	}

}
