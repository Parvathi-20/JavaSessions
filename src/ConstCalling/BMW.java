package ConstCalling;

public class BMW extends Car{
	
	private int min_speed = 200;
	
	public BMW() {
//		super(); //to call default constructor
		super("BMWx1",50); // to call param constrc
		System.out.println("BMW constructor..");
	}
	
	public void speedcal() {
		System.out.println(min_speed);
		int carSpeed = super.min_speed; // super to access parent calss variables
		int diff = min_speed - carSpeed;
		System.out.println(diff);
	}
	
	
	@Override
	public void display() {
		System.out.println("bmw display");
		super.display(); // to access parent calss method need not be first statement as its not constrc
	}
	

}
