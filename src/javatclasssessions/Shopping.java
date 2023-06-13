package javatclasssessions;

public class Shopping {

	
	public void test() {
		System.out.println("test method");
		
	}
	
	public void test(int i) {
	i = 200;
		System.out.println(i);
	}
	
	
	//use cases real time
	
	//login
	public void login() {
		
	}
	
	
	public void login(String Uname, String pwd) {
		
	}
	
	public void login(String Uname, String pwd, String role) {
		
	}
	
	//search:
	public void Search() {
		
	}
	
	public void Search(String productName) {
		
	}
	
	
	public void Search(String productName, int price) {
		
	}
	
	
	public void Search(String productName, int price, String colour) {
		
	}
	
	
	//Payment:
	//10 different types of options - no of switch or if cases 
	//in single method
	//no need to remember method names for various combinations
	//
	public void doPayment(String UPI) {
		
	}
	
	public void doPayment(String CC, int cvv) {
		
	}
	
	public void doPayment(String paypal, int cvv, int otp) {
		
	}
	
	
	//uber booking:
	
	public void booking(String carType, String fromLoc, String toLoc ) {
		
	}
	
	public void booking(String carType, String fromLoc, String toLoc , int noofpassengers) {
		
	}
	
	public void booking(String carType, String fromLoc, String toLoc , String paymentOption) {
		
	}
	
	
	public static void main(String[] args) {
		
		Shopping s = new Shopping();
		s.login();

	}

}
