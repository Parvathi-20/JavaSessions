package OOP_Inherritance;

public class BMW extends Car{
	
//	Poly + Morphism
//	When you have method in parent class and the same method in child class
//	with same
//	with same number of parameters and in same sequence
//	with same return
	
	
	@Override
	public void start() {
		System.out.println("BMW >>>>>> Start");
	}
	
	
	public void autoParking() {
		System.out.println("BMW Auto parking");
	}
	
	@Override
	public void petrolEngine() {
		System.out.println("BMW Petrol Engine");
	}

	
	public void theftSafety() {
		System.out.println("BMW  >> Theft saety..");
	}
	
//	@override >>>>> Static methods cant  overrideen
//	Method hiding -- When you have static method in parent class 
//	the same static method in child class
	
	public static void billing() {
		System.out.println("BMW - billing");
	}
	

}
