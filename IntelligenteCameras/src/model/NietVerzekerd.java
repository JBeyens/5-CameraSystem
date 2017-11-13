package model;

public class NietVerzekerd extends TrackableDecorator{
	
	public NietVerzekerd(ITrackable trackableObject){
		super(trackableObject);
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want niet Verzekerd!";
	}
}
