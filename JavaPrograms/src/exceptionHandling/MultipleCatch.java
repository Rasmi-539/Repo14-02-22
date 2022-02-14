package exceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int[] arr = new int[4];
			arr[5]=20;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Outside Try ad Catch block");
	}

}
