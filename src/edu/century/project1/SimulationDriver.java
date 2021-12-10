package edu.century.project1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This is the Driver class that creates and runs the objects and methods needed to compete in the Olympics 
 * This class reads from the Names.txt file to produce the names of the athletes
 * This class reads from the events.txt file to produce the different events
 * @author Theodore Thorpe
 * @version 1.0
 * CSCI 1082.70
 * Professor: Lisa Minogue
 */
public class SimulationDriver {
	private static final int EVENTNAME = 0;
	private static final int EVENTVENUE = 1;
	private static final int EVENTSPORT = 2;
	private static String ename;
	private static String evenue;
	private static String esport;
	/**
	 * reads events from the events.txt file and gives string values for the attributes for given line on txt file i
	 * @param name of type String
	 * @param venue of type String
	 * @param sport of type String
	 * @param i of type int
	 */
	public static void readEventInfo(String name, String venue,String sport, int i) {
		try {
			Scanner file = new Scanner (new FileInputStream("events.txt"));
			for (int j = 1; j <= i; j++) {
				if(file.hasNextLine()) {
					String line = file.nextLine();
					String[] eventString = line.split("%");
					name = eventString[EVENTNAME];
					ename = name;
					
					venue = eventString[EVENTVENUE];
					evenue = venue;
					sport = eventString[EVENTSPORT];
					esport = sport;
				}
				else {
					System.out.println("No more events in file!");
				}
			}
			
	}catch (FileNotFoundException e ) {
		System.out.println("File not found");
	}
	}
	/**
	 * reads names from the Names.txt file and returns a randomly selected name
	 * @return name - of type String
	 */
	public static String getRandomName() {
		
		try {
			
			ArrayList<String> names = new ArrayList<String>();
			Scanner file = new Scanner(new FileInputStream("Names.txt"));
			while (file.hasNextLine()) {
				names.add(file.nextLine());
			}
			Random rand = new Random();
			String name =  names.get(rand.nextInt(names.size()));
			file.close();
			return name;
		}catch (FileNotFoundException e ) {
			return "file not found";
		}	
		}
	
	/**
	 * method to return a skill level from 1-10 randomly
	 * @return skillLevel of type int
	 */
	public static int getRandomSkillLevel() {
		Random rand = new Random();
		int skillLevel = rand.nextInt(10)+1;
		return skillLevel;
		}
	
	
	public static void main(String[] args) {
		
		//create the individual athletes for skateborder
		Athlete a1 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a2 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a3 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a4 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a5 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a6 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a7 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete a8 = new Skateborder(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		
		//create the ArrayList for skateborder and add skateborders
		ArrayList<Athlete> skateborders = new ArrayList<Athlete>();
		skateborders.add(a1);
		skateborders.add(a2);
		skateborders.add(a3);
		skateborders.add(a4);
		skateborders.add(a5);
		skateborders.add(a6);
		skateborders.add(a7);
		skateborders.add(a8);
		
		//create the event for skateborders and run the compete method
		readEventInfo(ename,evenue,esport,1);
		Event eskate  = new Event(ename,Venue.valueOf(evenue),Sport.valueOf(esport),skateborders);
		System.out.println(eskate.toString());
		System.out.println(eskate.compete());
		
		
		
		//create the individual athletes for marathon swimmer
		Athlete b1 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b2 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b3 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b4 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b5 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b6 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b7 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete b8 = new MarathonSwimmer(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		
		//create the ArrayList for swimmers and add them too ArrayList
		ArrayList<Athlete> swimmers = new ArrayList<Athlete>();
		swimmers.add(b1);
		swimmers.add(b2);
		swimmers.add(b3);
		swimmers.add(b4);
		swimmers.add(b5);
		swimmers.add(b6);
		swimmers.add(b7);
		swimmers.add(b8);
		
		//create the event for skateborders and run the compete method
		readEventInfo(ename,evenue,esport,2);
		Event eswim  = new Event(ename,Venue.valueOf(evenue),Sport.valueOf(esport),swimmers);
		System.out.println("\n" +eswim.toString());
		System.out.println(eswim.compete());
		
		
		//create the individual athletes for sport climber
		Athlete c1 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c2 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c3 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c4 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c5 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c6 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c7 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete c8 = new SportClimber(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		
		//create the ArrayList for climbers and add them to ArrayList
		ArrayList<Athlete> climbers = new ArrayList<Athlete>();
		climbers.add(c1);
		climbers.add(c2);
		climbers.add(c3);
		climbers.add(c4);
		climbers.add(c5);
		climbers.add(c6);
		climbers.add(c7);
		climbers.add(c8);
		
		
		//create the event for climbers and run the compete method
		readEventInfo(ename,evenue,esport,3);
		Event eclimb  = new Event(ename,Venue.valueOf(evenue),Sport.valueOf(esport),climbers);
		System.out.println("\n" +eclimb.toString());
		System.out.println(eclimb.compete());
		
		
		//create the individual athletes for bicyclist
		Athlete d1 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d2 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d3 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d4 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d5 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d6 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d7 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		Athlete d8 = new Bicyclist(getRandomName(),Country.selectRandomCountry(),getRandomSkillLevel(),0,0);
		
		//create the ArrayList for bikers and add them to ArrayList
		ArrayList<Athlete> bikers = new ArrayList<Athlete>();
		bikers.add(d1);
		bikers.add(d2);
		bikers.add(d3);
		bikers.add(d4);
		bikers.add(d5);
		bikers.add(d6);
		bikers.add(d7);
		bikers.add(d8);
		
		//create the event for bikers and run the compete method
		readEventInfo(ename,evenue,esport,4);
		Event ebike  = new Event(ename,Venue.valueOf(evenue),Sport.valueOf(esport),bikers);
		System.out.println("\n" +ebike.toString());
		System.out.println(ebike.compete());
		
		
		
		
		
		
		
	
	}
}