package OOP_Abstract;

public abstract class Page {

	// can not create the object of class
	// but can create the constructor of abstract class
	// this constructor will be called when we crate the object of child class

	public Page() {
		System.out.println("page const...");

	}

	public Page(int i) {
		System.out.println("one param page constct .. " + i);
	}

	// 100% abstraction
	// 0% abstraction
	// partial abstraction

	public abstract void title();

	public abstract void url();

	public void pageLoadTimeout() {
		System.out.println("page time out -- 10 secs");
	}

	public final void displayLogo() {
		System.out.println("display logo");
	}

	public static void footer() {
		System.out.println("page footer");
	}

}
