package day18multidimensionalarraylist;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// Convert a 2 dimensional array to 1 dimensional array

		int arr[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9,10,11 } };

		

		int newarrlength = 0;
		for (int[] x : arr) {
			newarrlength += x.length;
		}
		int n[] = new int[newarrlength];
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
