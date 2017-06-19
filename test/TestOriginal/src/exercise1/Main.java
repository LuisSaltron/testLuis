package exercise1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo articulo,articulo2;
		String nameArticulo;
		double costoArticulo, pvpDetal, pvpMayor;
		
		
		articulo=new Articulo();
		articulo2=new Articulo("Cocina",2000);
		nameArticulo=articulo.getArticulo();
		costoArticulo=articulo.getCostoBase();
		
		System.out.println("Articulo: "+nameArticulo);
		System.out.println("Costo base: "+costoArticulo);
		
		nameArticulo=articulo2.getArticulo();
		costoArticulo=articulo2.getCostoBase();
		pvpDetal=articulo2.obtenerPrecioDetal();
		pvpMayor=articulo2.obtenerPrecioMayor();
		System.out.println("Articulo: "+nameArticulo);
		System.out.println("Costo base: "+costoArticulo);
		System.out.println("PVP al Detal: "+pvpDetal);
		System.out.println("PVP al Mayor: "+pvpMayor);
	}

}
