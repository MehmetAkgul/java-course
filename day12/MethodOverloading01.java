package day12;

public class MethodOverloading01 {

	public static void main(String[] args) {

		add(4,5);
		add(-4,5,1);

	}

	public static void add(double a, double b) {

		System.out.println("dd The sum is " + (a + b));

	}

	
	
	public static void add(double a, int b) {
		
		System.out.println("di The sum is " + (a + b));
		
	}
	
	public static void add(int a, int b) {
		
		System.out.println("ii The sum is " + (a + b));
		
	}
	
	
	public static void add(int a, int b ,int c) {
		
		System.out.println("The sum is " + (a + b+c));
		
	}
	
	
	
	
}
