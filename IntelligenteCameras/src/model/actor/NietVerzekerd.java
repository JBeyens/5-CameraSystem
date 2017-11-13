package model.actor;

import model.Locatie;

public class NietVerzekerd extends TrackableDecorator{
	
	public NietVerzekerd(ITrackable trackableObject){
		super(trackableObject);
	}
	
	public String toString(){
		return trackableDecorated.toString() + " en is geseind want niet Verzekerd!";
	}

	
}
