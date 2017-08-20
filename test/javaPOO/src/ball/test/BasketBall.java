package ball.test;

public class BasketBall extends Ball { //extends indica que BasketBall hereda los atributos de la clase Ball
	private boolean rebot;
	
	public BasketBall(float radio, boolean rebot){
		super(radio); //llama al metodo de la clase padre
		this.rebot=rebot;
	}
	
	public void printBall(){
		System.out.println("BOLA DE BASKET");
		super.printBall(); //llama al metodo de la clase padre
		System.out.println("¿Rebota?: "+this.rebot);
	}
}
