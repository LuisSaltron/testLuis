package exercise1_cuenta;

public class Cuenta {
	private String titular; //campo obligatorio
	private double cantidad;
	private double saldo;
	
	//constructores
	public Cuenta(String titular) {	//la cantidad es opcional
		this.titular = titular;
		this.cantidad = 0;
	}
	
	public Cuenta(String titular, double cantidad) { //obligatorio los 2 campos
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public void ingresar() {
		if (this.cantidad>0)
			this.saldo=this.cantidad;
		else
			this.saldo=0;
	}
	
	public  void retirar(double cantidad) {
		if (cantidad>0)
			this.saldo=this.cantidad-cantidad;
		else
			this.saldo=this.cantidad;
	}
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + ", saldo=" + saldo + "]";
	}

	//getters y setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
}
