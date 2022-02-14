package exceptionHandling;

public class ArrayIOOB {
	
	public static void main(String[] args) {
		int[] array = {10,20,30,40};
		
		try {
			array[4]=50;
			System.out.println(array[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}

}
