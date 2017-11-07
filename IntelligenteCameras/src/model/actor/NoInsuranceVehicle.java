package model.actor;

public class NoInsuranceVehicle extends Vehicle{

	public NoInsuranceVehicle(IVoertuig vehicle){
		super(vehicle.getLocatie());
	}
}
