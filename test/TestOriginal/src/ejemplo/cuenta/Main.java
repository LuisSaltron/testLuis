package ejemplo.cuenta;

public class Main {

	public static void main(String[] args) {
		Cuenta count=new Cuenta("Luis");
		count.ingresar(3000);
		count.print();
		count.retirar(4000);
		count.print();
	}

}
