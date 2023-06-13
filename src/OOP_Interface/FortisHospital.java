package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

//	int min_fee = 50;
	
	@Override
	public void cardioservices() {
		System.out.println("FH - cardioservices ");

	}

	@Override
	public void neuroservices() {

		System.out.println("FH - neuroservices ");
	}

	@Override
	public void orthoservices() {
		System.out.println("FH - orthoservices ");

	}

	@Override
	public void chemoservices() {

		System.out.println("FH - chemoservices ");

	}

	@Override
	public void dentalservices() {

		System.out.println("FH - dentalservices ");
	}

	@Override
	public void entservices() {
		System.out.println("FH - entservices ");

	}
	
	public void emergencyService() {
		System.out.println("FH - emergencyService ");
	}
	
	public void CovidVaccine() {
		System.out.println("FH - CovidVaccine ");
	}
	
	public void medicalTraining() {
		System.out.println("FH - medicalTraining ");
	}
	
	public void medicalTest() {
		System.out.println("FH - medical test");
	}

}
