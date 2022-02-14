package Example;

public class AllLoops {
	
	public void usingWhile() {
		int i=10;
		while(i<=15) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public void usingDoWhile() {
		int i=20;
		do {
			System.out.println(i);
			i++;
		} while(i<=25);
	} 

	public void usingFor() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		AllLoops obj = new AllLoops();
		System.out.println("Calling while loop" );
		obj.usingWhile();
		System.out.println("Calling Do While loop");
		obj.usingDoWhile();
		System.out.println("Calling For loop");
		obj.usingFor();
	}
}
