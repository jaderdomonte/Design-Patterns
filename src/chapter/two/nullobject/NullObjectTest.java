package chapter.two.nullobject;

public class NullObjectTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Account accountConcrete = bank.createAccount("123", 100);
		Account accountNull = bank.createAccount(null, 100);
		
		System.out.println("BALANCE OF CONCRETE ACCOUNT: "+accountConcrete.getBalance());
		System.out.println("BALANCE OF NULL ACCOUNT: "+accountNull.getBalance());
	}
}
