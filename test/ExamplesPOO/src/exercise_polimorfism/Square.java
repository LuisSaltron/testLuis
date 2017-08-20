package exercise_polimorfism;

public class Square extends Figure {
	
	public Square () {
		super();
	}
	
	@Override
	public void printArea() {
		System.out.print("La base del cuadrado es: ");
		System.out.println(this.base);
		System.out.print("El área del cuadrado es: ");
		System.out.println(this.area);
	}
	public Square (float base, float height) {
		super(base,height);
	}
	
	public float calculateArea() {
		this.area=this.base*this.height;
		return this.area;
	}
}
