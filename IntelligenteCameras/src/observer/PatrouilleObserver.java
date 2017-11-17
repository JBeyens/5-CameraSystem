package observer;

import model.ITrackable;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Interface voor Observerpattern Patrouille
 */

public interface PatrouilleObserver {
	public void ontvangGesignaleerdeTrackable(ITrackable trackedObject);
}
