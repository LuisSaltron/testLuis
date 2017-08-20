package inputs.example;

public class Cuenta {
	private String titular;
	private float cantidad, saldoInicial, saldoFinal;
	
	
	public Cuenta(String titular) {
		this.setTitular(titular);
		this.saldoInicial=100;
	}


	public Cuenta(String titular, float saldoInicial) {
		this.setTitular(titular);
		this.saldoInicial = saldoInicial;
	}
	
	public float Ingresar(float cantidad){
		this.cantidad=cantidad;
		if (this.cantidad>0){
			this.saldoFinal=this.saldoInicial+this.cantidad;
		}
		return this.saldoFinal;
	}
	

	public float Retirar(float cantidad){
		this.cantidad=cantidad;
		if (this.cantidad>this.saldoInicial){
			this.saldoFinal=0;
		}
		else{
			this.saldoFinal=this.saldoInicial-this.cantidad;
		}
		return this.saldoFinal;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
}
