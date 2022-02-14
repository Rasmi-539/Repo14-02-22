package exceptionHandling;

public class Example3 {
	
	public static void main(String[] args) {
		
		try {
			int x = 10/0;	//exception occurs
			System.out.println(x);
		}
		catch(Exception e) {	//handle by catch
			int y = 20/0;		//exception occurs in catch & handled by itself
			System.out.println(y);
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}
