package model.actor;

import java.util.LinkedList;

import model.Camera;
import model.Locatie;

public class Dispatch extends Actor{
	private LinkedList<Camera> cameras;
	
	public Dispatch(Locatie locatie) {
		super(locatie);
	}
	
	
	//Parameter could be index. Need further investigation
	public void removeCamera(Camera camera){
		this.cameras.remove(camera);
	}
	
	public void addCamera(Camera camera){
		this.cameras.add(camera);
	}

}
