package edu.century.project1;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * This class outlines the Bicyclist class and inherits from the Athlete class
 * This class overwrites the get skill class to take consideration for speed 
 * this outline is based for the olympic athletes competeing
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public class Bicyclist extends Athlete {
	private int speed;
	
	/**
	 * full parameter constructor 
	 * @param name comes from the parent class Athlete
	 * @param country comes from the parent class Athlete
	 * @param skill comes from the parent class Athlete
	 * @param medalCounter comes from the parent class Athlete
	 * @param speed attribute for Bicyclist that influences skill
	 */
	public Bicyclist(String name, Country country, double skill, int medalCounter,int speed) {
		super(name, country, skill, medalCounter);
		setSpeed(speed);
	}
	/**
	 * no argument constructor
	 */
	public Bicyclist() {
		super();
		speed = 0;
	}
	/**
	 * validates speed is of type int and assigns the value based of random logic below
	 * @param speed of type int
	 */
	public void setSpeed(int speed) {
		try {
			Random rand = new Random();
			speed = rand.nextInt(50)+ 10;
			this.speed = speed;
		}catch(InputMismatchException e) {
			System.out.println("Bicyclist speed is not of type int!");
		}
	}
	/**
	 * returns value of speed
	 * @return speed of type int
	 */
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public double getSkill() {
		Random rand = new Random();
		return (skill + ((rand.nextInt(1000)+1) % getSpeed()));
	}
	@Override
	public String toString() {
		return super.toString() + " Speed: " + getSpeed();
	}
}
