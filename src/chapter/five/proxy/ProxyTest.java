package chapter.five.proxy;

import java.util.List;

public class ProxyTest {
	
	private static final Long UM = 1L;
	private static final Long DOIS = 2L;

	public static void main(String[] args) {
		DAO<Proponent> proponentDAO = new ProponentDAO();
		CacheDAO<Proponent> cacheDAO = new CacheDAO<Proponent>(proponentDAO);
		
		List<Proponent> proponents = cacheDAO.listAll();
		System.out.println(proponents);
		
		Proponent first = cacheDAO.findById(UM);
		Proponent second = cacheDAO.findById(DOIS);
		cacheDAO.findById(UM);
		cacheDAO.findById(DOIS);
		cacheDAO.remove(UM);
		cacheDAO.findById(UM);
		cacheDAO.findById(UM);
	}
}
