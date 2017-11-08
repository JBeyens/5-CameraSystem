package model.actor;

public class NoInsuranceVehicle extends Voertuig{

	public NoInsuranceVehicle(ITrackable vehicle){
		super(vehicle.getLocatie());
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want niet verzekerd!";
	}
}
