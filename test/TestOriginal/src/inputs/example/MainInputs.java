package inputs.example;

import java.util.Scanner;

public class MainInputs {

	public static void main(String[] args) {
	
		Scanner scan;
		String titular;
		float saldoInicial, cantidad;
		Cuenta cuenta;
		float saldoCuenta;
		
		scan=new Scanner(System.in);
		System.out.println("Ingrese el nombre del titular:");
		titular=scan.nextLine();
		System.out.println("Ingrese el saldo inicial de la cuenta de banco:");
		saldoInicial=scan.nextFloat();
		System.out.println("Ingrese la cantidad a retirar");
		cantidad=scan.nextFloat();
	
		cuenta=new Cuenta(titular,3000);
		System.out.println("El titular es:"+cuenta.getTitular());
		saldoCuenta=cuenta.Ingresar(cantidad);
		System.out.println("EL saldo de su cuenta es: "+saldoCuenta);
		System.out.println("El titular es:"+cuenta.getTitular());
		saldoCuenta=cuenta.Retirar(cantidad);
		System.out.println("EL saldo de su cuenta es: "+saldoCuenta);
	}

}
