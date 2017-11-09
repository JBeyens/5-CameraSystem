package model.actor;

import model.Locatie;

public class Gestolen implements ITrackable{
	private ITrackable trackableDecorated;

	public Gestolen(ITrackable trackableObject){
		trackableDecorated = trackableObject;
	}
	
	public String toString(){
		return trackableDecorated.toString() + " en is geseind want Gestolen";
	}

	public void setGeseind(Boolean isGeseind) {
		trackableDecorated.setGeseind(isGeseind);
	}

	public Boolean getGeseind() {
		return trackableDecorated.getGeseind();
	}

	public Locatie getLocatie() {
		return trackableDecorated.getLocatie();
	}
}