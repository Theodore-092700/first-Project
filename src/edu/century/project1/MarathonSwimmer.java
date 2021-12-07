package edu.century.project1;

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

public MarathonSwimmer(int endurance) {
	super();
	setEndurance(endurance);
}
public void setEndurance(int endurance) {
	
	this.endurance = endurance;
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
