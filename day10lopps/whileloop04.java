package day10lopps;

import java.util.Scanner;

public class whileloop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WhileLoop04
//		Type java code by using while loop,
//		Write a program to count the factors of an integer which is entered by user.
//		Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
//		Factors of 8 = 1, 2, 4, 8 ==> 4

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter to number :");
		int num = scan.nextInt();

		int i = 1;
		int counter = 0;

		while (i <= num) {
			if (num % i == 0) {
				counter++;
				System.out.print(i + ", ");
			}
			i++;
		}
		System.out.print( " the number of factors ==> "+counter);
		scan.close();
	}

}
