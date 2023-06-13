package javasessions;

public class Shopping {
	// Method Overloading:
	// within the same class, if you have number of methods:
	// 1. with the same name
	// 2. with the different parameters
	// 3. with the different number of parameters
	// 4. with the different order of the parameters
	// 5. return type doesn't matter

	public void test() {
		System.out.println("test method");
	}

	public int test(double d) {
		System.out.println("test method ");
		return 100;
	}

	public void test(int i) {
		System.out.println(i);
	}

	public void test(int i, int j) {
		System.out.println(i + j);
	}

	public void test(String p) {
		System.out.println(p);
	}

	public void test(String p, int q) {
		System.out.println(p + q);
	}

	public void test(int p, String q) {
		System.out.println(p + q);
	}

	// use cases real time

	public void login() {

	}

	public void login(String unmae, String pwd) {
		System.out.println("logged in user is " + unmae );

	}

	public void login(String uname, String pwd, String role) {
		
	}
	
	//

	public void search() {
		
	}
	
	public void search(String productname) {
		
	}
	
	public void  search(String productName, int price) {
		
	}
	
	public void search(String productName, int price, String colour) {
		
	}
	
	//payment feature using upi,paypal,cc etc
	
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String cc, int cvv) {
		
	}
	
	
	public void doPayment(int cvv, String dc) {
		
	}
	
	public void doPayment(String paypal, int cvv, String pwd) {
		
	}
	
	//uber booking
	public void booking(String carType, String fromLocation, String toLocation) {
		
	}
	

	public void booking(String carType, String fromLocation, String toLocation, int passengers){
		
	}
	
	public void booking(String carTye, String fromLocation, String toLocation, int passengers, String paymentOtpion) {
		
	}
	
	
	
	public static void main(String[] args) {

		Shopping s = new Shopping();
		s.test();
		System.out.println(s.test(847.345));
		System.out.println(34);
		s.test(20, 30);
		
		s.login("abcd", "a@1");

	}

}
