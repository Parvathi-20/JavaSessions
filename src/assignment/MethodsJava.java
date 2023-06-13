package assignment;

public class MethodsJava {

	public int  addition(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public int  substraction(int a, int b) {
		int diff = a - b;
		return diff;
	}
	
	public int  Multiplication(int a, int b) {
		int product = a * b;
		return product;
	}
	
	
	public int  divsion(int a, int b) {
		int res = a / b;
		return res;
	}
	
	
	public double  Multiplication(double a, double b) {
		double product = a * b;
		return product;
	}
	
	
	public float  circleRadius(float r) {
		float c = (float) (3.142 * r * r);
		return c;
	}
	
	public double  circleCircumference(double r) {
		double c = (double) (2 * 3.142 * r );
		return c;
	}
	
	public boolean  vote(float age) {
		boolean flag = true;
		System.out.println("Your age is " + age);
		if(age >= 18) {
			System.out.println("eligible to﻿ vote.");
		}else {
			System.out.println("You are not eligible to﻿ vote");
			flag = false;
		}
		return flag;
	}
	
	
	
	public static void main(String[] args) {
//		1.Write a program to print the addition/subtraction/division
//		/multiplication of 
//		two numbers entered by user by defining your own method
		MethodsJava m = new MethodsJava();
		int s1 = m.addition(10,20);
		System.out.println(s1);
		int s2 = m.substraction(90,40);
		System.out.println(s2);
		int s3 = m.Multiplication(5,5);
		System.out.println(s3);
		int s4 = m.divsion(20, 10);
		System.out.println(s4);
		double s5 = m.Multiplication(2.9, 8.45);
		System.out.println(s5);
		float area = m.circleRadius((float) 5.2);
		System.out.println("Area of the circle " + area);
		double circumference = m.circleCircumference(5.2);
		System.out.println("circumference of the circle " + circumference);
		boolean plus18 = m.vote((float) 18);
		System.out.println(plus18);
		
		
	}

}
