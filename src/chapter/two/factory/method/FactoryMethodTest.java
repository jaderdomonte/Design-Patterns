package chapter.two.factory.method;

public class FactoryMethodTest {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		
		System.out.println(bookService.listAll());
		System.out.println(bookService.findById(0L));
	}
}
