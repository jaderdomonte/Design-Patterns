package chapter.five.proxy;

import java.util.Arrays;
import java.util.List;

public class ProponentDAO implements DAO<Proponent> {

	private List<Proponent> proponentList;
	
	public ProponentDAO() {
		this.proponentList = Arrays.asList(new Proponent(1L, "Jader"), new Proponent(2L, "Bruno"), new Proponent(3L, "Cristian"));
	}

	@Override
	public List<Proponent> listAll() {
		System.out.println("List all in database");
		return proponentList;
	}

	@Override
	public Proponent findById(Long id) {
		System.out.println("Find by id in database");
		System.out.println(proponentList.get(0));
		return proponentList.get(0);
	}

	@Override
	public Proponent save(Proponent entity) {
		System.out.println("Saving in database");
		proponentList.add(entity);
		return entity;
	}

	@Override
	public void remove(Long id) {
		System.out.println("Remove of database");
	}

	@Override
	public void update(Proponent entity) {
		System.out.println("Update in database");
	}
}
