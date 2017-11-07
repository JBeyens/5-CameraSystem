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

	/*
	 * Constructor
	 */
	public Patrouille(Locatie locatie) {
		super(locatie);
	}

	
	/* (non-Javadoc)
	 * @see observer.PatrouilleObserver#doUpdate()
	 */
	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString(){
		return "\nPatrouille " + super.toString();
	}

}
