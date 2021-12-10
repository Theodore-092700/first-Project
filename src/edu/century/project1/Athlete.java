package edu.century.project1;

import java.util.InputMismatchException;

/**
 * This class outlines the abstract Athlete class and gives information on their: 
 * name, country, skill level, and number of gold medals won
 * this outline is based for the olympic athletes competeing
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public abstract class Athlete {
private String name;
private Country country;
protected double skill = 0;
private int medalCounter;

/**
 * Full parameter constructor
 * @param name - name of athlete of type String
 * @param country - country of athlete of type Country enum
 * @param skill - athlete's skill of type Int
 */
public Athlete(String name, Country country, double skill, int medalCounter) {
	setName(name);
	setCountry(country);
	setSkill(skill);
	setMedals(medalCounter);
	
}
/**
 * Default constructor when no agruments are passed 
 */
public Athlete() {
	this.name = "DEFAULT";
	this.country = Country.selectRandomCountry();
	skill = 0;
	medalCounter = 0;
}
/**
 * checks name is of type String then checks it
 * @param name of type String
 */
public void setName(String name) {
	try {
		if (name.length() > 1) {
			this.name = name;
		}
		else {
			this.name = "DEFAULT";
		}
	}catch(InputMismatchException e) {
		System.out.println("Athlete name is not of type String!");
	}
}
/**
 * checks country is of the Country type	
 * @param country of type Country
 */
public void setCountry(Country country) {
	try {
		this.country = country;
	}catch(InputMismatchException e) {
		System.out.println("Athlete country is not of type enum Country!");
	}
}
/**
 * checks to see if skill is within numerical bounds and is of type double
 * @param skill of type double
 */
public void setSkill(double skill) {
	try {
		if (skill >=0 && skill <= 1100) {
	        this.skill = skill;
	    } 
		else {
	        this.skill = 0;
	    }
	}catch (InputMismatchException e) {
		System.out.println("Skill is not of type double!");
	}
}
/**
 * checks to see if medalCounter is of type int 
 * @param medalCounter
 */
public void setMedals(int medalCounter) {
	try {
		this.medalCounter = medalCounter;
	}catch(InputMismatchException e) {
		System.out.println("MedalCounter is not of type int!");
	}
}
/**
 * method to add 1 medal when called
 */
public void addMedals() {
	++medalCounter;
}
/**
 * 
 * @return name of type String
 */
public String getName() {
	return name;
}
/**
 * 
 * @return country of type Country
 */
public Country getCountry() {
	return country;
}
/**
 * abstract method unique to all subclasses
 * @return skill of type double
 */
public abstract double getSkill();
/**
 * 
 * @return medals of type int
 */
public int getMedals() {
	return medalCounter;
}


@Override
public String toString() {
	return "Name: " + getName() + " Country: " + getCountry() + " Skill: " + getSkill() + " Gold medals: " + getMedals();
	
}

@Override
public boolean equals(Object otherObj) {
   if (otherObj == null) {
      return false;
   } 
   else if (getClass() != otherObj.getClass()) {
      return false;
   }
   else {
      Athlete otherAthlete = (Athlete)otherObj;
      return (this.name.equals(otherAthlete.getName()) &&
             (this.country == otherAthlete.getCountry()) && 
             (this.skill == otherAthlete.getSkill()) &&
             (this.medalCounter == otherAthlete.getMedals()));
   }

}

}