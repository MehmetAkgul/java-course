package day17ForeachLoopMultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// How to create multidimensional array
		// Çok boyutlu dizi nasıl oluşturulur
		// If you following syntax to create multidimensional array
		// inner arrays must have same number of elements

		int arr1[][] = new int[3][2];

		System.out.println(Arrays.deepToString(arr1));

		arr1[0][0] = 2;
		arr1[0][1] = 3;
		arr1[1][0] = 10;
		arr1[1][1] = 10;
		arr1[2][0] = 7;
		arr1[2][1] = -2;
		System.out.println(Arrays.deepToString(arr1));

		// If you use Arrays.toString() for multidimensional arrays
		// you cannot see the elements, you will see the references on the console
		int arr2[][] = { { 2, 11 }, { 5, -3, 10, 21, -8, 5 } };
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.toString(arr2));

		// Find to same of all elements in an integer 2 dimensional array

		int arr3[][] = { { 5, -2, 3 }, { 7 }, { 11, 45 } };

		int sum=0;
		for (int[] w : arr3) {
			for (int s : w) {
				sum+=s;
				
			}
		}
		System.out.println((sum));
	}

}
