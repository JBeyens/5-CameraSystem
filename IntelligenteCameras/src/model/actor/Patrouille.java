package model.actor;

import java.util.HashSet;
import java.util.Set;

import model.Locatie;
import observer.PatrouilleObserver;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 07/11/2017
	@Project Intelligente Cameras
	@Doel
 */

public class Patrouille extends Actor implements PatrouilleObserver{
	/** Fields **/
	private static int patrouilleCounter = 0;
	private Set<ITrackable> gesignalleerdTrackables;

	/** Constructor **/
	public Patrouille(Locatie locatie) {
		super(locatie);
		setCounter(++patrouilleCounter);
		gesignalleerdTrackables = new HashSet<ITrackable>();
	}

	/** Methods **/
	public void ontvangGesignaleerdeTrackable(ITrackable gesignaleerdObject) {
		gesignalleerdTrackables.add(gesignaleerdObject);
	}
}
