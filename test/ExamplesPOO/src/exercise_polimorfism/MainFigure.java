package exercise_polimorfism;

public class MainFigure {

	public static void main(String[] args) {
		square();
		triangle();
		
	}
	
	public static void square() {
		Square square;
		square=new Square();
		square.calculateArea();
		square.printArea();
		
		Square squareNew;
		squareNew=new Square(3.6f,4.2f);
		squareNew.calculateArea();
		squareNew.printArea();
	}
	
	public static void triangle() {
		Triangle triangle ;
		triangle=new Triangle();
		triangle.calculateArea();
		triangle.printArea();
		
		Triangle triangleNew;
		triangleNew=new Triangle(3.6f,4.2f);
		triangleNew.calculateArea();
		triangleNew.printArea();
	}

}
