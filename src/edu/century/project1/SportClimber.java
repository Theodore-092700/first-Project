package edu.century.project1;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * This class outlines the SportClimber class and inherits from the Athlete class
 * This class overwrites the get skill class to take consideration for strength
 * this outline is based for the olympic athletes competeing
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public class SportClimber extends Athlete {
	private double strength;
	
	/**
	 * full parameter constructor 
	 * @param name comes from the parent class Athlete
	 * @param country comes from the parent class Athlete
	 * @param skill comes from the parent class Athlete
	 * @param medalCounter comes from the parent class Athlete
	 * @param strength attribute for SportClimber that influences skill
	 */
	public SportClimber(String name, Country country, double skill, int medalCounter,double strength) {
		super(name, country, skill, medalCounter);
		setStrength(strength);
	}
	
	/**
	 * no argument constructor
	 */
	public SportClimber() {
		super();
		strength = 0;
	}
	
	/**
	 * validates strength is of type double and assigns the value based of random logic below
	 * @param strength of type double
	 */
	public void setStrength(double strength) {
		try {
			Random rand = new Random();
			strength = rand.nextInt(200) + 50;
			this.strength = strength;
		}catch(InputMismatchException e) {
			System.out.println("SportClimber strength is not of type double!");
		}
		
	}
	/**
	 * returns the value of strength
	 * @return strength of type double
	 */
	public double getStrength() {
		return strength;
	}
	
	@Override 
	public double getSkill() {
		return (skill + (0.5 * getStrength()));
	}
	@Override 
	public String toString() {
		return super.toString() + " Strength: " + getStrength();
	}
}
