package edu.century.project1;
/**
 * This class outlines the Athlete object and gives information on their: 
 * name, country, sport, skill level, and number of gold medals won
 * this outline is based for the olympic athletes competeing
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public class Athlete {
private String name;
private Country country;
private Sport sport;
private int skill = 0;
private int medalCounter;

/**
 * Full parameter constructor
 * @param name - name of athlete of type String
 * @param country - country of athlete of type Country enum
 * @param sport - athlete's sport of type Sport enum
 * @param skill - athlete's skill of type Int
 */
public Athlete(String name, Country country, Sport sport, int skill, int medalCounter) {
	setName(name);
	setCountry(country);
	setSport(sport);
	setSkill(skill);
	setMedals(medalCounter);
	
}
/**
 * Default constructor when no agruments are passed 
 */
public Athlete() {
	name = "No name on file";
	sport = Sport.selectRandomSport();
	country = Country.selectRandomCountry();
	skill = 0;
	medalCounter = 0;
}

public void setName(String name) {
	this.name = name;
}
public void setCountry(Country country) {
	this.country = country;
}
public void setSport(Sport sport) {
	this.sport = sport;
}
public void setSkill(int skill) {
	this.skill = this.skill + skill;
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
public Sport getSport() {
	return sport;
}
public int getSkill() {
	return skill;
}
public int getMedals() {
	return medalCounter;
}


@Override
public String toString() {
	return "Name: " + name + " Country: " + country + " Sport: " + sport + " Skill: " + skill + " Gold medals: " + medalCounter;
	
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
             (this.sport == otherAthlete.getSport()) && 
             (this.skill == otherAthlete.getSkill()) &&
             (this.medalCounter == otherAthlete.getMedals()));
   }

}

}