package day08loops;

public class ForLoop01 {

	public static void main(String[] args) {

		// Type code to print "Hello!" on 3 different lines

		// for( int i=10; i>5 ; i--) {
		// System.out.println(i);
		// }

//	 
//		for( int i=11; i<41 ; i++) {
//			System.out.print(i+" ");
//			
//		}
//		

//		for( int i=12; i<=120 ; i=i+1) {
//			if(i%2==0) { System.out.print(i+" "); }
//		}

//		for( int i=12; i<=120 ; i=i+2) {
//			 System.out.print(i+" ");
//			 			
//		}

		// Type all odd integers from 120 to 11 in the same line with a space between
		// consecutive integers
//		for (int i = 120; i >= 11; i = i - 1) {
//			if (i % 2 != 0) {
//				System.out.print(i + " ");
//			}
//
//		}

		// Type all integers which are divisible by 4 and divisible by 6 from 120 to 11
		// in the same line with a space between consecutive integers

//		for (int i = 120; i >= 11; i = i - 1) {
//			if (i % 4 == 0 && i % 6 == 0) {
//				System.out.print(i + " ");
//			}
//
//		}

		// Using the String "Java", type "J*a*v*a*" on the console

//		String str = "Javarrrr";
//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(str.charAt(i)+"*");
//		}

		// Type code to print all unique characters on the console from a given String

//		String str = "Javarrrr";
//		for (int i = 0; i < str.length(); i++) {
//
//			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
//				System.out.print(str.charAt(i));
//			}
//
//		}
		
		
//		
//		char ch;
//		for (int i = 0; i < str.length(); i++) {
//			
//			ch = str.charAt(i);
//			
//			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
//				System.out.print(ch);
//			}
//		}
		int number=123345556;
		int ix;
		int sum=0;
	for(int i=number; i>0; i=i/10) {
		ix=i%10;
		
		System.out.println(number.toStirng().indexOf);
		
//			if ( number.toString().indexOf(ix.toString())==number.toString().lastIndexOf(ix.toString()) ) {
//				sum=sum+i%10;
//			}
		}System.out.println(sum);
		
		
		

	}

}
