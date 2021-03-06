package ejemplo.cuenta;

public class Cuenta {
	private double cantidad;
	private String titular;
	
	public Cuenta (String titular){
		this.titular=titular;
	}
	public Cuenta(String titular,double cantidad){
		this.titular=titular;
		this.cantidad=cantidad;
	}
	
	public void ingresar(double cantidad){
		if (cantidad>0){
			this.cantidad=this.cantidad+cantidad;
		}
		
	}
	
	public double retirar(double cantidad){
		this.cantidad=this.cantidad-cantidad;
		if (this.cantidad<0){
			this.cantidad=0;
		}
		return this.cantidad;
	}
	
	public void print(){
		System.out.println("Titular: ".concat(this.titular).concat(" Saldo:") + (this.cantidad));
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
}
