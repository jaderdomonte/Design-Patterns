package chapter.two.factory.method;

import java.util.Arrays;
import java.util.List;

public class BookDAO implements DAO<Book> {

	@Override
	public List<Book> listAll() {
		return Arrays.asList(new Book("Book 1"), new Book("Book 2"));
	}

	@Override
	public Book findById(Long id) {
		return listAll().get(0);
	}
}
