package exceptionHandling;

public class TestThrow {
	public void testNum(int num) {
		if(num<1) {
			throw new ArithmeticException("Negative number, can't calculate the square");
		}
		else {
			System.out.println("Square of Number : "+(num*num));
		}
	}
	
	public static void main(String[] args) {
		TestThrow obj = new TestThrow();
		obj.testNum(-12);
	}

}
