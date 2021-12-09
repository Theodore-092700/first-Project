package edu.century.project1;

import java.util.Random;
/**
 * List of sports that will be available during the competitions
 * @author Theodore Thorpe
 * @Version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue 
 */
public enum Sport {
Basketball,
BeachVollyball,
CyclingRoad,
Diving,
Judo, 
MarathonSwimming,
Skateboarding,
Tennis,
SportClimbing,
Triathlon, 
TableTennis,
Rugby,
Fencing,
Equestrian,
Football;
	/**
	 * returns a random sport for the athletes to compete in 
	 * @return sport of type Sport
	 */
	public static Sport selectRandomSport() {
		Random rand = new Random();
		int r = rand.nextInt(Sport.values().length);
		return Sport.values()[r];
	}

}
