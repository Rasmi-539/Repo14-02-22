package polymorphism;

public class OverRide1 extends OverRide {
	
	public void add(int a, int b) {
		System.out.println(a-b);
	}
	public void display() {
		System.out.println("child display");
	}
	
	public static void main(String[] args) {
		OverRide obj = new OverRide1();
		obj.add(10,20);
		//obj.display();
	}

}
