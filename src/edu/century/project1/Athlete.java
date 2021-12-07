package edu.century.project1;
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

public void setName(String name) {
	if (name.length() > 1) {
		this.name = name;
	}
	else {
		this.name = "DEFAULT";
		
	}
}
	
public void setCountry(Country country) {
	this.country = country;
}

public void setSkill(double skill) {
    if (skill >=0 && skill <= 10) {
        this.skill = skill;
    } else {
        this.skill = 0;
    }    
}
public void setMedals(int medalCounter) {
	this.medalCounter = medalCounter;
}
public void addMedals() {
	++medalCounter;
}

public String getName() {
	return name;
}
public Country getCountry() {
	return country;
}

public abstract double getSkill();

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