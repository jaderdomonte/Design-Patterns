package chapter.two.factory.method;

import java.util.List;

public interface DAO<T> {

	public List<T> listAll();
	
	public T findById(Long id);
}
