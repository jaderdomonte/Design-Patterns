package chapter.five.exception.adapter;

public class SaveException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String name;

	public SaveException(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
