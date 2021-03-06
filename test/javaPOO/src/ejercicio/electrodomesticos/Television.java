package ejercicio.electrodomesticos;

public class Television extends Electrodomestico {
	private static final double RESOLUCION_MAX=40;
	private static final double EXTRA_RESOLUCION=1.30f;
	
	private double resolucion;
	private boolean tdt;
	
	public Television(){
		super();
		this.resolucion=Constants.RESOLUCION_TV;
		this.tdt=Constants.TDT_TV;
	}

	public Television(double price, double peso) {
		super(price,peso);
		this.resolucion=Constants.RESOLUCION_TV;
		this.tdt=Constants.TDT_TV;
	}

	public Television(double resolucion, boolean tdt, double price, double peso, String color, String consumo) {
		super(price, peso, color, consumo);
		this.resolucion=resolucion;
		this.tdt=tdt;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}		
	
	public double precioFinal(){
		super.precioFinal();
		if (this.resolucion>EXTRA_RESOLUCION){
			this.price=this.price*EXTRA_RESOLUCION;
		}
		
		if (this.tdt){
			this.price=this.price+Constants.EXTRA_TDT_TV;
		}
		return this.price;
	}
		
}
