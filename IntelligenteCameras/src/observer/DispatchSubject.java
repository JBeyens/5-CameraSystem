package observer;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Interface voor ObserverPattern Dispatch
 */

public interface DispatchSubject {
    // Cannot implement notify here, because it has to be private!
	public void addObserver(PatrouilleObserver observer);
	public void removeObserver(PatrouilleObserver observer);
}
