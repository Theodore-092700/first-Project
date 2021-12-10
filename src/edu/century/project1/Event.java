package edu.century.project1;
import java.util.Random;
import java.util.ArrayList;
/**
 * This Class outlines the Event object and provides the frame for the athletes 
 * to compete and determine the winner as well as the venue and name of the event they will be competing for!!
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor Lisa Minogue
 */
public class Event {
private String name;
Venue venue;
Sport sport;
ArrayList<Athlete>  athletes = new ArrayList<Athlete>();
int maxSkillIndex = 0;

/**
 * Full parameter constructor 
 * @param name - Event name of type String
 * @param venue - Venue name of type Venue enum
 * @param sport - Sport name of type Sport enum
 * @param athletes - array of all athletes of type Athlete[]
 */
public Event(String name, Venue venue,Sport sport,ArrayList<Athlete>  athletes) {
	setName(name);
	setVenue(venue);
	setAthlete(athletes);
	setSport(sport);

	
}
/**
 * default constructor when no arguments are passed
 */
public Event() {
	name = "Default";
	venue = Venue.selectRandomVenue();
	
	
	
}
public void setSport(Sport sport) {
	this.sport = sport;
}


/**
 * updates the name of the event
 * @param name - name of the event
 */
public void setName(String name) {
	if(name.length() > 0) {
		this.name = name;
	}
	else {
		this.name = "Default";
	}
}
/**
 * updates the venue
 * @param venue - venue of the event
 */
public void setVenue(Venue venue) {
	this.venue = venue;
}
/**
 * updates the athletes competing and makes sure there is at least one athlete competing
 * @param athletes - array of athletes
 */
public void setAthlete(ArrayList<Athlete>  athletes) {
	if (athletes.size() > 0) {
		this.athletes = athletes;
	}
	else {
		System.out.println("Competitions need at minimum One athlete to compete!!!");
	}
}

//Getters
/**
 * returns the sport being played
 * @return sport of type Sport
 */
public Sport getSport() {
	return sport;
}
/**
 * returns the name of the event
 * @return name of type String
 */
public String getName() {
	return name;
}
/**
 * returns the venue for the event
 * @return venue of type Venue enum
 */
public Venue getVenue() {
	return venue;
}
/**
 * returns the reference of the array of Athlete objects
 * @return athletes of type Athletes[]
 */
public ArrayList<Athlete>  getAthletes() {
	
	return athletes;
	
}
/**
 * returns the list of athletes competing 
 * @return competitors of type String
 */
public String  getCompetitors() {
	String competitors = "";
	for (int i = 0; i < athletes.size(); ++i) {
		competitors = competitors + athletes.get(i) + "\n";
		}
	return competitors;
	}



/**
 * random compete simulation that returns the winner of the competion
 * and adds a medal to the winner
 * @return athletes[maxSkillIndex] of type Athlete
 */
public Athlete compete() {
	System.out.println("Let the games begin!!!\nPlayers competing:");
	double maxSkill = 0;
	for (int i = 0; i < athletes.size(); ++i) {
		
		System.out.println(athletes.get(i));
		Random luckOfDraw = new Random();
		int randInt = luckOfDraw.nextInt(50)+1;
		athletes.get(i).setSkill(randInt);
		
		
		if (athletes.get(i).getSkill() > maxSkill) {
			maxSkill = athletes.get(i).getSkill();
			maxSkillIndex = i;
		}
	}
	athletes.get(maxSkillIndex).addMedals();
	System.out.println("The Winner is...");
	return athletes.get(maxSkillIndex);
	
}


@Override
public String toString() {
	return "Event: " + getName() + " Venue: " + getVenue() +" Sport:  "+ getSport() + " Competing Athletes: \n" + getCompetitors();
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
      Event otherEvent = (Event)otherObj;
      return (this.name.equals(otherEvent.getName()) &&
             (this.venue == otherEvent.getVenue()) && 
             (this.sport == otherEvent.getSport()) &&
             (this.athletes == otherEvent.getAthletes()));
   }
   
}


}
