package day18multidimensionalarraylist;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		// Find the maximum element in a 2 dimensional array


		int arr[][] = { { 2, 6 }, { 9, 1, 11 }, { 7, 13, 2 } };

 
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
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		System.out.println("The biggest element: "+n[n.length-1]);
		
		// Second way
		
		
		int a = Integer.MIN_VALUE;
		
		for(int[] w : arr) {
			for(int x : w) {
				if(a<x) {
					a=x;
				}
			}
		}
		System.out.println("The biggest element: "+a);
	}

}
