package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occured..");
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int i = 9 / 0;
		System.out.println("Exception occured and executed");
	}

	public static void main(String[] args) {

		ThrowsKeyword th = new ThrowsKeyword();
		th.m1();

		System.out.println("Bye..");

	}

}
