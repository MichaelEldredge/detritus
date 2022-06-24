package com.revature.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListVsHashSet {
	public static void main(String[] args) {
		ArrayList<Integer> myList= new ArrayList<Integer>();
		HashSet<Integer> mySet = new HashSet<Integer>();
		
		for(int i = 0; i < 3; i++) {
			myList.add(i);
			mySet.add(-i);
		}
		
		Iterator listIt = myList.iterator();
		Iterator setIt = myList.iterator();
		while (listIt.hasNext())
			System.out.print(listIt.next()+ " ");
		System.out.println();
		while (setIt.hasNext())
			System.out.print(setIt.next()+ " ");
	}
}
