package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("Brooke");
		myList.add("Nicholas");
		myList.add("Archerie");
		myList.add("Zidan");
		myList.add("August");
		myList.add("Rebecca");
		
		System.out.println(myList);
		
		Collections.sort(myList);
		System.out.println(myList);
		
		Collections.reverse(myList);
		System.out.println(myList);
		
		Collections.sort(myList, Collections.reverseOrder());
		System.out.println(myList);
		
		
	}
}
