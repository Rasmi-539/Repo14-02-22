package exceptionHandling;

public class TestThrows {
	public void divide(int num1, int num2) throws ArithmeticException{
		int result = num1/num2;
		System.out.println(result);
		//return result;
	}
	
	public static void main(String[] args) {
		TestThrows obj = new TestThrows();
		try {
			obj.divide(10, 0);
		}
		catch(Exception e) {
			System.out.println("Number can't be divisible by zero");
		}
		
		System.out.println("Rest of the code");
	}

}
