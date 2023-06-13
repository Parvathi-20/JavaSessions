package webDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("launch safari browser.....");

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
		System.out.println("click on :" + element);

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
