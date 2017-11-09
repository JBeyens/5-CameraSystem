package model.actor;

import model.Locatie;

public abstract class Actor implements ILocalisable{
	// instance variables - 
	private Locatie locatie;
	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Actor(Locatie locatie) {
		this.locatie = locatie;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	@Override
	public String toString() {
		return "\n\t " + getClass().getSimpleName() + " nr. " + getCounter()+ " bevindt zich op " + getLocatie();
	}
} 

