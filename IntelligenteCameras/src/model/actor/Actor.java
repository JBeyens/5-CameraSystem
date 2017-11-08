package model.actor;

import model.Locatie;

public abstract class Actor {
	private Locatie locatie;
	private int counter;

	public int getCounter() {
		return counter;
	}

	public Actor(Locatie locatie) {
		this.locatie = locatie;
		counter++;
	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}
	
	@Override
	public String toString() {
		return "nr. " + getCounter()+ " bevindt zich op " + getLocatie();
	}

}
