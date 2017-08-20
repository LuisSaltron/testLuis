package exercise.ball;

public class Ball {
	protected float radio;
	protected float weight;
	protected float diameter;
	
	public Ball() {
		this.radio=10.5f;
		this.weight=8;
		this.diameter=21;
	}
	
	public Ball(float radio, float weight) {
		this.radio=radio;
		this.weight=weight;
	}
	
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getRadio() {
		return radio;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public float getDiameter() {
		this.diameter=this.radio*2;
		return this.diameter;
	}
}
