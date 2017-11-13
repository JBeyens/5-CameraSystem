package model.actor;

import model.Locatie;

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
