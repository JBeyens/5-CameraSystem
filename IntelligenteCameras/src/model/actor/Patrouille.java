package model.actor;

import java.util.HashSet;

import model.ITrackable;
import model.Locatie;
import observer.PatrouilleObserver;
import utilities.StringOperations;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 07/11/2017
	@Project Intelligente Cameras
	@Doel
 */
public class Patrouille extends Actor implements PatrouilleObserver{
	/** Fields **/
	private static int patrouilleCounter = 0;
	private HashSet<ITrackable> gesignalleerdTrackables;

	/** Constructor **/
	public Patrouille(Locatie locatie) {
    	// initialise instance variables
		super(locatie);
		gesignalleerdTrackables = new HashSet<ITrackable>();
		// Verhogen van teller aantal objecten uit deze klasse & opslaan van nummer van dit object
		setCounter(++patrouilleCounter); 
	}
	
	/* Beschikbaar/Bezet zetten voor interventie

	/** OBSERVER PATTERN: Method waarop het subject deze observer kan verwittigen **/
	public void ontvangGesignaleerdeTrackable(ITrackable gesignaleerdObject) {
		gesignalleerdTrackables.add(gesignaleerdObject);
	}
	
	/* Getter voor HashSet van gesignaleerde ITrackables */
	public HashSet<ITrackable> getGesignaleerd() {
		return gesignalleerdTrackables;
	}
	
	/* Method die gesignaleerde objecten weergeeft als toString van elk element met de formatering in deze utility*/
	public String getGesignaleerdString() {
		return StringOperations.collectionToString(gesignalleerdTrackables);
	}
}
