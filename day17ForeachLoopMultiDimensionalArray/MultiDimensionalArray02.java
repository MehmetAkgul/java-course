package day17ForeachLoopMultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Print the elements which have "a" from a 2 dimensional String array

		String arr1[][] = { { "learn", "java", "it" }, { "is", "easy" } };

		for (String[] w : arr1) {
			for (String k : w) {
				if (k.contains("a")) {
					System.out.println(k + " ");
				}
			}
		}

		// Convert a 2 dimensional array to 1 dimensional array

		int arr[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		int n[] = new int[9];
		int i = 0;
		for (int[] w : arr) {

			for (int t : w) {
				n[i] = t;
				i++;
			}
		}
		System.out.println(Arrays.toString(n));

	}

}
