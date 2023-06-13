package assignment;

public class Max extends Hospital {

	@Override
	public void AddNewpatient(String patientName) {

		System.out.println("Max >> New Patient registration " + patientName);
	}

	public void getDoctorsdetails() {
		System.out.println("Doctors avaiable at Max ");

	}

	public void getBedAvailability() {
		System.out.println("Check for number of beds occupied");
	}

}
