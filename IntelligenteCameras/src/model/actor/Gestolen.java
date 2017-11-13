package model.actor;

import model.Locatie;

public class Gestolen extends TrackableDecorator{
	
	public Gestolen(ITrackable trackableObject){
		super(trackableObject);
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want Gestolen";
	}

	public void setGeseind(Boolean isGeseind) {
		
	}

	@Override
	public Boolean getGeseind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locatie getLocatie() {
		// TODO Auto-generated method stub
		return null;
	}

}