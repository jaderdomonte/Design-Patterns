package chapter.two.hook.methods;

public class HookMethodTest {

	public static void main(String[] args) {
		SuperClass subClassA = new SubClassA();
		SuperClass subClassB = new SubClassB();
		
		subClassA.mainMethod();
		subClassB.mainMethod();
	}
}
