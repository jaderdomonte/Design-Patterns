package chapter.two.hook.methods;

public class SubClassB extends SuperClass {

	@Override
	protected void hookMethod() {
		System.out.println("Doing something in hook method in subclass B");
	}
}
