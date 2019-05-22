package chapter.three.observer;

import java.util.Observable;

public class MagazineObserver extends Observable {
	
	private String name;
	
	public MagazineObserver(String name) {
		super();
		this.name = name;
	}

	public void notifyAllObservers() {
		setChanged();
		notifyObservers(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
