package model.actor;

import model.Locatie;

public class NietVerzekerd implements ITrackable{
	private ITrackable trackableDecorated;

	public NietVerzekerd(ITrackable trackableObject){
		trackableDecorated = trackableObject;
	}
	
	public String toString(){
		return trackableDecorated.toString() + " en is geseind want niet Verzekerd!";
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
