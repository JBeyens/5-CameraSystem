package model.actor;

import model.Locatie;
import model.NummerPlaat;

public class Voertuig extends Actor implements ITrackable {
	private static int voertuigCounter = 0;
	private String merk;
	private Boolean isGeseind;
	private NummerPlaat nummerPlaat;

	public Voertuig(Locatie locatie) {
		super(locatie);
		setCounter(++voertuigCounter);
		isGeseind = false;
	}

	public NummerPlaat getNummerPlaat() {
		return nummerPlaat;
	}

	public void setNummerPlaat(NummerPlaat nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
	}
	
	public String getMerk() {
		return merk;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}

	@Override
	public void setGeseind(Boolean isGeseind) {
		this.isGeseind = isGeseind;
	}
	
	@Override
	public String toString(){
		return super.toString() + " met nummerplaat " + getNummerPlaat() + ", en is van het merk " + getMerk();
	}
	
	@Override
	public Locatie getLocatie(){
		return super.getLocatie();
	}

	@Override
	public Boolean getGeseind() {
		return isGeseind;
	}

	@Override
	public void setLocatie(Locatie locatie) {
		// TODO Auto-generated method stub
		
	}

}
