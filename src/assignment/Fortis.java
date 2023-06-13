package assignment;

public class Fortis extends Hospital {
	@Override
	public void AddNewpatient(String patientName) {

		System.out.println("Fortis >> New Patient registration " + patientName);
	}

	public void getDoctorsdetails() {
		System.out.println("Doctors avaiable at Fortis ");

	}

	public void getStaffdetails() {
		System.out.println("Fortis staff details ");
	}

}
