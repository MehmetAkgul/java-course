package day12;

public class CarRunner {

	public static void main(String[] args) {


		Car c1=new Car ();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.year);
		
		
		
		Car c2=new Car ("Audi","R8",32000,2021);
		System.out.println(c2.make);
		System.out.println(c2.model);
		System.out.println(c2.price);
		System.out.println(c2.year);

	}

}
