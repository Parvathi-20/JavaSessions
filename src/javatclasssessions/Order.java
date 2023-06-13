package javatclasssessions;

public class Order {

	
	public int getOrder(String customerName, int price, int tax) {
		System.out.println(customerName);
		int k = price + tax;
		return k;
	}
	
	public int getOrder(String customerName, int price) {
		int k = price;
		return k;
	}
	
	public static void main(String[] args) {
		Order o = new Order();
		int p = o.getOrder("abc", 300);
		System.out.println(p);
		
		int q = o.getOrder("seconds", 200, 70);
		System.out.println(q);

	}

}
