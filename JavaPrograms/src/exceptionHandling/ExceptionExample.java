package exceptionHandling;

public class ExceptionExample {
	public static void main(String[] args) {
		
		try { 
			
		  double x = 12/0; 
		  
		  System.out.println(x);
		  
		  } 
		  
		catch(ArithmeticException e) { 
			
		  //System.out.println("Exception occurs: " + e);
			
			  
		  	//displaying the custom message
			
			  System.out.println("Can't divided by zero"); }
			 
		  
		  finally { 
			  System.out.println("Rest of code........"); 
		}
		 		
		
	}

}
