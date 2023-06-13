package javatclasssessions;

public class CalculateCommission {

	public static void main(String[] args) {

		CalculateCommission obj = new CalculateCommission();

		obj.calComm(1900, 8);
		obj.calComm(200, 2);
		obj.calComm(502, 10);
		obj.calComm(1800, 14);
		obj.calComm(5000, 2);
		obj.calComm(900, 12);
		obj.calComm(20000, 11);
		obj.calComm(450, 25);
		obj.calComm(450, 10);
		obj.calComm(20000, 19);
		obj.calComm(1200, 25);
		obj.calComm(1200, 2);
	}


	public int calComm(int marginAmount, int margincents) {

		int comissionAmount = 0;

		boolean flag = false;


//		if (margincents > 15) {
//			if (marginAmount >= 1500) {
//				comissionAmount = 1500;
//			} else if (marginAmount >= 1000) {
//				comissionAmount = 1000;
//			} else if (marginAmount >= 500) {
//				comissionAmount = 500;
//			}
//		} else if (margincents > 10 && margincents <= 15) {
//			if (marginAmount >= 1000) {
//				comissionAmount = 1000;
//			} else {
//				comissionAmount = 500;
//			}
//		} else if (margincents >= 1 && margincents <= 10) {
//			if (marginAmount >= 500) {
//				comissionAmount = 500;
//			} else {
//				comissionAmount = 0;
//			}
//		}

		if (margincents > 15 && marginAmount >= 1500) {
			comissionAmount = 1500;

		} else if (margincents >= 10 && marginAmount >= 1000) {
			comissionAmount = 1000;

		} else if (margincents >= 1 && marginAmount >= 500) {
			comissionAmount = 500;
		}
		
	

		System.out.println(comissionAmount);
		System.out.println("**************");
		return comissionAmount;
		
		
		//Incometax slab
//		age upto 60 normal citizen

//		male > 2,50,000 - na
//		2,51 - 5 - 10%
//		5 - 10l - 20%
//		10l - 30%
		
//		female > 3,00,000 - na
//		3,00 - 5 - 10%
//		5 - 10l - 20%
//		10l - 30%
		
//		60 above - senior
//		> 5,00,000 - na
//		5 - 10l - 20%
//		10l - 30%
		
		
	}

}
