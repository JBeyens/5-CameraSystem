package model.actor;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import model.Camera;
import model.Locatie;
import observer.DispatchSubject;
import observer.PatrouilleObserver;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 07/11/2017
	@Project Intelligente Cameras
	@Doel
 */

public class Dispatch extends Actor implements DispatchSubject{
	/*
	 * Fields
	 */
	private LinkedList<Camera> cameras;
	private Set<PatrouilleObserver> patrouilleObservers;
	
	/*
	 * Constructor
	 */
	public Dispatch(Locatie locatie) {
		super(locatie);
		patrouilleObservers = new HashSet<PatrouilleObserver>();
	}
	
	
	/* (non-Javadoc)
	 * @see observer.DispatchSubject#doNotify()
	 */
	@Override
	public void doNotify() {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see observer.DispatchSubject#addObserver(observer.PatrouilleObserver)
	 */
	@Override
	public void addObserver(PatrouilleObserver observer) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see observer.DispatchSubject#removeObserver(observer.PatrouilleObserver)
	 */
	@Override
	public void removeObserver(PatrouilleObserver observer) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//Parameter could be index. Need further investigation
	public void removeCamera(Camera camera){
		this.cameras.remove(camera);
	}
	
	public void addCamera(Camera camera){
		this.cameras.add(camera);
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
