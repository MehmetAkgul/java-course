package day9loops;
public class day9loops {
	public static void main(String[] args) {

		// 1)Type code to print unique characters on the console

//		String str = "Java";
//
//		for (int i = 0; i <= str.length() - 1; i++) {
//
//			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
//
//				System.out.print(str.charAt(i));
//			}
//		}

//		int sum  = 0;
//		for (int i = 12; i <= 14; i++) {
//			sum += i;
//		}
//		System.out.print(sum);

		// 3)Type code to find the product of the integers from 3 to 5
//		int result  = 1;
//		for (int i = 3; i <= 5; i++) {
//			result *= i;
//		}
//		System.out.print(result);

		// 4) A string is given. Create the String which is the reverse of the given
		// String without spaces, then print it on the console
		// Example: Ali Can ===> nacilA
		// String str = "Ali Can", result = "";

//		for (int i = str.length() - 1; i >= 0; i--) {
//			char c = str.charAt(i);
//			if (c != ' ') {
//				result += c;
//			}
//		}
//		System.out.print(result);

//		5)Type code to check if a given String is Palindrome.
//		String: anna ---------Reversed String: anna
//		Integer: 12321 ------ Reversed Integer: 12321

//		String str = "anna", result=""; 
//	 
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			result += str.charAt(i);
// 		 
// 		}
// 		if(str.equals(result)) {
// 			System.out.print(str + " it is a palindrome");
//		}
// 		else {
// 		 			System.out.print(str + " it is not a palindrome");
// 		}
//		 

//		6)Type code to find the sum of the digits of an integer

//		int sum = 0, number = 493568405;
//
//		for (int i = number; i > 0; i = i / 10) {
//			sum += i % 10;
//		}
//		System.out.print(sum);
//		
		

		int sum = 0, number = 493568405;

		for (int i = number; i > 0; i = i / 10) {
			sum += i % 10;
		}
		System.out.print(sum);

	}
}
