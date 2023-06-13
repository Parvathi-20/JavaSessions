package OOP_Inherritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); // overrideen method
		//  Run time polymorphism or Dynamic polymorphism
//		Though we have start method in parent class the child class method is executed during run time.
//		here start method is overridden
		
		
		b.stop(); //Inherited
		b.refuel();//Inherited
		b.autoParking();//Individual
		b.engine(); // Inherited
		b.petrolEngine();// overrideen method from grand parent if parent has no implementation
		//overidden will happen from immediate parent
		b.theftSafety();
		System.out.println("*******************");
		
		Car c = new Car();
		c.start(); //Individual
		c.stop();//Individual
		c.refuel();//Individual
		c.engine();//Inherited
		c.petrolEngine();//Inherited
		
		
		System.out.println("top casting *******************");
		//child class object is referred by parent(any grand parent) class variable
		//top ccasting//up casting
		//ONLY OVERRIDDEN AND inherited methods
		Car c1 = new BMW();
		c1.start(); //reference type check  
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW();
		v1.petrolEngine();
		//reference type check will be failed for individual methods 
		//while top casting
		//i.e c1.theftSafety() - WRONG
		
		//Down casting
		//parent class object referred by child class reference varaible
//		BMW b1 = (BMW)new Car(); //class cast exception
		
		//resuablity of methods from parent class
		
		
	}

}
