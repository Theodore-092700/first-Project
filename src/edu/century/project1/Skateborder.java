package edu.century.project1;
import java.util.Random;
/**
 * This class outlines the Skateborder class and inherits from the Athlete class
 * This class overwrites the get skill class to take consideration for style 
 * this outline is based for the olympic athletes competeing
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public class Skateborder extends Athlete {
	private int style;
	
	public Skateborder(String name, Country country, double skill, int medalCounter,int style) {
		super(name, country, skill, medalCounter);
		setStyle(style);
	}
	
	public void setStyle(int style) {
		Random rand = new Random();
		style = rand.nextInt(10);
		this.style = style;
	}
	public int getStyle() {
		return style;
	}
	@Override
	public double getSkill() {
		return (skill + (1*style));
	}
	
	@Override
	public String toString() {
		return super.toString() + " Style: " + getStyle();
	}
	
}
