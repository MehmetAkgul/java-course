package day13;

public class CarsRunner {

	public static void main(String[] args) {

		Cars c1= new Cars();
		
		
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);

		System.out.println(c1.numOfCars);

		
		System.out.println(Cars.engine());
		


	}
}
