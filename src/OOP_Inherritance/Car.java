package OOP_Inherritance;

public class Car extends Vehicle{
	
//	final
//	is used to prevent method overriding
//	 used to prevent inheritance
//	to use for constant values
	
	public final void serivce() {
		System.out.println("Car >>>> Service");
	}
	
	public void start() {
		System.out.println("Car >>>> Start");
	}
	
	public void stop() {
		System.out.println("Car >>>> Stop");
	}
	
	public void refuel() {
		System.out.println("Car >>>> refuel");
	}
	

	@Override
	public void petrolEngine() {
		System.out.println("Car Petrol engine");
	}
	
	public static void billing() {
		System.out.println("car - billing");
	}
}
