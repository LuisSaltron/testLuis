package ejercicio.electrodomesticos;

public class Electrodomestico {
	//definicion de constantes
	public static final double BASE_PRICE=100;
	public static final double DEFAULT_PESO=5;
	public static final String DEFAULT_CONSUMO="F";
	
	//atributos heredables
	protected double price;
	protected double peso;
	protected String color;
	protected String consumo;
	
	//constructor por defecto donde se asignan valores
	public Electrodomestico() {
		this.price = BASE_PRICE;
		this.color = Constants.COLOR_BLANCO;
		this.consumo = DEFAULT_CONSUMO;
		this.peso=DEFAULT_PESO;
	}
	
	public Electrodomestico(double price, double peso){
		this(); //llamo al constructor por defecto para traerme los valores por defecto
		this.price=price;
		this.peso=peso;
	}

	public Electrodomestico(double price, double peso, String color, String consumo) {
		super();
		this.price = price;
		this.peso = peso;
		this.color = color;
		this.consumo = consumo;
	}
	
	private double calculateExtraConsume(){
		double extraConsume=0;
		switch (this.consumo){
		case Constants.CONSUMO_A: //llamamos a las constantes que estan en una clase separada
			extraConsume=Constants.PRICE_CONSUMO_A;
		break;
		
		case Constants.CONSUMO_B: //llamamos a las constantes que estan en una clase separada
			extraConsume=Constants.PRICE_CONSUMO_B;
		break;
		
		case Constants.CONSUMO_C: //llamamos a las constantes que estan en una clase separada
			extraConsume=Constants.PRICE_CONSUMO_C;
		break;
		
		case Constants.CONSUMO_D: //llamamos a las constantes que estan en una clase separada
			extraConsume=Constants.PRICE_CONSUMO_D;
		break;
		
		case Constants.CONSUMO_E: //llamamos a las constantes que estan en una clase separada
			extraConsume=Constants.PRICE_CONSUMO_E;
		break;
		
		case Constants.CONSUMO_F: //llamamos a las constantes que estan en una clase separada
			extraConsume=Constants.PRICE_CONSUMO_F;
		break;
		}
		return extraConsume;
	}
	
	public double calculateSizePrice(){
		if (this.peso>=0 && this.peso<=19){
			return Constants.PRICE_SIZE_A;
		}
		else if(this.peso>=20 && this.peso<=49){
			return Constants.PRICE_SIZE_B;
		}
		else if(this.peso>=50 && this.peso<=79){
			return Constants.PRICE_SIZE_C;
		}
		else if(this.peso>80){
			return Constants.PRICE_SIZE_D;
		}
		return 0;
	}
	
	public double precioFinal(){
		this.price=this.price+calculateExtraConsume()+calculateSizePrice();
		return this.price;
	}
	
	public double getPrice() {
		return price;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public String getConsumo() {
		return consumo;
	}
}
