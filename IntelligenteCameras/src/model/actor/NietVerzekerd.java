package model.actor;

import model.Locatie;

public class NietVerzekerd extends TrackableDecorator{
	
	public NietVerzekerd(ITrackable trackableObject){
		super(trackableObject);
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want niet Verzekerd!";
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
