package model.actor;

import model.Locatie;
import model.NummerPlaat;

public class Voertuig extends Actor implements ITrackable {
	private String merk;
	private Boolean isGeseind;
	private NummerPlaat nummerPlaat;

	public Voertuig(Locatie locatie) {
		super(locatie);
		isGeseind = false;
	}

	public void setNummerPlaat(NummerPlaat nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
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
		return "\nVoertuig " + super.toString();
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
