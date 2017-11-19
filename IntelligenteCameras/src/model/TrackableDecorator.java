package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Abstract Decorator to implement pattern
 */

public abstract class TrackableDecorator implements ITrackable{
	// PRIVATE MEMBERS
	private ITrackable trackableDecorated;
	
	
	// CONSTRUCTOR
	public TrackableDecorator(ITrackable iTrackable){
		this.trackableDecorated = iTrackable;
	}
	
	
	// METHODS
	/* De methodes hieronder zorgen dat het decorated object zijn properties gaat uitlezen 
	 * uit het decorated object. Bijvoorbeeld getGeseind zal zijn data halen uit het decorated object.
	 * */
	public String toString(){
		return trackableDecorated.toString();
	}
	
	@Override
	public void setGeseind(Boolean isGeseind) {
		trackableDecorated.setGeseind(isGeseind);
	}

	@Override
	public Boolean getGeseind() {
		return trackableDecorated.getGeseind();
	}

	@Override
	public Locatie getLocatie() {
		return trackableDecorated.getLocatie();
	}
}
