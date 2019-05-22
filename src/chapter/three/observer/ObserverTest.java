package chapter.three.observer;

public class ObserverTest {

	public static void main(String[] args) {
		MagazineObserver guitarPlayer = new MagazineObserver("Guitar Player");
		MagazineObserver drummer = new MagazineObserver("Drummer");
		
		PublisherObservable publisher = new PublisherObservable();
		publisher.addObservable(guitarPlayer);
		publisher.addObservable(drummer);
		
		guitarPlayer.notifyAllObservers();
		drummer.notifyAllObservers();
	}
}
