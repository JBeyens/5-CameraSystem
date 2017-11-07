package model.actor;



public class StolenVehicle extends Vehicle{
	
	
	public StolenVehicle(ITrackable vehicle){
		super(vehicle.getLocatie());
	}

	@Override
	public String toString(){
		return super.toString() + " en is geseind want gestolen!";
	}
	

}
