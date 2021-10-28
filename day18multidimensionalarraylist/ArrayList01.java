package day18multidimensionalarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		List<Integer> list3 = new ArrayList<>();
		list3.add(8);
		list3.add(4);
		list3.add(5);
		list3.add(100);
		list3.add(0);

		
		list3.add(2, 99);;

		list3.size();
		System.out.println(list3);
		System.out.println(list3.size());
		System.out.println(list3.isEmpty());
		System.out.println(list3.contains(100));
		System.out.println(list3.contains(0));
 
		list3.remove(0);
		
		List<String> list4= new ArrayList<>();
		list4.add("Ali Han");
		list4.add("Veli Han");
		list4.add("Kemal Efe");
		System.out.println(list4);
		
		list4.remove("Veli Han");
		System.out.println(list4);
		
	}

}
