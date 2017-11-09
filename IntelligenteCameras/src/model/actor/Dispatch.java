package model.actor;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

import model.Locatie;
import observer.DispatchSubject;
import observer.PatrouilleObserver;
import utilities.StringOperations;


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
	private LinkedList<ITrackable> geseindeTrackables = new LinkedList<ITrackable>();
	private Set<ITrackable> gesignaleerdeTrackables = new HashSet<ITrackable>();
	private LinkedList<PatrouilleObserver> patrouilleObservers = new LinkedList<PatrouilleObserver>();
	
	/*
	 * Constructor
	 */
	public Dispatch(Locatie locatie) {
		super(locatie);
		setCounter(++dispatchCounter); // Houdt # Dispatches er gemaakt zijn & geeft dit aan de objecten
	}
	
	/* Signaleert een geseind voertuig door de observers te verwittigen en deze zelf ook bij te houden */
	public void signaleer(ITrackable voertuig) {
		if (!voertuig.getGeseind()) // Niet geseind => Geen actie ondernemen
			return; 
		doNotify(voertuig); // Verwittig patrouilles
		gesignaleerdeTrackables.add(voertuig);
	}

	
	/* OBSERVER PATTERN - Notify
	 * Private method waarin de observers op de hoogte gebracht worden van een gesignaleerd voertuig
	 */
	private void doNotify(ITrackable voertuig) {
		ListIterator<PatrouilleObserver> observer = patrouilleObservers.listIterator();
		while(observer.hasNext()){
			PatrouilleObserver o = observer.next();
			o.ontvangGesignaleerdeTrackable(voertuig);
		}
			
	}

	/* OBSERVER PATTERN - AddObserver & RemoveObserver
	 * Public methods voor een observer om zich in of uit te schrijven
	 */
	@Override
	public void addObserver(PatrouilleObserver observer) {
		patrouilleObservers.add(observer);	
	}
	@Override
	public void removeObserver(PatrouilleObserver observer) {
		patrouilleObservers.remove(observer);
	}
	
	
	/* Methods om object toe te voegen of te verwijderen uit lijsten van dit object */
	public void removeCamera(Camera camera){
		this.cameras.remove(camera);
	}	
	public void addCamera(Camera camera){
		this.cameras.add(camera);
	}

	/* Property setters */
	public void setCameras(LinkedList<Camera> cameras) {
		this.cameras = cameras;
	}
	public void setGeseind(LinkedList<ITrackable> geseind) {
		this.geseindeTrackables = geseind;
	}
	

	/* Method die cameras weergeeft als toString van elk element met de formatering in deze utility*/
	public String getCameras() {
		return StringOperations.collectionToString(cameras);
	}
	/* Method die geseinde objecten weergeeft als toString van elk element met de formatering in deze utility*/
	public String getGeseind() {
		return StringOperations.collectionToString(geseindeTrackables);
	}
	/* Method die gesignaleerde objecten weergeeft als toString van elk element met de formatering in deze utility*/
	public String getGesignaleerd() {
		return StringOperations.collectionToString(gesignaleerdeTrackables);
	}
}
