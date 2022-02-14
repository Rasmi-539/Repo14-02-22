package exceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		try {
			//inner try block 1
			try {
				System.out.println("Divide by zero");
				int x= 25/0;
				System.out.println(x);
			}
			//inner catch block for try block 1
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			//inner try block 2
			try {
				System.out.println("Accessing array element out of bound");
				int[] arr = new int[5];
				arr[6]=10;
			}
			//inner catch block for try block 2
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Normal Flow");
	}

}
