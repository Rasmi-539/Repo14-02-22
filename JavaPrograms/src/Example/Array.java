package Example;

public class Array {
	public static void main(String[] args) {
		String[] data = new String[10];
		System.out.println(data.length);
		data[2]="Rasmi";
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

}
