package com.revature.listassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> myList1 = new ArrayList<Integer>();
		ArrayList<Integer> myList2 = new ArrayList<Integer>();
		
		// add()
		System.out.println("add()");
		for(int i = 0; i < 5; i++) myList1.add(i);
		for(int i = 0; i > -5; i--) myList2.add(i);
		System.out.println(myList1);
		System.out.println(myList2);
		System.out.println();
		
		// addAll()
		System.out.println("addAll()");
		myList1.addAll(myList2);
		System.out.println(myList1);
		System.out.println();
		
		// clear()
		System.out.println("clear()");
		myList1.clear();
		System.out.println(myList1);
		System.out.println();
		
		// contains()
		System.out.println("contains()");
		System.out.println(myList1.contains(0));
		System.out.println(myList2.contains(0));
		System.out.println();
		
		// equals()
		System.out.println("equals()");
		System.out.println(myList1.equals(myList2));
		System.out.println();
		
		// isEmpty
		System.out.println("isEmpty()");
		System.out.println(myList1.isEmpty());
		System.out.println(myList2.isEmpty());
		System.out.println();
		
		// iterator()
		System.out.println("iterator()");
		Iterator<Integer> myIt = myList2.iterator();
		while (myIt.hasNext())
			System.out.print(myIt.next()+" ");
		System.out.println();
		System.out.println();
		
		// remove()
		System.out.println("remove()");
		System.out.println(myList2.remove(1));
		System.out.println(myList2);
		System.out.println();
		
		// removeAll()
		System.out.println("removeAll()");
		myList1.add(1);
		myList1.add(0);
		myList1.add(-3);
		myList2.removeAll(myList1);
		System.out.println(myList2);
		System.out.println();
		
		// size()
		System.out.println("size()");
		System.out.println(myList1.size());
		System.out.println(myList2.size());
		System.out.println();
	}
}

