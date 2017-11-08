package model.actor;

public class NietVerzekerd extends Voertuig implements ITrackable{

	public NietVerzekerd(ITrackable trackableObject){
		super(trackableObject.getLocatie());
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want niet verzekerd!";
	}
}
