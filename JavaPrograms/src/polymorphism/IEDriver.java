package polymorphism;

public class IEDriver extends WebDriver {
	public void click() {
		System.out.println("Performing Click : IEDriver()");
	}
	public void sendKeys() {
		System.out.println("Typing : IEDriver()");
	}
	public void getTitle() {
		System.out.println("Getting Titile : IEDriver()");
	}

}
