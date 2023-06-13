package javasessions;

public class Car {
	
	
	//Employee class
	//10 vars
	//print default values
	//3 objects
	//2 vars -- static
	
	//declaring class variables:
	
	String name;
	String colour;
	int price;
	
	static  final int wheels = 4;
	
//	static is the common prop for all the ojects
//	but object will not hold the static property
//	static var will be stored in cma
//	and it will create only one copy for all the objects
	
	
	
	
	public static void main(String[] args) {

		final int i = 10;//local var
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.colour = "white";
		c1.price = 80;
		
		//how to access static var- Using class name;
		
		System.out.println(c1.name + " " + c1.colour + " " + c1.price);
 
		
		//not a right way of calling static var using ref name
//		System.out.println(c1.wheels);
//		System.out.println(wheels);
//		System.out.println(c1.name);
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.colour = "Red";
		c2.price = 2735;
		
		System.out.println(c2.name + " " + c2.colour + " " + c2.price);
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.colour = "Black";
		c3.price = 20;

		System.out.println(c3.name + " " + c3.colour + " " + c3.price + " " + Car.wheels);
		

		
		
		
		

		
		
		
		
		
	}

}
