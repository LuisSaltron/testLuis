package exercise_polimorfism;

public abstract class Figure {
	protected float area;
	protected float base;
	protected float height;	

	public Figure() {
		this.base=3;
		this.height=5;
	}
	
	public Figure(float base, float height) {
		this.base=base;
		this.height=height;
	}
	
	public abstract float calculateArea();
	
	public void printArea() {
		System.out.println("Esta es una figura genérica que no tiene procedimiento para el área");
	}

	public void setBase(float base) {
		this.base = base;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getBase() {
		return base;
	}

	public float getHeight() {
		return height;
	}
	
	
}
