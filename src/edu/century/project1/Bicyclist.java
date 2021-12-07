package edu.century.project1;
import java.util.Random;
public class Bicyclist extends Athlete {
	private int speed;
	public Bicyclist(int speed) {
		super();
		setSpeed(speed);
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		Random rand = new Random();
		speed = rand.nextInt(50)+ 10;
		return speed;
	}
	@Override
	public double getSkill() {
		Random rand = new Random();
		return (skill + ((rand.nextInt(1000)+1) % speed));
	}
	@Override
	public String toString() {
		return super.toString() + " Speed: " + getSpeed();
	}
}
