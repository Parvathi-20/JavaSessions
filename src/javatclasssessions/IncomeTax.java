package javatclasssessions;

public class IncomeTax {

	public static void main(String[] args) {
		double taxpayable = calTax(1028536);
		System.out.println("taxpayable is " + taxpayable);
	}

	public void getTax(String gender, int age, int ctc) {

	}

	public static double calTax(double d) {
		double tax = 0;
		double taxableamt = 0;// except 3,00,000

		if (d > 1500000) {
			tax = (d - 1500000) * 0.3 + 150000;
			return tax;
		} else if (d > 1200000 ) {
			tax = (d - 1200000) * 0.2 + 90000;
			return tax;
		} else if (d > 900000) {
			tax = (d - 900000) * 0.15 + 45000;
			return tax;
		} else if (d > 600000 ) {
			tax = (d - 600000) * 0.1 + 15000;
			return tax;
		} else if (d > 300000) {
			tax = (d - 300000) * 0.05;
			return tax;
		} else if (d <= 300000) {
			tax = 0;
			return tax;
		}
		return tax;

	}
}
