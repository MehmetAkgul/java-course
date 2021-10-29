package day20passbyvaluedatetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue01 {

	public static void main(String[] args) {

		/*
		 * 
		 * Pass by Value : If you use a variable inside a method Java creates a copy of
		 * the variable, and uses the copy of the variable instead of the original value
		 * of the variable. Java does not use the variable itself, it protects the
		 * original value of the variable. This process is called "Pass By  Value".
		 * 
		 * 
		 */

		// 1) Primitive Data Type --- İlkel Veri Türü
		// int  is immutable
		int num = 5;
		System.out.println("The value of num before the increase method " + num);
		System.out.println("The return value with increase method " + increase(num));
		System.out.println("he value of num after the increase method " + num);

		// 1) String
		// String is immutable -"değişmez"
		// If you can't update a variable assignment, it is called "immutable"

		String s = "Ali";
		System.out.println("The string before the method updateString: " + s);
		System.out.println("The return value with the method updateString: " + updateString(s));
		System.out.println("The string after the method updateString: " + s);

		// 3) Array
		// Array is "mutable"---değişken

		int arr[] = new int[3];
		arr[0] = 7;
		arr[1] = 4;
		arr[2] = 10;

		System.out.println("Array before the method " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after the method " + Arrays.toString(arr));

		// 4) List
		// List is mutable

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println("The list before the updateList " + list);
		updateList(list);
		System.out.println("The list after the methodList " + list);

	}

	public static int increase(int i) {

		return i + 5;
	}

	public static String updateString(String s) {

		return s + "!";
	}

	public static List<Integer> updateList(List<Integer> list) {
		list.remove(0);
		return list;
	}
}
