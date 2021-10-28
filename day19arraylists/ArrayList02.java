package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// How to check if a collection of given elements exist in a list
		// ["A", "M", "C", "K", "B"] ==> Check if "A", and "C", and "K" exist in the
		// list

		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");

		System.out.println(list1);

		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("K");

		// We use ContainsAll() to check if a list contains another list
		System.out.println(list1.containsAll(list2));

		// 2nd way
		// If you use asList(), the length will not be changed
		System.out.println(list1.containsAll(Arrays.asList("A", "C", "K")));

		List<Integer> list3 = Arrays.asList(3, 4, 6, 8);

		//	list3.add(9);
		//	System.out.println(list3);
		//  list3.remove(0);

		System.out.println(list1);
			//1st way
		int indOfC = list1.indexOf("C");
		list1.remove(indOfC);
		list1.add(indOfC, "D");
		System.out.println(list1);
		//2nd way
		
		list1.set(indOfC, "d");
		System.out.println(list1);
	}

}
