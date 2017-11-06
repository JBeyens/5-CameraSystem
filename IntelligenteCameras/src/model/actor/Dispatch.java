package model.actor;

import java.util.LinkedList;

import model.Camera;
import model.Locatie;

public class Dispatch extends Actor{
	private LinkedList<Camera> cameras;
	
	public Dispatch(Locatie locatie) {
		super(locatie);
	}

}
