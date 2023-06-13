package webDriver_Arch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		
	}

	@Override
	public void get(String URL) {
		System.out.println("entering url:" + URL);

	}

	@Override
	public String getTitle() {

		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on :" + element);

	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering " + value + " into " + element);

	}

	@Override
	public void close() {
		System.out.println("close browser");

	}

	@Override
	public void findElement(String element) {
		System.out.println("finding element by using :" + element);

	}

}
