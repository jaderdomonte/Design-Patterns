package chapter.five.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheDAO<T> implements DAO<T> {
	
	private DAO<T> dao;
	private Map<Long, T> map;
	
	public CacheDAO(DAO<T> dao) {
		this.dao = dao;
		map = new HashMap<Long, T>();
	}

	public List<T> listAll() {
		return dao.listAll();
	}

	public T findById(Long id) {
		if(map.containsKey(id)) {
			System.out.println("Returned by cache.");
			System.out.println(map.get(id));
			return map.get(id);
		}
		
		T entity = dao.findById(id);
		cacheEntity(id, entity);
		
		return entity;
	}

	private void cacheEntity(Long id, T entity) {
		map.put(id, entity);
	}

	public T save(T entity) {
		return dao.save(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
		map.remove(id);
	}

	public void update(T entity) {
		dao.update(entity);
	}
}
