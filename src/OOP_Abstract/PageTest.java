package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.displayLogo();
		lp.title();
		lp.url();
		lp.pageLoadTimeout();
		lp.forgotpwd();
		LoginPage.footer(); // static method called by class name

		// child object referred by parent abs class reference varaible
		// top casting
		Page p = new LoginPage();
		p.displayLogo();
		p.title();
		p.url();
		
//		LoginPage lp1 = new Page(); // NA downcasting - class cast exception
		

	}

}
