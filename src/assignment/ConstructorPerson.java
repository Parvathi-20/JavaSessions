package assignment;

public class ConstructorPerson {

	public String name;
	public int age;
	public char gender ;
	public double height;
	
	ConstructorPerson(){
		System.out.println("default constructor is getting called..");
	}
	
	public ConstructorPerson(String name,int age, char gender, double height  ) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		

		ConstructorPerson cp = new ConstructorPerson("abcd", 123, 'm', 452.36);
		System.out.println(cp.getName());
		cp.setName("naveen");
		System.out.println(cp.getName());

		
		ConstructorPerson person = new ConstructorPerson();
		
		
	}

}
