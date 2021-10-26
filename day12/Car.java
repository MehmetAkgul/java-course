package day12;

//1) Constructor is for creating object from a class
//2) Every class has default constructor, default constructor are invisible
//3) When you create a constructor , Java removes the default constructor.
//4) How to create our own constructor
// -----a) Type Access Modifier make it "public" most of the times
// -----b) Type the class name
// -----c) Open-close parenthesis
// -----d) Open close curly braces
// 5) Default Constructor is like; "public Car(){}"

public class Car {

	String make; // this is Instance Variable
	String model; // this is Instance Variable
	int price; // this is Instance Variable
	int year; // this is Instance Variable

	public Car() {

		this.make = "Honda";
		this.model= "Pilot";
		this.price = 40000;
		this.year = 2021;
	}
	public Car(String make,String model,int price, int year) {

		this.make = make;
		this.model= model;
		this.price = price;
		this.year = year;
	}

	public static void main(String[] args) {

	}

}
