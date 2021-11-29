package edu.century.project1;

import java.util.Random;
/**
 * List of venues for the athletes to compete in 
 * @author Theodore Thorpe
 * @Version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public enum Venue {
MetropolitanGymnasium,
YoyogiNationalStadium,
NipponBudokan,
InternationalForum,
KokugikanArena,
MusashinoForestSportPlaza,
EquestrianPark,
TokyoStadium,
MusashinonomoriPark,
AriakeArena,
AriakeGymnasticsCentre,
AriakeUrbanSportsPark,
OdaibaMarinePark,
TokyoAquaticsCentre;

	
	/**
	 * returns a random venue from the list of enums for the athletes to compete in 
	 * @return venue of type Venue enum
	 */
	public static Venue selectRandomVenue() {
		Random rand = new Random();
		int r = rand.nextInt(Venue.values().length);
		return Venue.values()[r];
	}

}
