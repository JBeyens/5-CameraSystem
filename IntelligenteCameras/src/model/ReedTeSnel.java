package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Concrete class for DecoratorPattern
 */

public class ReedTeSnel extends TrackableDecorator{

	public ReedTeSnel(ITrackable iTrackable) {
		super(iTrackable);
	}
	
	// Additional information on the toString information from the base class
	@Override
	public String toString(){
		return super.toString() + " en reed te snel!";
	}
}
