package model.actor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

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
	private static int dispatchCounter = 0; // Houdt de nummering van de objecten bij
	private LinkedList<Camera> cameras;
	private ITrackable gesignaleerdeTrackable;
	private LinkedList<ITrackable> geseindeTrackables;
	private Set<PatrouilleObserver> patrouilleObservers;
	
	/*
	 * Constructor
	 */
	public Dispatch(Locatie locatie) {
		super(locatie);
		setCounter(++dispatchCounter); // Houdt # Dispatches er gemaakt zijn & geeft dit aan de objecten
		patrouilleObservers = new HashSet<PatrouilleObserver>(); // Patrouilles
		geseindeTrackables = new LinkedList<ITrackable>(); // Geseinde voertuigen
	}
	
	public void signaleer(ITrackable voertuig) {
		if (!voertuig.getGeseind()) // Niet geseind => Geen actie ondernemen
			return;
		doNotify(voertuig); // Verwittig patrouilles
	}

	public ITrackable getGesignaleerd() {
		return gesignaleerdeTrackable;
	}

	
	/* OBSERVER PATTERN
	 * Private method waarin de observers op de hoogte gebracht worden van een gesignaleerd voertuig
	 */
	private void doNotify(ITrackable voertuig) {
		Iterator<PatrouilleObserver> list = patrouilleObservers.iterator();
		while (list.hasNext()) {
			list.next().ontvangGesignaleerdeTrackable(gesignaleerdeTrackable);
		}
	}

	/* (non-Javadoc) OBSERVER PATTERN
	 * @see observer.DispatchSubject#addObserver(observer.PatrouilleObserver)
	 */
	@Override
	public void addObserver(PatrouilleObserver observer) {
		patrouilleObservers.add(observer);	
	}

	/* (non-Javadoc) OBSERVER PATTERN
	 * @see observer.DispatchSubject#removeObserver(observer.PatrouilleObserver)
	 */
	@Override
	public void removeObserver(PatrouilleObserver observer) {
		patrouilleObservers.remove(observer);
	}
	
	
	//Parameter could be index. Need further investigation
	public void removeCamera(Camera camera){
		this.cameras.remove(camera);
	}
	
	public void addCamera(Camera camera){
		this.cameras.add(camera);
	}

	public void setCameras(LinkedList<Camera> cameras) {
		this.cameras = cameras;
	}

	public void setGeseind(LinkedList<ITrackable> geseind) {
		this.geseindeTrackables = geseind;
	}

	public String getGeseind() {
		String allGeSeind = "";
		for (ITrackable iVoertuig : geseindeTrackables) {
			allGeSeind += iVoertuig.toString();
		}

		return allGeSeind;
	}

	public String getCameras() {
		String allCameras = "";
		for (Camera camera : cameras) {
			allCameras += camera.toString();
		}
		return allCameras;
	}
}
