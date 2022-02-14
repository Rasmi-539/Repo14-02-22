package Example;

public class Dt_Var {
	
	int i=10;//instance variable
	static int j=20;//static variable
	
	public void m1() {
		int k=30;//Local variable
		System.out.println("M1 Executed");
		System.out.println("Local Variable : "+k);
	}
	
	public void m2() {
		System.out.println("M2 Executed");
		System.out.println("instance variable :"+i);
		System.out.println("static variable :"+j);
	}
	
	public static void st() {
		System.out.println("Static method executed");
	}
	
	
	public static void main(String[] args) {
		Dt_Var obj = new Dt_Var();
		//obj.i=20;
		obj.m1();
		obj.m2();
		st();//static method accessed without object
		
	}

}
