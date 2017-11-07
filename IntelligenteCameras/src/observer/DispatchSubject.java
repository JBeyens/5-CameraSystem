package observer;
/*
 * Name of methods are for body only => needs change in future
 */
public interface DispatchSubject {
	public void doNotify();
	public void addObserver(PatrouilleObserver observer);
	public void removeObserver(PatrouilleObserver observer);
}
