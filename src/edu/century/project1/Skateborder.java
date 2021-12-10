package edu.century.project1;
import java.util.InputMismatchException;
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
	/**
	 * full parameter constructor 
	 * @param name comes from the parent class Athlete
	 * @param country comes from the parent class Athlete
	 * @param skill comes from the parent class Athlete
	 * @param medalCounter comes from the parent class Athlete
	 * @param style attribute for the skateborder that influences skill
	 */
	public Skateborder(String name, Country country, double skill, int medalCounter,int style) {
		super(name, country, skill, medalCounter);
		setStyle(style);
	}
	/**
	 * default constructor 
	 * no arguments are passed
	 */
	public Skateborder() {
		super();
		style = 0;
	}
	/**
	 * validates style is of type in and sets the style attribute randomly
	 * @param style of type int
	 */
	public void setStyle(int style) {
		try {
			Random rand = new Random();
			style = rand.nextInt(10);
			this.style = style;
		}catch(InputMismatchException e) {
			System.out.println("style is not of type int!");
		}
	}
	/**
	 * retuns the value of style
	 * @return style of type int
	 */
	public int getStyle() {
		return style;
	}
	
	@Override
	public double getSkill() {
		return (skill + (1*getStyle()));
	}
	
	@Override
	public String toString() {
		return super.toString() + " Style: " + getStyle();
	}
	
}
