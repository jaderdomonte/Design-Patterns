package chapter.two.nullobject;

public class AccountNull extends Account {

	public AccountNull() {
		super(null);
	}

	public Integer getBalance() {
		return 0;
	}
}
