package chapter.five.exception.adapter;

public class ExceptionTest {

	public static void main(String[] args) {
		Dao dao = new Dao();
		dao.save();
		dao.update();
	}

}
