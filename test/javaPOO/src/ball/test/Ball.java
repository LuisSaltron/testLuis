package ball.test;

public class Ball {
	private float volume;
	protected float radio;
	private String color;
	private boolean owner;
	
	public Ball(){
		this.radio=1.3f;
	}
	
	public Ball(float radio){
		this.radio=radio;
	}
	
	public Ball(float radio, float volume, String color, boolean owner){
		this.radio=radio;
		this.volume=volume;
		this.color=color;
		this.owner=owner;
	}
	
	public void changeRadio(float newRadio){
		this.radio=newRadio;
	}
	
	public float getDiameter(){
		float diameter;
		diameter=this.radio*2;
		return diameter;
	}
	
	public float getRadio(){
		return this.radio;
	}
	

	public float getVolume(){
		return this.volume;
	}
	
	public String getColor(){
		return this.color;
	}
	

	public boolean getOwner(){
		return this.owner;
	}
	
	public void printBall(){
		System.out.println("Diametro: "+this.getDiameter());
		System.out.println("Radio: "+this.radio);
		System.out.println("Color: "+this.color);
		System.out.println("¿Tiene dueño?: "+this.owner);
	}
}


