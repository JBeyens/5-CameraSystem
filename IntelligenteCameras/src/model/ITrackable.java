package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Interface to track down objects, extends ILocalisable in order to make
			sure they have a location
 */

public interface ITrackable extends ILocalisable{


	void setGeseind(Boolean isGeseind);
	
	Boolean getGeseind();

}
