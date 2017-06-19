package exercise1;

public class Articulo {
	//constantes
	final double precioDetal=0.30;
	final double precioMayor=0.15;
	
	//atributos
	private String articulo;
	private double costoBase;
	
	public Articulo(){
		this.articulo="Computador";
		this.costoBase=3000;
	}
	
	public Articulo(String articulo,float costoBase){
		this.articulo=articulo;
		this.costoBase=costoBase;
	}
	
	public String getArticulo(){
		return this.articulo;
	}
	
	public double getCostoBase(){
		return this.costoBase;
	}
	
	public double obtenerPrecioDetal(){
		double pvp;
		pvp=this.costoBase*precioDetal+this.costoBase;
		return pvp;
	}
	
	public double obtenerPrecioMayor(){
		double pvp;
		pvp=this.costoBase*precioMayor+this.costoBase;
		return pvp;
	}
}
