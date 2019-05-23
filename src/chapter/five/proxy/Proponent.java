package chapter.five.proxy;

public class Proponent extends Entity {
	
	private String name;

	public Proponent(Long id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Proponent [name=" + name + "]";
	}
}
