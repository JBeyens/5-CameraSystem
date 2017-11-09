package model.actor;

import model.Locatie;
import model.NummerPlaat;

public class Voertuig extends Actor implements ITrackable {
	/**
	 * Fields
	 **/
	private static int voertuigCounter = 0;
	private String merk;
	private NummerPlaat nummerPlaat;

	/**
	 * Constructor
	 **/
	public Voertuig(Locatie locatie) {
		super(locatie);
		setCounter(++voertuigCounter);
	}

	/**
	 * Methods
	 **/
	/* Getter & Setter voor nummerplaat */
	public NummerPlaat getNummerPlaat() {
		return nummerPlaat;	}
	public void setNummerPlaat(NummerPlaat nummerPlaat) {
		this.nummerPlaat = nummerPlaat;	}

	/* Getter & Setter voor merk */
	public String getMerk() {
		return merk; }	
	public void setMerk(String merk) {
		this.merk = merk; }

	/* Getter & Setter voor geseind, wat op de nummerplaat uitgevoerd wordt */
	public Boolean getGeseind() {
		return nummerPlaat.getGeseind(); }
	public void setGeseind(Boolean isGeseind) {
		nummerPlaat.setGeseind(isGeseind); }
	
	/* ToString methode, uitbreiding op deze van base class */
	@Override
	public String toString(){
		return super.toString() + " met nummerplaat " + getNummerPlaat() + ", en is van het merk " + getMerk();
	}
}
