package model.actor;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import model.Camera;
import model.Locatie;
import observer.DispatchSubject;
import observer.PatrouilleObserver;

public class Dispatch extends Actor implements DispatchSubject{
	private LinkedList<Camera> cameras;
	private Set<PatrouilleObserver> patrouilleObservers;
	
	public Dispatch(Locatie locatie) {
		super(locatie);
		patrouilleObservers = new HashSet<PatrouilleObserver>();
	}
	
	
	//Parameter could be index. Need further investigation
	public void removeCamera(Camera camera){
		this.cameras.remove(camera);
	}
	
	public void addCamera(Camera camera){
		this.cameras.add(camera);
	}


	@Override
	public void doNotify() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addObserver(PatrouilleObserver observer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeObserver(PatrouilleObserver observer) {
		// TODO Auto-generated method stub
		
	}


	public void setCameras(LinkedList<Camera> cameras2) {
		// TODO Auto-generated method stub
		
	}


	public void setGeseind(LinkedList<IVoertuig> geseind) {
		// TODO Auto-generated method stub
		
	}


	public void signaleer(IVoertuig voertuig) {
		// TODO Auto-generated method stub
		
	}


	public Object getGesignaleerd() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getGeseind() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getCameras() {
		// TODO Auto-generated method stub
		return null;
	}



}
