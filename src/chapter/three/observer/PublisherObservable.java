package chapter.three.observer;

import java.util.Observable;
import java.util.Observer;

public class PublisherObservable implements Observer {

	public void addObservable(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object observer) {
		System.out.println("Notifying observer: "+((MagazineObserver) observer).getName());
	}
}
