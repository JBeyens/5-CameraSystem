package model.actor;

import model.Locatie;

public class Gestolen extends TrackableDecorator{
	
	public Gestolen(ITrackable trackableObject){
		super(trackableObject);
	}
	
	public String toString(){
		return trackableDecorated.toString() + " en is geseind want Gestolen";
	}

}