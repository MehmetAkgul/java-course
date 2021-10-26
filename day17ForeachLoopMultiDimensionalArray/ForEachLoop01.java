package day17ForeachLoopMultiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop01 {

	public static void main(String[] args) {

		// 1.Example : Find the vowels in a String by using arrays
		// 1.Örnek: Dizileri kullanarak bir String'deki ünlüleri bulun

		String s = "Learn Java, earn money.";

		String chars[] = s.split("");
		// System.out.println(Arrays.toString(chars));

		for (String w : chars) {
			if ((w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") || w.equalsIgnoreCase("i")
					|| w.equalsIgnoreCase("o") || w.equalsIgnoreCase("u"))) {
				System.out.println(w + ", ");
			}
		}

		// 2.Example : Print the words ending with "n"
		// 2.Örnek: "n" ile biten kelimeleri yazdır

		String t = "Learn Java, earn money";

		System.out.println(t);
		t = t.replaceAll("\\p{Punct}", "");// deletes all punctuation marks
		System.out.println(t);

		String chars1[] = s.split(" ");
		// System.out.println(Arrays.toString(chars));

		for (String w : chars1) {
			if (w.endsWith("n") || w.endsWith("N")) {
				System.out.print(w + " ");
			}
		}

		// 3. Example: Find the sum of the digits of an integer given by user by using
		// arrays.
		// 3. Örnek: Kullanıcı tarafından verilen bir tamsayının rakamlarının toplamını
		// dizileri kullanarak bulun.
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer...");

		String n = scan.next(); // we get it as a string

		String digits[] = n.split(""); // then we convert to array

		System.out.println(Arrays.toString(digits));

		int sum = 0;

		for (String w : digits) { // then we collect one by one

			sum = sum + Integer.valueOf(w);
		}
		System.out.println(sum);
		scan.close();
	}

}
