package OOP_Interface;

public interface USMedical extends WHO{
	
	//interface varaibales are static and final in nature by default
	int min_fee = 10;
	
	public void cardioservices();
	
	public void neuroservices();
	
	public void orthoservices();
	
	public void emergencyService();
	
	//after jdk 1.8
	//1. we have static method with method body
	public static void billing() {
		System.out.println("US medical billing");
		
	}
	
	//2. default method with method body
	default void medicalTest() {
		System.out.println("US medical test");
	}
	
	
	
	
	
}
