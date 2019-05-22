package chapter.two.factory.method;

public class BookService extends AbstractService<Book> {

	private DAO<Book> dao;
	
	@Override
	public DAO<Book> getDAO() {
		if(dao == null) {
			dao = new BookDAO();
		}
		
		return dao;
	}
}
