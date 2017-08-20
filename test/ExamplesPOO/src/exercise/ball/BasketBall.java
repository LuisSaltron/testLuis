package exercise.ball;

public class BasketBall extends Ball {
	
	private boolean bounce;
	
	
	public boolean getBounce() {
		return bounce;
	}

	public void setBounce(boolean bounce) {
		this.bounce = bounce;
	}

	public BasketBall() {
		super();
		this.bounce=false;
	}
	
	public BasketBall(float radio, float weight, boolean bounce) {
		super(radio,weight);
		this.bounce=bounce;
	}
	
}
