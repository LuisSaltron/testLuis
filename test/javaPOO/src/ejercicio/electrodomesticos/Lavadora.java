package ejercicio.electrodomesticos;

public class Lavadora extends Electrodomestico{
	
	private static final double DEFAULT_CARGA=5;
	private static final double EXTRA_CARGA_LAVADORA=30;
	
	private double carga;
	
	public Lavadora(){
		super(); //llamando al constructor por defecto de la clase padre
		this.carga=DEFAULT_CARGA;
	}

	public Lavadora(double carga, double price, double peso, String color, String consumo) {
		super(price,peso,color,consumo);
		this.carga = carga;
	}
	

	public Lavadora(double price, double peso){
		super(price, peso); //llamando al constructor por defecto de la clase padre
		this.carga=DEFAULT_CARGA;
	}
	
	public double precioFinal(){
		super.precioFinal();
		if (this.carga>EXTRA_CARGA_LAVADORA){	
			this.price=this.price+Constants.PRICE_SIZE_LAVADORA;
		}
		return this.price;
		
	}
	
	public void doNothing(){}
	
	public double getCarga() {
		return carga;
	}
}
