package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// Increase the value of every by 3 except 7

		List<Integer> list1 = new ArrayList<>();

		list1.add(5);
		list1.add(8);
		list1.add(9);
		list1.add(11);
		list1.add(12);

		System.out.println(deleteOddsMultiplyEvensBy5(list1));

	}

	public static List<Integer> deleteOddsMultiplyEvensBy5(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 2 == 1) {
				list.remove(i);
				i--;
			} else {
				list.set(i, list.get(i) * 5);
			}
		}
		return list;
	}

}
