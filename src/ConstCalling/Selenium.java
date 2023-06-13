package ConstCalling;

public class Selenium implements Google{

	
	@Override
	public void search() {
		System.out.println("Selenium serach");
//		Super.count(); - cant be accessed as interface variables are static andf final
		System.out.println(Google.RESULTS_COUNT);
		
	}

}
