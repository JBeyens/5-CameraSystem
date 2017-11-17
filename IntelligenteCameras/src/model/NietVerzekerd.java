package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Concrete class for DecoratorPattern
 */

public class NietVerzekerd extends TrackableDecorator{
	
	public NietVerzekerd(ITrackable trackableObject){
		super(trackableObject);
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want niet Verzekerd!";
	}
}
