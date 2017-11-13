package model.actor;

public abstract class TrackableDecorator implements ITrackable{
	private ITrackable trackableDecorated;
	
	public TrackableDecorator(ITrackable iTrackable){
		this.trackableDecorated = iTrackable;
	}
	
	public String toString(){
		return trackableDecorated.toString();
	}
}
