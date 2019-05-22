package chapter.two.nullobject;

public class Bank {
	
	public Account createAccount(String clienteId, Integer balance) {
		if(clienteId == null) {
			return new AccountNull();
		}
		
		return new Account(balance);
	}
}
