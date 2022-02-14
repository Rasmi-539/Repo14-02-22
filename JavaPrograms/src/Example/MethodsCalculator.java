package Example;

public class MethodsCalculator {
	
	public int add(int num1,int num2) {
		return num1+num2 ;
	}
	public int subtract(int num1,int num2) {
		return num1-num2 ;
	}
	public int multiply(int num1,int num2) {
		return num1*num2 ;
	}
	public int divide(int num1,int num2) {
		return num1/num2 ;
	}
	
	public static void main(String[] args) {
		MethodsCalculator cal = new MethodsCalculator();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(10, 20));
		System.out.println(cal.multiply(10, 20));
		System.out.println(cal.divide(10, 20));
	}

}
