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
	
	public MarathonSwimmer(String name, Country country, double skill, int medalCounter,int endurance) {
		super(name, country, skill, medalCounter);
		setEndurance(endurance);
	}
	
	public MarathonSwimmer() {
		super();
		endurance = 0;
	}
	
	public void setEndurance(int endurance) {
		try {
			Random rand = new Random();
			endurance = rand.nextInt(100);
			this.endurance = endurance;
		}catch(InputMismatchException e) {
			System.out.println("MarathonSwimmer endurance is not of type int!");
		}
	}
	
	public int getEndurance() {
		Random rand = new Random();
		endurance = rand.nextInt(100);
		return endurance;
	}
	
	@Override
	public double getSkill() {
		return (skill + (100 * endurance));
	}
	@Override
	public String toString() {
		return super.toString() + "Endurance: " + getEndurance();
	}







}
