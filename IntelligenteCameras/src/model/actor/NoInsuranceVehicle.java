package model.actor;

public class NoInsuranceVehicle extends Vehicle{

	public NoInsuranceVehicle(IVoertuig vehicle){
		super(vehicle.getLocatie());
	}
	
	@Override
	public String toString(){
		return super.toString() + " en is geseind want niet verzekerd!";
	}
}
