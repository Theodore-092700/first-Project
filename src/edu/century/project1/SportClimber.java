package edu.century.project1;
import java.util.InputMismatchException;
import java.util.Random;

public class SportClimber extends Athlete {
	private double strength;
	
	public SportClimber(String name, Country country, double skill, int medalCounter,double strength) {
		super(name, country, skill, medalCounter);
		setStrength(strength);
	}
	public SportClimber() {
		super();
		strength = 0;
	}
	public void setStrength(double strength) {
		try {
			Random rand = new Random();
			strength = rand.nextInt(200) + 50;
			this.strength = strength;
		}catch(InputMismatchException e) {
			System.out.println("SportClimber strength is not of type double!");
		}
		
	}
	
	public double getStrength() {
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
