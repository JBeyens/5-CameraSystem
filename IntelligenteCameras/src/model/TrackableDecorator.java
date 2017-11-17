package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Abstract Decorator to implement pattern
 */

public abstract class TrackableDecorator implements ITrackable{
	private ITrackable trackableDecorated;
	
	public TrackableDecorator(ITrackable iTrackable){
		this.trackableDecorated = iTrackable;
	}
	
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
