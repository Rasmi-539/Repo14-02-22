package polymorphism;

public class ChromeDriver extends WebDriver {
	public void click() {
		System.out.println("Performing Click : ChromeDriver()");
	}
	public void sendKeys() {
		System.out.println("Typing : ChromeDriver()");
	}
	public void getTitle() {
		System.out.println("Getting Titile : ChromeDriver()");
	}

}
