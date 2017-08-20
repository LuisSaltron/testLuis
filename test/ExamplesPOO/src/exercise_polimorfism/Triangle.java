package exercise_polimorfism;

public class Triangle extends Figure {
	
	public Triangle () {
		super();
	}
	
	public Triangle (float base, float height) {
		super(base,height);
	}
	
	public float calculateArea() {
		this.area=this.base*this.height;
		return this.area;
	}
	
	@Override
	public void printArea() {
		System.out.print("La base del triángulo es: ");
		System.out.println(this.base);
		System.out.print("El área del triángulo es: ");
		System.out.println(this.area);
	}
	
}
