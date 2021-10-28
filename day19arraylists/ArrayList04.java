package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// Find the closest 2 integers in the given list

		List<Integer> list1 = new ArrayList<>();

		list1.add(13);
		list1.add(7);
		list1.add(21);
		list1.add(31);
		list1.add(25);

		System.out.println(list1);

		// Tosort a list we use Collections.sort()
		Collections.sort(list1);

		System.out.println(list1);

		int dif = 0;
		int mindif = Integer.MAX_VALUE;

		
		//1st way-----------------
		for (int i = 1; i < list1.size(); i++) {

			dif = list1.get(i) - list1.get(i - 1);
 			if (dif < mindif) {
				mindif = dif;
			}
		}
		for (int i = 1; i < list1.size(); i++) {
			 
			if ((list1.get(i) - list1.get(i - 1))== mindif) {
				System.out.println(list1.get(i) + "-" + list1.get(i - 1) + "=" + dif);
				System.out.println("closest 2 integers: "+list1.get(i-1)+" and "+list1.get(i));
			}
		}
		//2st way-----------------
		
		for (int i = 1; i < list1.size(); i++) {

			mindif = Math.min(mindif,list1.get(i) - list1.get(i - 1));
 			if (dif < mindif) {
				mindif = dif;
			}
		}
		
		for (int i = 1; i < list1.size(); i++) {
			 
			if ((list1.get(i) - list1.get(i - 1))== mindif) {
				System.out.println(list1.get(i) + "-" + list1.get(i - 1) + "=" + dif);
				System.out.println("closest 2 integers: "+list1.get(i-1)+" and "+list1.get(i));
			}
		}
		
		
		System.out.println("the difference of the two nearest integers in the list= "+mindif);

	}

}
