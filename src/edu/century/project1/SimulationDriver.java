package edu.century.project1;
import java.util.Random;

/**
 * 
 * @author Theodore Thorpe
 *
 */
public class SimulationDriver {
	public static void main(String[] args) {
		
		Sport s1 = Sport.selectRandomSport();
		Country c1 = Country.selectRandomCountry();
		Country c2 = Country.selectRandomCountry();
		Country c3 = Country.selectRandomCountry();
		Venue v = Venue.selectRandomVenue();
		
		Athlete a1 = new Athlete("Thommas Richard",c1,s1, getRandomSkillLevel(), 0);
		Athlete a2 = new Athlete("Ben Cheney",c2,s1, getRandomSkillLevel(), 0);
		Athlete a3 = new Athlete("Austin Klecker",c3,s1, getRandomSkillLevel(), 0);
		
		Athlete[] athletes = new Athlete[3];
		athletes[0] = a1;
		athletes[1] = a2;
		athletes[2] = a3;
		
		
		Event e = new Event("First Event", v, s1, athletes);

		System.out.println(e);
		System.out.println(e.compete());
		
		
		//Tests the getName in athlete class
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());
		
		//Tests the getCountry method in athlete class
		System.out.println(a1.getCountry());
		System.out.println(a2.getCountry());
		System.out.println(a3.getCountry());
		
		
		//Tests the getSport method in athlete class 
		System.out.println(a1.getSport());
		System.out.println(a2.getSport());
		System.out.println(a3.getSport());
		
		//Tests the getSkill method in athlete class
		System.out.println(a1.getSkill());
		System.out.println(a2.getSkill());
		System.out.println(a3.getSkill());
		
		
		//Tests the getMedals method in athlete class
		System.out.println(a1.getMedals());
		System.out.println(a2.getMedals());
		System.out.println(a3.getMedals());
		
		//Tests the addMedals method in the athlete class
		a1.addMedals();
		a2.addMedals();
		a3.addMedals();
		
		System.out.println(a1.getMedals());
		System.out.println(a2.getMedals());
		System.out.println(a3.getMedals());
		
		//Tests the getName method in Event class
		System.out.println(e.getName());
		
		//Tests the getSport method in Event class
		System.out.println(e.getSport());
		
		//Tests the getVenue method in Event class
		System.out.println(e.getVenue());
		
		//Tests the getAthetes method in Event class
		System.out.println(e.getAthletes());
		
		//Tests the getCompetitors method in Event class
		System.out.println(e.getCompetitors());
		
		
		//Equals method testing 
		if (a1 == a2) {
			System.out.println("a1 == a2");
		}
		if (a1.equals(a2)) {
			System.out.println("a1.equals(a2)");
		}
		if (a1 == a3) {
			System.out.println("a1 == a2");
		}
		if (a1.equals(a3)) {
			System.out.println("a1.equals(a2)");
		}
		if (a2 == a3) {
			System.out.println("a1 == a2");
		}
		if (a2.equals(a3)) {
			System.out.println("a1.equals(a2)");
		}
		
		//Copies of athletes
		Athlete a1Copy = new Athlete("Thommas Richard",c1,s1, a1.getSkill(), a1.getMedals());
		Athlete a2Copy = new Athlete("Ben Cheney",c2,s1, a2.getSkill(), a2.getMedals());
		Athlete a3Copy = new Athlete("Austin Klecker",c3,s1, a3.getSkill(), a3.getMedals());
		
		
		if (a1 == a1Copy) {
			System.out.println("a1 == a1Copy");
		}
		if (a1.equals(a1Copy)) {
			System.out.println("a1.equals(a1Copy)");
		}
		if (a1 == a2Copy) {
			System.out.println("a1 == a2Copy");
		}
		if (a1.equals(a2Copy)) {
			System.out.println("a1.equals(a2Copy)");
		}
		if (a1 == a3Copy) {
			System.out.println("a1 == a3Copy");
		}
		if (a1.equals(a3Copy)) {
			System.out.println("a1.equals(a3Copy)");
		}
		if (a2 == a1Copy) {
			System.out.println("a2 == a1Copy");
		}
		if (a2.equals(a1Copy)) {
			System.out.println("a2.equals(a1Copy)");
		}
		if (a2 == a2Copy) {
			System.out.println("a2 == a2Copy");
		}
		if (a2.equals(a2Copy)) {
			System.out.println("a2.equals(a2Copy)");
		}
		if (a2 == a3Copy) {
			System.out.println("a2 == a3Copy");
		}
		if (a2.equals(a3Copy)) {
			System.out.println("a2.equals(a3Copy)");
		}
		if (a3 == a1Copy) {
			System.out.println("a3 == a1Copy");
		}
		if (a3.equals(a1Copy)) {
			System.out.println("a3.equals(a1Copy)");
		}
		if (a3 == a2Copy) {
			System.out.println("a3 == a2Copy");
		}
		if (a3.equals(a2Copy)) {
			System.out.println("a3.equals(a2Copy)");
		}
		if (a3 == a3Copy) {
			System.out.println("a3 == a3Copy");
		}
		if (a3.equals(a3Copy)) {
			System.out.println("a3.equals(a3Copy)");
		}
		
		
		
		
	}
	public static int getRandomSkillLevel() {
		Random rand = new Random();
		int skillLevel = rand.nextInt(10)+1;
		return skillLevel;
	}
}