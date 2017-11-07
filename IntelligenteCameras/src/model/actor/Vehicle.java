package model.actor;

import model.Locatie;
import model.NummerPlaat;

public class Vehicle extends Actor implements IVoertuig {
	private String merk;
	private Boolean isGeseind;
	private NummerPlaat nummerPlaat;

	public Vehicle(Locatie locatie) {
		super(locatie);
		isGeseind = false;
	}

	public void setNummerPlaat(NummerPlaat nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
	}
	
	@Override
	public void setMerk(String merk) {
		this.merk = merk;
	}

	@Override
	public void setGeseind(Boolean isGeseind) {
		this.isGeseind = isGeseind;
	}

}
