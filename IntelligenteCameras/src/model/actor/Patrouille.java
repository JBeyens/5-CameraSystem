package model.actor;

import model.Locatie;
import observer.PatrouilleObserver;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 07/11/2017
	@Project Intelligente Cameras
	@Doel
 */

public class Patrouille extends Actor implements PatrouilleObserver{
	/**
	 * Fields
	 **/
	private static int patrouilleCounter = 0;

	/*
	 * Constructor
	 */
	public Patrouille(Locatie locatie) {
		super(locatie);
		setCounter(++patrouilleCounter);
	}

	
	/* (non-Javadoc)
	 * @see observer.PatrouilleObserver#doUpdate()
	 */
	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub
		
	}
}
