package edu.century.project1;
import java.util.Random;
/**
 * Enumeration list of countries competing
 * @author Theodore Thorpe
 * @Version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public enum Country {
UnitedStates, 
Argentina, 
Australia,
Canada,
Cuba,
China,
Lesotho,
Serbia,
Spain,
Italy,
Japan,
Iraq,
France,
Egypt,
DominicanRepublic,
UnitedKingdom,
India,
Jamaica, 
RussianFederation, 
Ireland,
Jordan, 
KoreaSouth,
Hungry;
	/**
	 * returns a random country within the enum list
	 * @return country of type Country enum
	 */
	public static Country selectRandomCountry() {
		Random rand = new Random();
		int r = rand.nextInt(Country.values().length);
		return Country.values()[r];
	}
}