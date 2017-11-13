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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getGeseind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locatie getLocatie() {
		// TODO Auto-generated method stub
		return null;
	}
}
