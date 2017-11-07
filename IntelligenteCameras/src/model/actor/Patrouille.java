package model.actor;

import model.Locatie;
import observer.PatrouilleObserver;

public class Patrouille extends Actor implements PatrouilleObserver{

	public Patrouille(Locatie locatie) {
		super(locatie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub
		
	}

}
