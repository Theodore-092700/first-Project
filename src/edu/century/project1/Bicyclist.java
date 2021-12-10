package edu.century.project1;
import java.util.InputMismatchException;
import java.util.Random;

public class Bicyclist extends Athlete {
	private int speed;
	
	public Bicyclist(String name, Country country, double skill, int medalCounter,int speed) {
		super(name, country, skill, medalCounter);
		setSpeed(speed);
	}
	public Bicyclist() {
		super();
		speed = 0;
	}
	
	public void setSpeed(int speed) {
		try {
			Random rand = new Random();
			speed = rand.nextInt(50)+ 10;
			this.speed = speed;
		}catch(InputMismatchException e) {
			System.out.println("Bicyclist speed is not of type int!");
		}
	}
	public int getSpeed() {
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
