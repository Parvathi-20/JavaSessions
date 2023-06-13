package javasessions;

public class StaticMethodOverloading {

	public static void login() {
		int[] i;
	}
	
	public static void login(int i) {
		
	}
	
	public static void login(int i , int j) {
		
	}
	
	
	
	
	public static void main(String naveen[]) {
		System.out.println("main method");
		
//		StaticMethodOverloading.main(10);
//		StaticMethodOverloading.main(10,20);
	
		
	}

	public void main(int a , double b) {
		System.out.println("main method " + a + b);
	}
	
	public void main(int a) {
		System.out.println("main method " + a);
	}
	
	public void main(int a[]) {
		System.out.println("main method " + a);
	}
	
	public void main(String a[], int b) {
		System.out.println("main method " + a);
	}
	
	public static void main() {
		
	}
	
	
	
}
