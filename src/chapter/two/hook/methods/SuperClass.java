package chapter.two.hook.methods;

public abstract class SuperClass {

	public final void mainMethod() {
		System.out.println("Doing something in main method...");
		hookMethod();
	}

	protected abstract void hookMethod();
}
