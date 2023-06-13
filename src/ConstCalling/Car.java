package ConstCalling;

public class Car {

	String name;
	int price;

	int min_speed = 100;
	
	public Car() {
		System.out.println("car constructor..");
	}

	public Car(String name, int price) {
		System.out.println(name + " " + price);
		this.name = name;
		this.price = price;
	}

	public void display() {
		System.out.println("car display");
	}
}
