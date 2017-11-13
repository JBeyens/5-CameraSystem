package model;

public class ReedTeSnel extends TrackableDecorator{

	public ReedTeSnel(ITrackable iTrackable) {
		super(iTrackable);
	}

	@Override
	public String toString(){
		return super.toString() + " en reed te snel!";
	}
}
