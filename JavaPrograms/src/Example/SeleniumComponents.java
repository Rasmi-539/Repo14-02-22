package Example;

public class SeleniumComponents {
	static int st= 10;
	int nonst=20;
	
	public static void seleniumIde() {
		SeleniumComponents obj1 = new SeleniumComponents();
		obj1.seleniumWebdriver();
		
		
		System.out.println("Performs Record and Playback");
		//seleniumWebdriver();
		//System.out.println(nonst);
		//seleniumWebdriver();
	}
	
	public void seleniumWebdriver() {
		System.out.println("To develop Automation Scripts");
		//System.out.println(st+","+nonst);
	}
	
	public void seleniiumGrid() {
		//SeleniumComponents obj1 = new SeleniumComponents();
		System.out.println("To execute Scripts in multiple browsers and systems");
		seleniumWebdriver();
		seleniumIde();
	}
	public static void main(String[] args) {
		SeleniumComponents obj = new SeleniumComponents();
		//obj.seleniiumIde();
		SeleniumComponents.seleniumIde();
		//SeleniumComponents.seleniumWebdriver();
		obj.seleniiumGrid();
	}

}
