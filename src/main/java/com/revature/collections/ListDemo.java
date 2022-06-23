package com.revature.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Shallan");
		myList.add("Kaladin");
		myList.add("Dalinar");
		myList.add("Renarin");
		myList.add("Shallan");
		myList.add("Jasnah");
		// myList.add(16);
		
		System.out.println(myList);
//		for(int i=0; i<myList.size(); i++) {
//			System.out.print(myList.get(i)+",");
//		}
//		System.out.println("");
//		Iterator myListItr = myList.iterator();
//		while(myListItr.hasNext()) {
//			System.out.print(myListItr.next()+ "-");
//		}
//
//		System.out.println("");
//		for (String s:myList) 
//			System.out.print(s+"#");
		myList.remove("Shallan");
		myList.add("Lift");
		System.out.println(myList);
	
	}
}
