package chapter.five.exception.adapter;

public class Dao {

	public void save() {
		throw new SaveException("Save Exception");
	}
	
	public void update() {
		try {
			save();
		} catch (SaveException e) {
			throw new UpdateException("Update Exception", e);
//			throw new AssertionError(e);
		}
	}
}
