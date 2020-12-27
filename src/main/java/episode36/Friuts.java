package episode36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Collections - List & Set
public class Friuts {
	public static void main(String[] args) {
		//		List<Integer> myList = new ArrayList<Integer>();
		//		myList.add(2);
		//		Integer integer = myList.get(0);

		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("pine");
		list.add("grape");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
		//		boolean empty = list.isEmpty();
		//		System.out.println("is empty: "+empty);
		//		list.clear();
		//		System.out.println(list.isEmpty());


		//		String firstValue = list.get(0);
		//		System.out.println(firstValue);
		//		
		//		boolean contains = list.contains("pine");
		//		System.out.println("Has fruit: "+contains);
		//		// before removing
		//		for (String eachFruit : list) {
		//			System.out.println(eachFruit);
		//		}
		//		boolean remove = list.remove("apple");
		//		System.out.println("is Removed: "+remove);
		//		System.out.println("-----------");
		//		// after removing
		//		for (String eachFruit : list) {
		//			System.out.println(eachFruit);
		//		}
		//		int size = list.size();
		//		System.out.println("Size: "+size);

		//		Set<String> set = new HashSet<String>();
		//		set.add("apple");
		//		set.add("mango");
		//		set.add("apple");
		//		set.add("pine");
		//		set.add("grape");
		//		List<String> myList = new ArrayList<String>(set);
		//		for (String data : myList) {
		//			System.out.println(data);
		//		}
		//		String string = myList.get(0);
		//		System.out.println(string);



		//		// no get
		//		boolean contains = set.contains("pine");
		//		System.out.println(set.isEmpty());
		//		set.clear();
		//		System.out.println(set.size());
		//		for (String oneFr : set) {
		//			System.out.println(oneFr);
		//		}



















	}

}
