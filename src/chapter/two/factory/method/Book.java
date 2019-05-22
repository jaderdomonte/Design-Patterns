package chapter.two.factory.method;

public class Book {

	private String name;

	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
}
