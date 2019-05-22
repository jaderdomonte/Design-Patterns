package chapter.two.factory.method;

import java.util.List;

public abstract class AbstractService<T> {
	
	protected abstract DAO<T> getDAO();

	public final List<T> listAll(){
		return getDAO().listAll();
	}
	
	public final T findById(Long id) {
		return getDAO().findById(id);
	}
}
