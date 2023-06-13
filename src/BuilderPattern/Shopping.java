package BuilderPattern;

public class Shopping {
	
	public Shopping login() {
		System.out.println("login to app");
		return this;
	}
	
	public Shopping login(String uname, String pwd) {
		System.out.println("login to app with " + uname + pwd);
		return this;
	}
	
	public Shopping search() {
		System.out.println("search ..");
		return this;
	}
	
	public Shopping search(String name) {
		System.out.println(name + "search ..");
		return this;
	}
	
	public Shopping addtoCart(String name) {
		System.out.println("adding to cart " + name);
		return this;
	}
	
	public Shopping doPayment(String cc, int cvv) {
		System.out.println("making payment with " + cc);
		return this;
	}
	
	public Shopping doPayment(String upi) {
		System.out.println("making payment with  " + upi);
		return this;
	}
	
	
	public Shopping generateOrder() {
		System.out.println("order id is 1234");
		return this;
	}

	
	public Shopping logout() {
		System.out.println("logout ");
		return this;
	}
	
}
