package model.actor;

import model.Locatie;


public class StolenVehicle implements IVoertuig{
	private IVoertuig state;
	
	public StolenVehicle(IVoertuig state){
		this.state = state;
	}

	

	@Override
	public void setMerk(String merk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGeseind(Boolean isGeseind) {
		state.setGeseind(isGeseind);
		
	}

	@Override
	public Locatie getLocatie() {
		return state.getLocatie();
	}
}
