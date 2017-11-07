package model.actor;

import model.Locatie;
import model.NummerPlaat;

public class Voertuig extends Actor implements IVoertuig {
	private String merk;
	private Boolean isGeseind;
	private NummerPlaat nummerPlaat;

	public Voertuig(Locatie locatie) {
		super(locatie);
		isGeseind = false;
	}

	
	@Override
	public void setMerk(String merk) {
		this.merk = merk;
	}


	
	public void setNummerPlaat(NummerPlaat nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
	}


	@Override
	public void setGeseind(Boolean isGeseind) {
		this.isGeseind = isGeseind;
	}

}
