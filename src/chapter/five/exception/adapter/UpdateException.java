package chapter.five.exception.adapter;

public class UpdateException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String name;

	public UpdateException(String name) {
		this.name = name;
	}
	
	public UpdateException(String name, Exception e) {
		super(e);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
