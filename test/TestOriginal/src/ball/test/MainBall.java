package ball.test;
//el main se usa para correr el programa
public class MainBall {

	public static void main(String[] args) {
		testBall1();
		testBall2();
		testBall3();
	}
	
	public static void testBall1(){
		printSeparator("TEST1");
		Ball ball0=new Ball(0f);
		float diameter=ball0.getDiameter();
		System.out.println(diameter);
		
		Ball ball1=new Ball();
		diameter=ball1.getDiameter();
		System.out.println(diameter);
		
		Ball ball2=new Ball(5.5f);
		diameter=ball2.getDiameter();
		System.out.println(diameter);
		
		ball1.changeRadio(3.4f);
		diameter=ball1.getDiameter();
		System.out.println(diameter);
		printSeparator("FIN TEST1");
	}
	
	public static void testBall2(){
		Ball ball1=new Ball(3.2f,4.5f,"azul",false);
		printSeparator("TEST2");
		printBall(ball1);
		
		Ball ball2=new Ball(3.9f,5.5f,"azul",true);
		printBall(ball2);
		printSeparator("FIN TEST");
	}
	
	public static void testBall3(){
		printSeparator("TEST3");
		BasketBall ball1=new BasketBall(4.5f,true);
		printBall(ball1);
		printSeparator("FIN TEST3");
	}
	
	public static void printBall(Ball ball){
		printSeparator("BOLA");
		ball.printBall();
		printSeparator("FIN BOLA");
	}
	
	public static void printSeparator(String separator){
		System.out.println("--------"+separator+"---------");
	}
}
