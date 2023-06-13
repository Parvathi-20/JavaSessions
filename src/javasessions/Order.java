package javasessions;

public class Order {

	public int getOrder(String customerName, int price, int tax) {
		// business logic
		System.out.println(customerName);
		int k = price + tax;
		return k;
	}
	
	

	public int getOrder(String customerName, int price) {
		// business logic
		System.out.println(customerName);
		int k = price ;
		return k;
	}
	

	public static void main(String[] args) {
		
		Order o = new Order();
		int amount1 = o.getOrder("Deepa",1000,30);
		System.out.println(amount1);
		
		int amount2 = o.getOrder("Naveen",50);
		System.out.println(amount2);

	}
	
	

}
