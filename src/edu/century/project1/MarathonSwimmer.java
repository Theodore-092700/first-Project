package edu.century.project1;

import java.util.InputMismatchException;
import java.util.Random;

/**
 * This class outlines the MarathonSwimmer class and inherits from the Athlete class
 * This class overwrites the get skill class to take consideration for endurance 
 * this outline is based for the olympic athletes competeing
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public class MarathonSwimmer extends Athlete {
	private int endurance;
	
	/**
	 * full parameter constructor 
	 * @param name comes from the parent class Athlete
	 * @param country comes from the parent class Athlete
	 * @param skill comes from the parent class Athlete
	 * @param medalCounter comes from the parent class Athlete
	 * @param endurance attribute for MarathonSwimmer that influences skill
	 */
	public MarathonSwimmer(String name, Country country, double skill, int medalCounter,int endurance) {
		super(name, country, skill, medalCounter);
		setEndurance(endurance);
	}
	/**
	 * no argument constructor
	 */
	public MarathonSwimmer() {
		super();
		endurance = 0;
	}
	/**
	 * validates endurance is of type int and assigns the value based of random logic below
	 * @param endurance of type int
	 */
	public void setEndurance(int endurance) {
		try {
			Random rand = new Random();
			endurance = rand.nextInt(100);
			this.endurance = endurance;
		}catch(InputMismatchException e) {
			System.out.println("MarathonSwimmer endurance is not of type int!");
		}
	}
	/**
	 * returns value of endurance
	 * @return endurance of type int
	 */
	public int getEndurance() {
		return endurance;
	}
	
	@Override
	public double getSkill() {
		return (skill + (100 * getEndurance()));
	}
	@Override
	public String toString() {
		return super.toString() + " Endurance: " + getEndurance();
	}







}
