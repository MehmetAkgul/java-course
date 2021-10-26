package day12;

public class VariableTypes01 {

	/*
	 * There are 3 main variables types in Java;
	 * 
	 * 1 Local Variables : Variables created in method body "age" and "sum" are
	 * local variables
	 * 
	 * Note 1 : Local Variables can be used just inside the method body which you
	 * created it in.
	 * 
	 * Note 2 : Do not use Local Variables without initializing(assigning a value)
	 * otherwise you get Compile Time Error
	 * 
	 * 2) Instance (Object) Variables : Variables created outside of all methods and
	 * inside the class without using "static" keyword
	 * 
	 * Note 1 : If you want initialize the instance variable, if you want do not
	 * initialize If you do not initialize java puts "defalut values" for the
	 * instance variables.
	 * 
	 * Default Values:
	 * 
	 * String==>null
	 * 
	 * byte-short-int-long-float*double==>0
	 * 
	 * boolean==>false
	 * 
	 * char==> Nothing ==>''
	 * 
	 * Note 2: Instance Variables are attached to every object.
	 * 
	 * 
	 * 3) Class Variables: Variables created by using "static" keyword, "id" is a
	 * class variable.
	 * 
	 * Note 1: Class(static) Variables are common for all object created from the
	 * class (like Moon)
	 * 
	 * Note 2: Every update on class(static) Variables will be visible by all
	 * objects (Like splitting Moon)
	 * Note 3: if you need a variable which all objects need to share 
	 */

	String name = "Ali Can"; // Instance Variable generally put at the top class
	boolean isOld;

	static String id;

	public static void main(String[] args) {

		int age = 13;

	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
