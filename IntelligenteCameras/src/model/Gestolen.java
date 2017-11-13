package model;

public class Gestolen extends TrackableDecorator{
	
	public Gestolen(ITrackable trackableObject){
		super(trackableObject);
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want Gestolen";
	}
}