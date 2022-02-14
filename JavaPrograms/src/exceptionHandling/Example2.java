package exceptionHandling;

public class Example2 {
	public static void main(String[] args) {
		
		int a=50;
		int b=0;
		int data;
		
		try {
			data = a/b;
			System.out.println(data);
		}
		catch(Exception e){
			//resolving the exception in catch block
			System.out.println(a/(b+2));
			
		}
	}

}
