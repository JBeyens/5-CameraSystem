package model.actor;



public class StolenVehicle extends Voertuig{
	
	
	public StolenVehicle(ITrackable voertuig){
		super(voertuig.getLocatie());
	}

	@Override
	public String toString(){
		return super.toString() + " en is geseind want gestolen!";
	}
	

}
