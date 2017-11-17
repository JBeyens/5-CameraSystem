package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Concrete class for Decoratorpattern
 */

public class Gestolen extends TrackableDecorator{
	
	public Gestolen(ITrackable trackableObject){
		super(trackableObject);
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want Gestolen";
	}
}