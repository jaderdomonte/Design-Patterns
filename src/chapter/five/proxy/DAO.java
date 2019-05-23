package chapter.five.proxy;

import java.util.List;

public interface DAO<T> {
	
	List<T> listAll();
	
	T findById(Long id);
	
	T save(T entity);
	
	void remove(Long id);
	
	void update(T entity);
}
