package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioservices();
		fh.dentalservices();
		fh.chemoservices();
		fh.MedicneRD();
		fh.medicalTraining();
		fh.medicalTest();
		
		System.out.println(USMedical.min_fee);
//		System.out.println(fh.min_fee);
//		System.out.println(FortisHospital.min_fee);
		
		// TOP CASTING
		USMedical us = new FortisHospital();
		us.cardioservices();
		us.emergencyService();

		
		WHO wh = new FortisHospital();
		wh.CovidVaccine();

	}

}
