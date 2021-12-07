package edu.century.project1;
import java.util.Random;

public class SportClimber extends Athlete {
	private int strength;
	
	public SportClimber(int strength) {
		super();
		setStrength(strength);
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public double getStrength() {
		Random rand = new Random();
		strength = rand.nextInt(200) + 50;
		return strength;
	}
	@Override 
	public double getSkill() {
		return (skill + (0.5 * getStrength()));
	}
	@Override 
	public String toString() {
		return super.toString() + "Strength: " + getStrength();
	}
}
