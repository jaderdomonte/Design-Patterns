package chapter.two.hook.methods;

public class SubClassA extends SuperClass {

	@Override
	protected void hookMethod() {
		System.out.println("Doing something in hook method in subclass A");
	}
}
