package selfTest;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList observers = new ArrayList();
	
	public abstract int getNumber();
	public abstract void execute();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Iterator it=observers.iterator();it.hasNext();) {
			Observer observer=(Observer)it.next();
			observer.update(this);
		}
	}
}
