package day13;

public class Cars {

	
	
	public String make;
	public String model;
	public int price;
	public int year;
	public int vin;
	public static int numOfCars;
	
	
	
	public void drive() { //instance method
		System.out.println("I drive the car");
	}
	
	
	public static String engine() {//static method
		
return "The car has engine";		
		
		
	}

}
