package observer;

/*
 * Name of methods are for body only => needs change in future
 */
public interface DispatchSubject {
    // Cannot implement notify here, because it has to be private!
	public void addObserver(PatrouilleObserver observer);
	public void removeObserver(PatrouilleObserver observer);
}
