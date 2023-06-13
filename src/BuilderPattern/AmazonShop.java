package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {

		Shopping shop = new Shopping();
		
		
//		sc1
		shop.login("test@gmail.com", "54dfgd")
			.search("tshirt")
			.addtoCart("tshirt")
			.doPayment("121 12 112 12 ", 123)
			.generateOrder()
			.logout();
		
		
//		sc2
		shop.login("test@gmail.com", "54dfgd")
		.search("tshirt")
		.addtoCart("tshirt")
		.logout();
		
		
//		sc3
		shop.login("test@gmail.com", "54dfgd")
		.doPayment("121 12 112 12 ", 123)
		.generateOrder()
		.logout();
		
//		sc4		
		shop.login("test@gmail.com", "54dfgd")
		.logout();
		
//		sc5		
		shop.login("test@gmail.com", "54dfgd")
		.logout()
		.login("test@gmail.com", "54dfgd");
		
	}

}
