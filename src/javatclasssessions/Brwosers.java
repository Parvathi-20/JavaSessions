package javatclasssessions;

public class Brwosers {

	String name;
	static String hq = "Blore";
	
	public int getBrowserVersion() {
		System.out.println("get Browser version");
		return 100;
	}
	
	public static String getBrowserType() {
		System.out.println("get Browser Type");
		return "Mozilla";
	}
	
	
	public static void main(String[] args) {

		Brwosers b = new Brwosers();
	
		System.out.println(b.name);
		System.out.println(hq);//directly
		System.out.println(Brwosers.hq); // with class name
		
		b.getBrowserVersion();
		getBrowserType();
		Brwosers.getBrowserType();
		
		b.name = "test";
//		b.hq = "Pune"; // warning
//		b.getBrowserType(); // warning
		
		

	}

}
