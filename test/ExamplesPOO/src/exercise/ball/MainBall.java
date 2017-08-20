package exercise.ball;

public class MainBall {

	public static void main(String[] args) {
		
		float radio;
		float diameter;
		float weight;
		boolean bounce;
		
		Ball ball;
		ball=new Ball();
		ball.setRadio(3.5f);
		ball.setWeight(200);
		radio=ball.getRadio();
		diameter=ball.getDiameter();
		weight=ball.getWeight();
		System.out.print("Radio: ");
		System.out.println(radio);
		System.out.print("Peso: ");
		System.out.println(weight);
		System.out.print("Diámetro: ");
		System.out.println(diameter);
		
		Ball ball2;
		ball2=new Ball(20.5f,100);
		radio=ball2.getRadio();
		diameter=ball2.getDiameter();
		weight=ball2.getWeight();
		System.out.print("Radio: ");
		System.out.println(radio);
		System.out.print("Peso: ");
		System.out.println(weight);
		System.out.print("Diámetro: ");
		System.out.println(diameter);
		
		BasketBall basketBall;
		basketBall=new BasketBall(20.5f,100,true);
		radio=basketBall.getRadio();
		diameter=basketBall.getDiameter();
		weight=basketBall.getWeight();
		bounce=basketBall.getBounce();
		System.out.print("Radio: ");
		System.out.println(radio);
		System.out.print("Peso: ");
		System.out.println(weight);
		System.out.print("Diámetro: ");
		System.out.println(diameter);
		System.out.print("¿Rebota?: ");
		System.out.print(bounce);
	}

}
